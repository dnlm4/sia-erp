# Etapa 1: Build con Gradle y JDK 21
FROM gradle:8.4.0-jdk21 AS builder
WORKDIR /app

# Copiar los archivos de configuración primero para aprovechar caché
COPY build.gradle.kts settings.gradle.kts ./
COPY gradle ./gradle

# Descargar dependencias (fallar silenciosamente si aún no hay código fuente)
RUN gradle build --no-daemon || true

# Copiar el resto del código fuente
COPY . .

# Compilar el proyecto y generar el .jar ejecutable
RUN gradle bootJar --no-daemon

# Etapa 2: Imagen final con solo el JAR y JRE
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copiar el jar generado desde el builder
COPY --from=builder /app/build/libs/*.jar app.jar

# Exponer el puerto (lo manejas por docker-compose, pero opcional aquí)
EXPOSE 8080

# Ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]

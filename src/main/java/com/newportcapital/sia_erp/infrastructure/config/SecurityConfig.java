package com.newportcapital.sia_erp.infrastructure.config;

import com.newportcapital.sia_erp.application.user.port.in.GetUsersUseCase;
import com.newportcapital.sia_erp.infrastructure.security.JwtTokenFilter;
import com.newportcapital.sia_erp.infrastructure.security.JwtTokenProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private final JwtTokenProvider jwtTokenProvider;
    private final GetUsersUseCase getUsersUseCase;

    public SecurityConfig(JwtTokenProvider jwtTokenProvider, GetUsersUseCase getUsersUseCase) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.getUsersUseCase = getUsersUseCase;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        JwtTokenFilter jwtTokenFilter = new JwtTokenFilter(jwtTokenProvider,getUsersUseCase);

        http
                .csrf(AbstractHttpConfigurer::disable)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auths -> auths
                        .requestMatchers("/auth/login",
                                "/swagger-ui/**",
                                "/swagger-ui.html",
                                "/v3/api-docs/**").permitAll()
                        .anyRequest().authenticated()
                )
                .addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}

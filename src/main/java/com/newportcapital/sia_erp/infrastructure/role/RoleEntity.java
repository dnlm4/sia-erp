package com.newportcapital.sia_erp.infrastructure.role;

import com.newportcapital.sia_erp.domain.model.rol.RoleId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "rol")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "fecha_creacion")
    private LocalDate creationDate;
    @Column(name = "fecha_edicion")
    private LocalDate editionDate;

}

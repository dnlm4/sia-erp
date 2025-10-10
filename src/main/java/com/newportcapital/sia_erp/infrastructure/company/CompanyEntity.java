package com.newportcapital.sia_erp.infrastructure.company;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "empresa")
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="nombre_corto")
    private String shortName;
    @Column(name="razon_social")
    private String companyName;
    @Column(name="original_id")
    private String originalId;
}

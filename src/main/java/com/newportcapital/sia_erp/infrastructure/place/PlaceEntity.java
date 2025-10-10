package com.newportcapital.sia_erp.infrastructure.place;

import com.newportcapital.sia_erp.infrastructure.company.CompanyEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "sitio")
public class PlaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="nombre_corto")
    private String shortName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="empresa_id")
    private CompanyEntity companyId;


}

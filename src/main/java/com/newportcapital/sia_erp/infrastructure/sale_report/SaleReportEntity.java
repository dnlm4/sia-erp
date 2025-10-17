package com.newportcapital.sia_erp.infrastructure.sale_report;


import com.newportcapital.sia_erp.infrastructure.company.CompanyEntity;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "informe_venta")
public class SaleReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="fecha_baja_sap")
    private LocalDateTime disposalReportDate;
    @Column(name="estado")
    private String status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="empresa_id")
    private CompanyEntity companyEntity;
    @Column(name="fecha_creacion")
    private LocalDateTime creationDate;
    @Column(name="fecha_edicion")
    private LocalDateTime editionDate;
    @Column(name="fecha_aprobacion_salida")
    private LocalDateTime approvalExitDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_aprobacion_salida_id")
    private UserEntity approvalExitUserEntity;
    @Column(name="fecha_despacho")
    private LocalDateTime dispatchDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_despacho_id")
    private UserEntity dispatchUserEntity;
    @Column(name="fecha_revision")
    private LocalDateTime revisionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_revision_id")
    private UserEntity revisionUserEntity;
    @Column(name="fecha_validacion")
    private LocalDateTime validationDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_validacion_id")
    private UserEntity validationUserEntity;
    @Column(name="fecha_aprobacion")
    private LocalDateTime approvalDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_aprobacion_id")
    private UserEntity approvalUserEntity;
    @Column(name="fecha_recepcion")
    private LocalDateTime receptionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_recepcion_id")
    private UserEntity receptionUserEntity;
    @Column(name="fecha_finalizacion")
    private LocalDateTime completionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_finalizacion_id")
    private UserEntity completionUserEntity;
}

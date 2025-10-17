package com.newportcapital.sia_erp.infrastructure.sale_report.SaleReportItem;

import com.newportcapital.sia_erp.domain.model.sale_report.SaleReport;
import com.newportcapital.sia_erp.infrastructure.disposal_report.DisposalReportEntity;
import com.newportcapital.sia_erp.infrastructure.sale_report.SaleReportEntity;
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
@Table(name="informe_venta_elemento")
public class SaleReportItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float igv;
    @Column(name="precio_base")
    private Float priceBase;
    @Column(name="aprobacion_salida")
    private String approvalExit;
    @Column(name="observacion_aprobacion_salida")
    private String approvalExitObservation;
    @Column(name="despacho")
    private String dispatch;
    @Column(name="observacion_despacho")
    private String dispatchObservation;
    @Column(name="inventariado")
    private String inventoried;
    @Column(name="observacion_inventariado")
    private String inventoriedObservation;
    @Column(name="entregado")
    private String delivered;
    @Column(name="observacion_entregado")
    private String deliveredObservation;
    @Column(name="estado")
    private String status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="informe_venta_id")
    private SaleReportEntity salesReportEntity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="informe_baja_elemento_id")
    private DisposalReportEntity disposalReportEntity;
    @Column(name="cantidad_aprobacion_salida")
    private Integer approvalExitQuantity;
    @Column(name="cantidad_despacho")
    private Integer dispatchQuantity;
    @Column(name="cantidad_inventariado")
    private Integer inventoriedQuantity;
    @Column(name="observacion_cantidad_aprobacion_salida")
    private String approvalExitQuantityObservation;
    @Column(name="observacion_cantidad_despacho")
    private String dispatchQuantityObservation;
    @Column(name="observacion_cantidad")
    private String quantityObservation;
    @Column(name="ultimo_stock")
    private Integer lastStock;
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
    @Column(name="fecha_rechazo_aprobacion_salida")
    private LocalDateTime approvalExitRejectionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_rechazo_aprobacion_salida_id")
    private UserEntity approvalExitRejectionUserEntity;
    @Column(name="fecha_rechazo_despacho")
    private LocalDateTime dispatchRejectionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_rechazo_despacho_id")
    private UserEntity dispatchRejectionUserEntity;
    @Column(name="fecha_rechazo_revision")
    private LocalDateTime revisionRejectionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_rechazo_revision_id")
    private UserEntity revisionRejectionUserEntity;
    @Column(name="fecha_rechazo_validacion")
    private LocalDateTime validationRejectionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_rechazo_validacion_id")
    private UserEntity validationRejectionUserEntity;
    @Column(name="fecha_rechazo_aprobacion")
    private LocalDateTime approvalRejectionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_rechazo_aprobacion_id")
    private UserEntity approvalRejectionUserEntity;
    @Column(name="fecha_rechazo_recepcion")
    private LocalDateTime receptionRejectionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_rechazo_recepcion_id")
    private UserEntity receptionRejectionUserEntity;
}

package com.newportcapital.sia_erp.infrastructure.disposal_report.disposal_report_item;

import com.newportcapital.sia_erp.infrastructure.disposal_report.DisposalReportEntity;
import com.newportcapital.sia_erp.infrastructure.persistance.entity.DisposalItemReasonEntity;
import com.newportcapital.sia_erp.infrastructure.persistance.entity.ElementCategoryEntity;
import com.newportcapital.sia_erp.infrastructure.persistance.entity.ElementTypeEntity;
import com.newportcapital.sia_erp.infrastructure.persistance.entity.StatusCommentEntity;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "informe_baja_elemento")
public class DisposalReportItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="codigo_activo")
    private String activeCode;
    @Column(name="numero_serie")
    private String serialNumber;
    @Column(name="modelo")
    private String model;
    @Column(name="procesador")
    private String processor;
    @Column(name="capacidad_disco")
    private Integer diskCapacity;
    @Column(name="capacidad_ram")
    private Integer ramCapacity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="informe_baja_id")
    private DisposalReportEntity disposalReportEntity;
    @Column(name="equipo")
    private String equipment;
    @Column(name="marca")
    private String brand;
    @Column(name="estado")
    private String status;
    @Column(name="recomendacion")
    private String recommendation;
    @Column(name="comentario_otro")
    private String otherComment;
    @Column(name="sub_codigo")
    private String subCode;
    @Column(name="sustento")
    private String supportDisposal;
    @Column(name="observacion")
    private String observation;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="motivo_baja_elemento_id")
    private DisposalItemReasonEntity disposalItemReasonEntity;
    @Column(name="autorizacion")
    private String authorization;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="categoria_elemento_id")
    private ElementCategoryEntity elementCategoryEntity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tipo_elemento_id")
    private ElementTypeEntity elementTypeEntity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="comentario_estado_id")
    private StatusCommentEntity statusCommentEntity;
    @Column(name="cantidad")
    private Integer quantity;
    @Column(name="cantidad_sin_venta")
    private Integer quantityUnsold;
    @Column(name="estado_venta")
    private String saleStatus;
    @Column(name="fecha_creacion")
    private LocalDateTime creationDate;
    @Column(name="fecha_edicion")
    private LocalDateTime editionDate;
    @Column(name="fecha_validacion")
    private LocalDateTime validationDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_validador_id")
    private UserEntity validatorUserEntity;
    @Column(name="fecha_aprobacion_1")
    private LocalDateTime approvalDate1;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_aprobador_1_id")
    private UserEntity approverUser1Entity;
    @Column(name="fecha_aprobacion_2")
    private LocalDateTime approvalDate2;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_aprobador_2_id")
    private UserEntity approverUser2Entity;
    @Column(name="fecha_enviado_gg")
    private LocalDateTime ggSentDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_enviador_gg_id")
    private UserEntity ggSenderUserEntity;
    @Column(name="fecha_aprobado_gg")
    private LocalDateTime ggApprovalDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_aprobador_gg_id")
    private UserEntity ggApproverUserEntity;
    @Column(name="fecha_rechazo")
    private LocalDateTime rejectionDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_rechazador_id")
    private UserEntity rejectUserEntity;
}

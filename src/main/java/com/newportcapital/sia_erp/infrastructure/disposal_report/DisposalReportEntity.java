package com.newportcapital.sia_erp.infrastructure.disposal_report;

import com.newportcapital.sia_erp.infrastructure.department.DepartmentEntity;
import com.newportcapital.sia_erp.infrastructure.persistance.entity.ReferenceEntity;
import com.newportcapital.sia_erp.infrastructure.place.PlaceEntity;
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
@Table(name = "informe_baja")
public class DisposalReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="fecha_baja")
    private LocalDateTime disposalReportDate;
    @Column(name="estado")
    private String status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="departamento_id")
    private DepartmentEntity DepartmentEntity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="sitio_id")
    private PlaceEntity PlaceEntity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="referencia_id")
    private ReferenceEntity referenceEntity;
    @Column(name="fecha_creacion")
    private LocalDateTime creationDate;
    @Column(name="fecha_edicion")
    private LocalDateTime editionDate;
    @Column(name="fecha_validacion")
    private LocalDateTime validationDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_validador_id")
    private UserEntity validatorUserEnty;
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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_id_creacion")
    private UserEntity creatorUserentity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_id_edicion")
    private UserEntity editorUserEntity;
}

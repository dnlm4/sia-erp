package com.newportcapital.sia_erp.infrastructure.user.persistance.entity;


import com.newportcapital.sia_erp.infrastructure.department.DepartmentEntity;
import com.newportcapital.sia_erp.infrastructure.place.PlaceEntity;
import com.newportcapital.sia_erp.infrastructure.role.RoleEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "usuario")
    private String user;
    @Column(name = "clave")
    private String password;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellido_paterno")
    private String paternalSurname;
    @Column(name = "apellido_materno")
    private String maternalSurname;
    @Column(name = "correo")
    private String email;
    @Column(name = "estado")
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rol_id")
    private RoleEntity role;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departamento_id")
    private DepartmentEntity department;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sitio_id")
    private PlaceEntity place;
    @Column(name = "recibir_validacion")
    private String receiveValidation;
    @Column(name = "recibir_creacion")
    private String receiveCreation;
    @Column(name = "recibir_aprobacion1")
    private String receiveApproval1;
    @Column(name = "recibir_aprobacion2")
    private String receiveApproval2;
    @Column(name = "recibir_validacion_venta")
    private String receiveSalesValidation;
    @Column(name = "recibir_seguridad_venta")
    private String receiveSecuritySale;
    @Column(name = "fecha_creacion")
    private LocalDate creationDate;
    @Column(name = "fecha_edicion")
    private LocalDate editionDate;
    @Column(name = "usuario_id_creacion")
    private Integer creatorUserId;
    @Column(name = "usuario_id_edicion")
    private Integer editorUserId;
    @Column(name = "area_planta_id")
    private Integer areaPlantaId;
    @Column(name = "puede_despachar")
    private String canDispatch;
    @Column(name = "revision_fisica")
    private String equipmentReview;

    public String getPaternalSurnameOrDefault() {
        return paternalSurname != null ? paternalSurname : "";
    }
    public String getMaternalSurnameOrDefault() {
        return maternalSurname != null ? maternalSurname : "";
    }
    public String getEmailOrDefault() {
        return email != null ? email : "";
    }

    public Integer getRoleIdOrDefault() {
        return role != null ? role.getId() : 0;
    }
    public Integer getDepartmentIdOrDefault() {
        return department != null ? department.getId() : 0;
    }
    public Integer getPlaceIdOrDefault() {
        return place != null ? place.getId() : 0;
    }
    public String getReceiveValidationOrDefault() {
        return receiveValidation != null ? receiveValidation : "";
    }
    public String getReceiveCreationOrDefault() {
        return receiveCreation != null ? receiveCreation : "";
    }
    public String getReceiveApproval1OrDefault() {
        return receiveApproval1 != null ? receiveApproval1 : "";
    }
    public String getReceiveApproval2OrDefault() {
        return receiveApproval2 != null ? receiveApproval2 : "";
    }
    public String getReceiveSalesValidationOrDefault() {
        return receiveSalesValidation != null ? receiveSalesValidation : "";
    }
    public String getReceiveSecuritySaleOrDefault() {
        return receiveSecuritySale != null ? receiveSecuritySale : "";
    }


}

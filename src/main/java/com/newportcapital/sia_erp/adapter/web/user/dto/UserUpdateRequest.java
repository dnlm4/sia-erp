package com.newportcapital.sia_erp.adapter.web.user.dto;

import com.newportcapital.sia_erp.domain.model.department.Department;
import com.newportcapital.sia_erp.domain.model.place.Place;
import com.newportcapital.sia_erp.domain.model.rol.Role;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserUpdateRequest {
    private String user;
    private String password;
    private String name;
    private String paternalSurname;
    private String maternalSurname;
    private String email;
    private String status;
    private Role role;
    private Department department;
    private Place place;
    private String receiveValidation;
    private String receiveCreation;
    private String receiveApproval1;
    private String receiveApproval2;
    private String receiveSalesValidation;
    private String receiveSecuritySale;
    private LocalDateTime creationDate;
    private LocalDateTime editionDate;
    private Integer creatorUserId;
    private Integer editorUserId;
    private Integer areaPlantaId;
    private String canDispatch;
    private String equipmentReview;
}

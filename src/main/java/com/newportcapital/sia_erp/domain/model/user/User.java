package com.newportcapital.sia_erp.domain.model.user;

import com.newportcapital.sia_erp.domain.model.department.Department;
import com.newportcapital.sia_erp.domain.model.place.Place;
import com.newportcapital.sia_erp.domain.model.rol.Role;

import java.time.LocalDate;

public class User {
    private UserId id;
    private String user;
    private String password;
    private String name;
    private String paternal_surname;
    private String maternal_surname;
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
    private LocalDate creationDate;
    private LocalDate editionDate;
    private Integer creatorUserId;
    private Integer editorUserId;
    private Integer areaPlantaId;
    private String canDispatch;
    private String equipmentReview;

    public User() {
    }

    public User(UserId id, String user, String password, String name, String paternal_surname, String maternal_surname, String email, String status, Role role, Department department, Place place, String receiveValidation, String receiveCreation, String receiveApproval1, String receiveApproval2, String receiveSalesValidation, String receiveSecuritySale, LocalDate creationDate, LocalDate editionDate, Integer creatorUserId, Integer editorUserId, Integer areaPlantaId, String canDispatch, String equipmentReview) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.name = name;
        this.paternal_surname = paternal_surname;
        this.maternal_surname = maternal_surname;
        this.email = email;
        this.status = status;
        this.role = role;
        this.department = department;
        this.place = place;
        this.receiveValidation = receiveValidation;
        this.receiveCreation = receiveCreation;
        this.receiveApproval1 = receiveApproval1;
        this.receiveApproval2 = receiveApproval2;
        this.receiveSalesValidation = receiveSalesValidation;
        this.receiveSecuritySale = receiveSecuritySale;
        this.creationDate = creationDate;
        this.editionDate = editionDate;
        this.creatorUserId = creatorUserId;
        this.editorUserId = editorUserId;
        this.areaPlantaId = areaPlantaId;
        this.canDispatch = canDispatch;
        this.equipmentReview = equipmentReview;
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean isNew() {
        return id == null;
    }

    public UserId getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPaternal_surname() {
        return paternal_surname;
    }

    public String getMaternal_surname() {
        return maternal_surname;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public Role getRole() {
        return role;
    }

    public Department getDepartment() {
        return department;
    }

    public Place getPlace() {
        return place;
    }

    public String getReceiveValidation() {
        return receiveValidation;
    }

    public String getReceiveCreation() {
        return receiveCreation;
    }

    public String getReceiveApproval1() {
        return receiveApproval1;
    }

    public String getReceiveApproval2() {
        return receiveApproval2;
    }

    public String getReceiveSalesValidation() {
        return receiveSalesValidation;
    }

    public String getReceiveSecuritySale() {
        return receiveSecuritySale;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getEditionDate() {
        return editionDate;
    }

    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    public Integer getEditorUserId() {
        return editorUserId;
    }

    public Integer getAreaPlantaId() {
        return areaPlantaId;
    }

    public String getCanDispatch() {
        return canDispatch;
    }

    public String getEquipmentReview() {
        return equipmentReview;
    }
}

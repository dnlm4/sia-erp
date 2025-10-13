package com.newportcapital.sia_erp.adapter.web.authentication.dto;





public class UserTokenPayload {
    private Integer id;
    private String user;
    private String password;
    private String name;
    private String paternalSurname;
    private String maternalSurname;
    private String email;
    private Integer roleId;
    private Integer departmentId;
    private Integer placeId;
    private String receiveValidation;
    private String receiveCreation;
    private String receiveApproval1;
    private String receiveApproval2;
    private String receiveSalesValidation;
    private String receiveSecuritySale;

    public UserTokenPayload(Integer id, String user, String password, String name, String paternalSurname, String maternalSurname, String email, Integer roleId, Integer departmentId, Integer placeId, String receiveValidation, String receiveCreation, String receiveApproval1, String receiveApproval2, String receiveSalesValidation, String receiveSecuritySale) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.name = name;
        this.paternalSurname = paternalSurname;
        this.maternalSurname = maternalSurname;
        this.email = email;
        this.roleId = roleId;
        this.departmentId = departmentId;
        this.placeId = placeId;
        this.receiveValidation = receiveValidation;
        this.receiveCreation = receiveCreation;
        this.receiveApproval1 = receiveApproval1;
        this.receiveApproval2 = receiveApproval2;
        this.receiveSalesValidation = receiveSalesValidation;
        this.receiveSecuritySale = receiveSecuritySale;
    }

    public Integer getId() {
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

    public String getPaternalSurname() {
        return paternalSurname;
    }

    public String getMaternalSurname() {
        return maternalSurname;
    }

    public String getEmail() {
        return email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public Integer getPlaceId() {
        return placeId;
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

}

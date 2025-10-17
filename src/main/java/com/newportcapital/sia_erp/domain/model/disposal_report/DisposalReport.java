package com.newportcapital.sia_erp.domain.model.disposal_report;




import com.newportcapital.sia_erp.domain.model.department.Department;
import com.newportcapital.sia_erp.domain.model.place.Place;
import com.newportcapital.sia_erp.domain.model.reference.Reference;
import com.newportcapital.sia_erp.domain.model.user.User;

import java.time.LocalDateTime;

public class DisposalReport {
    private Integer id;
    private LocalDateTime disposalReportDate;
    private String status;
    private Department Department;
    private Place Place;
    private Reference reference;
    private LocalDateTime creationDate;
    private LocalDateTime editionDate;
    private LocalDateTime validationDate;
    private User validatorUserEnty;
    private LocalDateTime approvalDate1;
    private User approverUser1;
    private LocalDateTime approvalDate2;
    private User approverUser2;
    private LocalDateTime ggSentDate;
    private User ggSenderUser;
    private LocalDateTime ggApprovalDate;
    private User ggApproverUser;
    private LocalDateTime rejectionDate;
    private User rejectUser;
    private User creatorUser;
    private User editorUser;

    public DisposalReport(Integer id, LocalDateTime disposalReportDate, String status, Department department, Place place, Reference reference, LocalDateTime creationDate, LocalDateTime editionDate, LocalDateTime validationDate, User validatorUserEnty, LocalDateTime approvalDate1, User approverUser1, LocalDateTime approvalDate2, User approverUser2, LocalDateTime ggSentDate, User ggSenderUser, LocalDateTime ggApprovalDate, User ggApproverUser, LocalDateTime rejectionDate, User rejectUser, User creatorUser, User editorUser) {
        this.id = id;
        this.disposalReportDate = disposalReportDate;
        this.status = status;
        Department = department;
        Place = place;
        this.reference = reference;
        this.creationDate = creationDate;
        this.editionDate = editionDate;
        this.validationDate = validationDate;
        this.validatorUserEnty = validatorUserEnty;
        this.approvalDate1 = approvalDate1;
        this.approverUser1 = approverUser1;
        this.approvalDate2 = approvalDate2;
        this.approverUser2 = approverUser2;
        this.ggSentDate = ggSentDate;
        this.ggSenderUser = ggSenderUser;
        this.ggApprovalDate = ggApprovalDate;
        this.ggApproverUser = ggApproverUser;
        this.rejectionDate = rejectionDate;
        this.rejectUser = rejectUser;
        this.creatorUser = creatorUser;
        this.editorUser = editorUser;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDisposalReportDate() {
        return disposalReportDate;
    }

    public String getStatus() {
        return status;
    }

    public Department getDepartment() {
        return Department;
    }

    public Place getPlace() {
        return Place;
    }

    public Reference getReference() {
        return reference;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getEditionDate() {
        return editionDate;
    }

    public LocalDateTime getValidationDate() {
        return validationDate;
    }

    public User getValidatorUserEnty() {
        return validatorUserEnty;
    }

    public LocalDateTime getApprovalDate1() {
        return approvalDate1;
    }

    public User getApproverUser1() {
        return approverUser1;
    }

    public LocalDateTime getApprovalDate2() {
        return approvalDate2;
    }

    public User getApproverUser2() {
        return approverUser2;
    }

    public LocalDateTime getGgSentDate() {
        return ggSentDate;
    }

    public User getGgSenderUser() {
        return ggSenderUser;
    }

    public LocalDateTime getGgApprovalDate() {
        return ggApprovalDate;
    }

    public User getGgApproverUser() {
        return ggApproverUser;
    }

    public LocalDateTime getRejectionDate() {
        return rejectionDate;
    }

    public User getRejectUser() {
        return rejectUser;
    }

    public User getCreatorUser() {
        return creatorUser;
    }

    public User getEditorUser() {
        return editorUser;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDisposalReportDate(LocalDateTime disposalReportDate) {
        this.disposalReportDate = disposalReportDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDepartment(Department department) {
        Department = department;
    }

    public void setPlace(Place place) {
        Place = place;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setEditionDate(LocalDateTime editionDate) {
        this.editionDate = editionDate;
    }

    public void setValidationDate(LocalDateTime validationDate) {
        this.validationDate = validationDate;
    }

    public void setValidatorUserEnty(User validatorUserEnty) {
        this.validatorUserEnty = validatorUserEnty;
    }

    public void setApprovalDate1(LocalDateTime approvalDate1) {
        this.approvalDate1 = approvalDate1;
    }

    public void setApproverUser1(User approverUser1) {
        this.approverUser1 = approverUser1;
    }

    public void setApprovalDate2(LocalDateTime approvalDate2) {
        this.approvalDate2 = approvalDate2;
    }

    public void setApproverUser2(User approverUser2) {
        this.approverUser2 = approverUser2;
    }

    public void setGgSentDate(LocalDateTime ggSentDate) {
        this.ggSentDate = ggSentDate;
    }

    public void setGgSenderUser(User ggSenderUser) {
        this.ggSenderUser = ggSenderUser;
    }

    public void setGgApprovalDate(LocalDateTime ggApprovalDate) {
        this.ggApprovalDate = ggApprovalDate;
    }

    public void setGgApproverUser(User ggApproverUser) {
        this.ggApproverUser = ggApproverUser;
    }

    public void setRejectionDate(LocalDateTime rejectionDate) {
        this.rejectionDate = rejectionDate;
    }

    public void setRejectUser(User rejectUser) {
        this.rejectUser = rejectUser;
    }

    public void setCreatorUser(User creatorUser) {
        this.creatorUser = creatorUser;
    }

    public void setEditorUser(User editorUser) {
        this.editorUser = editorUser;
    }
}

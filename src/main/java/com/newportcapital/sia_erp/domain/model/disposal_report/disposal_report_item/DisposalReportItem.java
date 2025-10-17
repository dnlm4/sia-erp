package com.newportcapital.sia_erp.domain.model.disposal_report.disposal_report_item;


import com.newportcapital.sia_erp.domain.disposal_item_reason.DisposalItemReason;
import com.newportcapital.sia_erp.domain.element_category.ElementCategory;
import com.newportcapital.sia_erp.domain.element_type.ElementType;
import com.newportcapital.sia_erp.domain.status_comment.StatusComment;
import com.newportcapital.sia_erp.domain.model.disposal_report.DisposalReport;
import com.newportcapital.sia_erp.domain.model.user.User;

import java.time.LocalDateTime;

public class DisposalReportItem {
    private Integer id;
    private String activeCode;
    private String serialNumber;
    private String model;
    private String processor;
    private Integer diskCapacity;
    private Integer ramCapacity;
    private DisposalReport disposalReport;
    private String equipment;
    private String brand;
    private String status;
    private String recommendation;
    private String otherComment;
    private String subCode;
    private String supportDisposal;
    private String observation;
    private DisposalItemReason disposalItemReason;
    private String authorization;
    private ElementCategory elementCategory;
    private ElementType elementType;
    private StatusComment statusComment;
    private Integer quantity;
    private Integer quantityUnsold;
    private String saleStatus;
    private LocalDateTime creationDate;
    private LocalDateTime editionDate;
    private LocalDateTime validationDate;
    private User validatorUser;
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

    public DisposalReportItem(Integer id, String activeCode, String serialNumber, String model, String processor, Integer diskCapacity, Integer ramCapacity, DisposalReport disposalReport, String equipment, String brand, String status, String recommendation, String otherComment, String subCode, String supportDisposal, String observation, DisposalItemReason disposalItemReason, String authorization, ElementCategory elementCategory, ElementType elementType, StatusComment statusComment, Integer quantity, Integer quantityUnsold, String saleStatus, LocalDateTime creationDate, LocalDateTime editionDate, LocalDateTime validationDate, User validatorUser, LocalDateTime approvalDate1, User approverUser1, LocalDateTime approvalDate2, User approverUser2, LocalDateTime ggSentDate, User ggSenderUser, LocalDateTime ggApprovalDate, User ggApproverUser, LocalDateTime rejectionDate, User rejectUser) {
        this.id = id;
        this.activeCode = activeCode;
        this.serialNumber = serialNumber;
        this.model = model;
        this.processor = processor;
        this.diskCapacity = diskCapacity;
        this.ramCapacity = ramCapacity;
        this.disposalReport = disposalReport;
        this.equipment = equipment;
        this.brand = brand;
        this.status = status;
        this.recommendation = recommendation;
        this.otherComment = otherComment;
        this.subCode = subCode;
        this.supportDisposal = supportDisposal;
        this.observation = observation;
        this.disposalItemReason = disposalItemReason;
        this.authorization = authorization;
        this.elementCategory = elementCategory;
        this.elementType = elementType;
        this.statusComment = statusComment;
        this.quantity = quantity;
        this.quantityUnsold = quantityUnsold;
        this.saleStatus = saleStatus;
        this.creationDate = creationDate;
        this.editionDate = editionDate;
        this.validationDate = validationDate;
        this.validatorUser = validatorUser;
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
    }

    public Integer getId() {
        return id;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public Integer getDiskCapacity() {
        return diskCapacity;
    }

    public Integer getRamCapacity() {
        return ramCapacity;
    }

    public DisposalReport getDisposalReport() {
        return disposalReport;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getBrand() {
        return brand;
    }

    public String getStatus() {
        return status;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public String getOtherComment() {
        return otherComment;
    }

    public String getSubCode() {
        return subCode;
    }

    public String getSupportDisposal() {
        return supportDisposal;
    }

    public String getObservation() {
        return observation;
    }

    public DisposalItemReason getDisposalItemReason() {
        return disposalItemReason;
    }

    public String getAuthorization() {
        return authorization;
    }

    public ElementCategory getElementCategory() {
        return elementCategory;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public StatusComment getStatusComment() {
        return statusComment;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getQuantityUnsold() {
        return quantityUnsold;
    }

    public String getSaleStatus() {
        return saleStatus;
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

    public User getValidatorUser() {
        return validatorUser;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setDiskCapacity(Integer diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public void setRamCapacity(Integer ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public void setDisposalReport(DisposalReport disposalReport) {
        this.disposalReport = disposalReport;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public void setOtherComment(String otherComment) {
        this.otherComment = otherComment;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public void setSupportDisposal(String supportDisposal) {
        this.supportDisposal = supportDisposal;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public void setDisposalItemReason(DisposalItemReason disposalItemReason) {
        this.disposalItemReason = disposalItemReason;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public void setElementCategory(ElementCategory elementCategory) {
        this.elementCategory = elementCategory;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    public void setStatusComment(StatusComment statusComment) {
        this.statusComment = statusComment;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setQuantityUnsold(Integer quantityUnsold) {
        this.quantityUnsold = quantityUnsold;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
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

    public void setValidatorUser(User validatorUser) {
        this.validatorUser = validatorUser;
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
}

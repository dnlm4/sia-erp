package com.newportcapital.sia_erp.domain.model.sale_report;


import com.newportcapital.sia_erp.domain.model.company.Company;
import com.newportcapital.sia_erp.domain.model.user.User;

import java.time.LocalDateTime;

public class SaleReport {
    private final SaleReportId id;
    private LocalDateTime disposalReportDate;
    private String status;
    private Company company;
    private LocalDateTime creationDate;
    private LocalDateTime editionDate;
    private LocalDateTime approvalExitDate;
    private User approvalExitUser;
    private LocalDateTime dispatchDate;
    private User dispatchUser;
    private LocalDateTime revisionDate;
    private User revisionUser;
    private LocalDateTime validationDate;
    private User validationUser;
    private LocalDateTime approvalDate;
    private User approvalUser;
    private LocalDateTime receptionDate;
    private User receptionUser;
    private LocalDateTime completionDate;
    private User completionUser;

    public SaleReport(SaleReportId id, LocalDateTime disposalReportDate, String status, Company company, LocalDateTime creationDate, LocalDateTime editionDate, LocalDateTime approvalExitDate, User approvalExitUser, LocalDateTime dispatchDate, User dispatchUser, LocalDateTime revisionDate, User revisionUser, LocalDateTime validationDate, User validationUser, LocalDateTime approvalDate, User approvalUser, LocalDateTime receptionDate, User receptionUser, LocalDateTime completionDate, User completionUser) {
        this.id = id;
        this.disposalReportDate = disposalReportDate;
        this.status = status;
        this.company = company;
        this.creationDate = creationDate;
        this.editionDate = editionDate;
        this.approvalExitDate = approvalExitDate;
        this.approvalExitUser = approvalExitUser;
        this.dispatchDate = dispatchDate;
        this.dispatchUser = dispatchUser;
        this.revisionDate = revisionDate;
        this.revisionUser = revisionUser;
        this.validationDate = validationDate;
        this.validationUser = validationUser;
        this.approvalDate = approvalDate;
        this.approvalUser = approvalUser;
        this.receptionDate = receptionDate;
        this.receptionUser = receptionUser;
        this.completionDate = completionDate;
        this.completionUser = completionUser;
    }

    public SaleReportId getId() {
        return id;
    }

    public LocalDateTime getDisposalReportDate() {
        return disposalReportDate;
    }

    public String getStatus() {
        return status;
    }

    public Company getCompany() {
        return company;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getEditionDate() {
        return editionDate;
    }

    public LocalDateTime getApprovalExitDate() {
        return approvalExitDate;
    }

    public User getApprovalExitUser() {
        return approvalExitUser;
    }

    public LocalDateTime getDispatchDate() {
        return dispatchDate;
    }

    public User getDispatchUser() {
        return dispatchUser;
    }

    public LocalDateTime getRevisionDate() {
        return revisionDate;
    }

    public User getRevisionUser() {
        return revisionUser;
    }

    public LocalDateTime getValidationDate() {
        return validationDate;
    }

    public User getValidationUser() {
        return validationUser;
    }

    public LocalDateTime getApprovalDate() {
        return approvalDate;
    }

    public User getApprovalUser() {
        return approvalUser;
    }

    public LocalDateTime getReceptionDate() {
        return receptionDate;
    }

    public User getReceptionUser() {
        return receptionUser;
    }

    public LocalDateTime getCompletionDate() {
        return completionDate;
    }

    public User getCompletionUser() {
        return completionUser;
    }
}

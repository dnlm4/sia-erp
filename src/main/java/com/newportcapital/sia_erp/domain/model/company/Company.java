package com.newportcapital.sia_erp.domain.model.company;

import jakarta.persistence.Column;



public class Company {
    private final CompanyId companyId;
    private String name;
    private String shortName;
    private String companyName;
    private String originalId;

    public Company(CompanyId companyId, String name, String shortName, String companyName, String originalId) {
        this.companyId = companyId;
        this.name = name;
        this.shortName = shortName;
        this.companyName = companyName;
        this.originalId = originalId;
    }

    public boolean isNew() {
        return companyId == null;
    }
}

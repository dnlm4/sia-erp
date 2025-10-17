package com.newportcapital.sia_erp.domain.model.company;

import jakarta.persistence.Column;



public class Company {
    private final CompanyId id;
    private String name;
    private String shortName;
    private String companyName;
    private String originalId;


    public Company(CompanyId id, String name, String shortName, String companyName, String originalId) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.companyName = companyName;
        this.originalId = originalId;
    }

    public boolean isNew() {
        return id == null;
    }

    public CompanyId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getOriginalId() {
        return originalId;
    }
}

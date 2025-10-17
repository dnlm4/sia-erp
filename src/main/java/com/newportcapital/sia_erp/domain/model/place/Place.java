package com.newportcapital.sia_erp.domain.model.place;

import com.newportcapital.sia_erp.domain.model.company.Company;

public class Place {
    private final PlaceId id;
    private String name;
    private String shortName;
    private Company company;

    public Place(PlaceId id, String name, String shortName, Company company) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.company = company;
    }

    public PlaceId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public Company getCompany() {
        return company;
    }
}

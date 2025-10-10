package com.newportcapital.sia_erp.domain.model.company;

public class CompanyId {
    private final Integer id;
    public CompanyId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

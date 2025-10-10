package com.newportcapital.sia_erp.domain.model.area;

public class AreaId {
    private final Integer id;
    public AreaId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

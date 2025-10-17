package com.newportcapital.sia_erp.domain.model.reference;


public class ReferenceId {
    private Integer id;

    public ReferenceId(Integer id) {
        if (id == null) {
            throw new NullPointerException("id is null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

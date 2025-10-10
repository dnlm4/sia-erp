package com.newportcapital.sia_erp.domain.model.rol;

public class RoleId {
    private final Integer id;

    public RoleId(Integer id) {
        if (id == null) {
            throw new NullPointerException("id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

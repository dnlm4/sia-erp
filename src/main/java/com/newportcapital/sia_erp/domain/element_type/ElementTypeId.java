package com.newportcapital.sia_erp.domain.element_type;

public class ElementTypeId {
    private Integer id;

    public ElementTypeId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

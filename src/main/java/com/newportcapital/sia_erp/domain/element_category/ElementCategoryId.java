package com.newportcapital.sia_erp.domain.element_category;

public class ElementCategoryId {
    private Integer id;

    public ElementCategoryId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

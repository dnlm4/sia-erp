package com.newportcapital.sia_erp.domain.element_category;

public class ElementCategory {
    private final ElementCategoryId id;
    private final String description;

    public ElementCategory(ElementCategoryId id, String description) {
        this.id = id;
        this.description = description;
    }

    public ElementCategoryId getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

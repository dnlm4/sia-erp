package com.newportcapital.sia_erp.domain.element_type;

public class ElementType {
    private final ElementTypeId id;
    private final String description;

    public ElementType(ElementTypeId id, String description) {
        this.id = id;
        this.description = description;
    }

    public ElementTypeId getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

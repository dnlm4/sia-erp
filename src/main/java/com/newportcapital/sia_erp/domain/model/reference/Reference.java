package com.newportcapital.sia_erp.domain.model.reference;



public class Reference {
    private final ReferenceId id;
    private final String description;

    public Reference(ReferenceId id, String description) {
        this.id = id;
        this.description = description;
    }

    public ReferenceId getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

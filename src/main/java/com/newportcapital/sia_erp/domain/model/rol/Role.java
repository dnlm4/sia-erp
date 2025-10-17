package com.newportcapital.sia_erp.domain.model.rol;

import java.time.LocalDateTime;

public class Role {
    private final RoleId id;
    private String name;
    private LocalDateTime creationDate;
    private LocalDateTime editionDate;

    public Role(RoleId id, String name) {
        this.id = id;
        this.name = name;
    }


    public RoleId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getEditionDate() {
        return editionDate;
    }
}

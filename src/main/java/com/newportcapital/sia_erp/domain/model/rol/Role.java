package com.newportcapital.sia_erp.domain.model.rol;

import java.time.LocalDate;

public class Role {
    private final RoleId id;
    private String nombre;
    private LocalDate fecha_creacion;
    private LocalDate fecha_edicion;
    public Role(RoleId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}

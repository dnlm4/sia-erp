package com.newportcapital.sia_erp.domain.model.department;

public class DepartmentId {
    private final Integer id;
    public DepartmentId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
}

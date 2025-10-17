package com.newportcapital.sia_erp.domain.model.department;


import com.newportcapital.sia_erp.domain.model.area.Area;

public class Department {
    private final DepartmentId id;
    private String name;
    private String shortName;
    private Area area;

    public Department(DepartmentId id, String name, String shortName, Area area) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.area = area;
    }

    public DepartmentId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public Area getArea() {
        return area;
    }
}

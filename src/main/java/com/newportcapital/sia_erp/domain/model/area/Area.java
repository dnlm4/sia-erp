package com.newportcapital.sia_erp.domain.model.area;

public class Area {
    private final AreaId id;
    private String name;
    private String shortName;

    public Area(AreaId id, String name, String shortName) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
    }

    public boolean isNew() {
        return id == null;
    }

    public AreaId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
}

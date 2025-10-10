package com.newportcapital.sia_erp.domain.model.place;

public class PlaceId {
    private final Integer id;

    public PlaceId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

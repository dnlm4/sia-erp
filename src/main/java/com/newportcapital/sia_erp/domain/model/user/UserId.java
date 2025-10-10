package com.newportcapital.sia_erp.domain.model.user;

public class UserId {
    private final Integer id;

    public UserId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

}

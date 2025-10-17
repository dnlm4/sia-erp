package com.newportcapital.sia_erp.domain.status_comment;

public class StatusCommentId {
    private Integer id;

    public StatusCommentId(Integer id) {
        if (id == null) {
            throw new NullPointerException("id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

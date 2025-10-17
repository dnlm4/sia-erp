package com.newportcapital.sia_erp.domain.status_comment;

public class StatusComment {
    private final StatusCommentId id;
    private final String description;

    public StatusComment(StatusCommentId id, String description) {
        this.id = id;
        this.description = description;
    }

    public StatusCommentId getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

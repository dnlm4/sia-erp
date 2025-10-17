package com.newportcapital.sia_erp.domain.disposal_item_reason;



public class DisposalItemReason {
    private final DisposalItemReasonId id;
    private final String description;

    public DisposalItemReason(DisposalItemReasonId id, String description) {
        this.id = id;
        this.description = description;
    }

    public DisposalItemReasonId getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

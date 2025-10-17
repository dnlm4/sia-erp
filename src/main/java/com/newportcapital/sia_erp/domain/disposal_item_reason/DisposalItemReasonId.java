package com.newportcapital.sia_erp.domain.disposal_item_reason;

public class DisposalItemReasonId {
    private Integer id;

    public DisposalItemReasonId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

package com.newportcapital.sia_erp.domain.model.disposal_report;

public class DisposalReportId {
    private final  Integer id;

    public Integer getId() {
        return id;
    }

    public DisposalReportId(Integer id) {
        if(id == null) {
            throw new IllegalArgumentException("DisposalReport id cannot be null");
        }
        this.id = id;

    }
}

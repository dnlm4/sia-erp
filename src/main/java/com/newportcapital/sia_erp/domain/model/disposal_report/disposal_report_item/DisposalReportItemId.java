package com.newportcapital.sia_erp.domain.model.disposal_report.disposal_report_item;

public class DisposalReportItemId {
    private final Integer id;
    public DisposalReportItemId(Integer id) {
        if(id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        this.id = id;
    }
}

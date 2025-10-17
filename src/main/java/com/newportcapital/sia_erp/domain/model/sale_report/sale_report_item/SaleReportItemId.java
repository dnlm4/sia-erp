package com.newportcapital.sia_erp.domain.model.sale_report.sale_report_item;

public class SaleReportItemId {
    private final Integer id;

    public SaleReportItemId(Integer id) {
        if (id == null) {
            throw new NullPointerException("id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

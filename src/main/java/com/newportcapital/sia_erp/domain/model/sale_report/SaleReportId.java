package com.newportcapital.sia_erp.domain.model.sale_report;

public class SaleReportId {
    private final Integer id;
    public SaleReportId(Integer id) {
        if (id == null) {
            throw new NullPointerException("id cannot be null");
        }
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

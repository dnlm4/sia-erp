package com.newportcapital.sia_erp.domain.repository;

import com.newportcapital.sia_erp.domain.model.sale_report.SaleReportId;
import com.newportcapital.sia_erp.domain.model.sale_report.sale_report_item.SaleReportItem;

public interface SaleReportItemRepository {
    SaleReportItem findPendingBySaleReportIdWithoutRejectAndExceptFromAc(SaleReportId id);

}

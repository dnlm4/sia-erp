package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.company.Company;
import com.newportcapital.sia_erp.domain.model.company.CompanyId;
import com.newportcapital.sia_erp.infrastructure.company.CompanyEntity;

public class CompanyMapper {
    public static Company CompanyEntityToCompany(CompanyEntity companyEntity) {
        return new Company(new CompanyId(companyEntity.getId()),
                companyEntity.getName(),
                companyEntity.getShortName(),
                companyEntity.getCompanyName(),
                companyEntity.getOriginalId());
    }
}

package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.company.Company;
import com.newportcapital.sia_erp.domain.model.company.CompanyId;
import com.newportcapital.sia_erp.infrastructure.company.CompanyEntity;
import org.springframework.stereotype.Component;


@Component
public class CompanyMapper {
    public Company CompanyEntityToCompany(CompanyEntity companyEntity) {
        if (companyEntity == null) return null;
        return new Company(new CompanyId(companyEntity.getId()),
                companyEntity.getName(),
                companyEntity.getShortName(),
                companyEntity.getCompanyName(),
                companyEntity.getOriginalId());
    }
    public CompanyEntity CompanyToCompanyEntity(Company companyModel) {
        if (companyModel == null) return null;
        return new CompanyEntity(companyModel.getId().getId(),
                companyModel.getName(),
                companyModel.getShortName(),
                companyModel.getCompanyName(),
                companyModel.getOriginalId());
    }
}

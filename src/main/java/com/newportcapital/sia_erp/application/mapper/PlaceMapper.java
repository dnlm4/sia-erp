package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.place.Place;
import com.newportcapital.sia_erp.domain.model.place.PlaceId;
import com.newportcapital.sia_erp.infrastructure.place.PlaceEntity;
import org.springframework.stereotype.Component;


@Component
public class PlaceMapper {
    private final CompanyMapper companyMapper;

    public PlaceMapper(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    public Place PlaceEntityToPlace(PlaceEntity placeEntity) {
        if (placeEntity == null) return null;
        return new Place(new PlaceId(placeEntity.getId()),
                placeEntity.getName(),
                placeEntity.getShortName(),
                companyMapper.CompanyEntityToCompany(placeEntity.getCompanyId()));
    }
    public PlaceEntity PlaceToPlaceEntity(Place placeModel) {
        if (placeModel == null) return null;
        return new PlaceEntity(placeModel.getId().getId(),
                placeModel.getName(),
                placeModel.getShortName(),
                companyMapper.CompanyToCompanyEntity(placeModel.getCompany()));
    }
}

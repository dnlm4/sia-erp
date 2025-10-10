package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.place.Place;
import com.newportcapital.sia_erp.domain.model.place.PlaceId;
import com.newportcapital.sia_erp.infrastructure.place.PlaceEntity;

public class PlaceMapper {
    public static Place PlaceEntityToPlace(PlaceEntity placeEntity) {
        return new Place(new PlaceId(placeEntity.getId()),
                placeEntity.getName(),
                placeEntity.getShortName(),
                CompanyMapper.CompanyEntityToCompany(placeEntity.getCompanyId()));
    }
}

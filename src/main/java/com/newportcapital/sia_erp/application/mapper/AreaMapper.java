package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.area.Area;
import com.newportcapital.sia_erp.domain.model.area.AreaId;
import com.newportcapital.sia_erp.infrastructure.area.AreaEntity;

public class AreaMapper {
    public static Area AreaEntityToArea(AreaEntity areaEntity) {
        return new Area(new AreaId(areaEntity.getId()),areaEntity.getName(),areaEntity.getShortName());
    }
}

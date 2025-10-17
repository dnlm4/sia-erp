package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.area.Area;
import com.newportcapital.sia_erp.domain.model.area.AreaId;
import com.newportcapital.sia_erp.infrastructure.area.AreaEntity;
import org.springframework.stereotype.Component;

@Component
public class AreaMapper {
    public Area AreaEntityToArea(AreaEntity areaEntity) {
        if (areaEntity == null) return null;
        return new Area(new AreaId(areaEntity.getId()),areaEntity.getName(),areaEntity.getShortName());
    }
    public AreaEntity AreaToAreaEntity(Area areaModel) {
        if (areaModel == null) return null;
        return new AreaEntity(areaModel.getId().getId(),areaModel.getName(),areaModel.getShortName());
    }
}

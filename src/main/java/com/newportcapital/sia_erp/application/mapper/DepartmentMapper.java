package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.department.Department;
import com.newportcapital.sia_erp.domain.model.department.DepartmentId;
import com.newportcapital.sia_erp.infrastructure.department.DepartmentEntity;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {
    private final AreaMapper areaMapper;
    public DepartmentMapper(AreaMapper areaMapper) {
        this.areaMapper = areaMapper;
    }
    public Department DepartmentEntityToDepartment(DepartmentEntity departmentEntity) {
        if (departmentEntity == null) return null;
        return new Department(new DepartmentId(departmentEntity.getId()),
                departmentEntity.getName(),
                departmentEntity.getShortName(),
                areaMapper.AreaEntityToArea(departmentEntity.getAreaEntity()));
    }
    public DepartmentEntity DepartmentToDepartmentEntity(Department departmentModel) {
        if (departmentModel == null) return null;
        return new DepartmentEntity(departmentModel.getId().getId(),
                departmentModel.getName(),
                departmentModel.getShortName(),
                areaMapper.AreaToAreaEntity(departmentModel.getArea()));
    }
}

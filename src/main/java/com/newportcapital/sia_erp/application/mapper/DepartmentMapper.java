package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.department.Department;
import com.newportcapital.sia_erp.domain.model.department.DepartmentId;
import com.newportcapital.sia_erp.infrastructure.department.DepartmentEntity;

public class DepartmentMapper {
    public static Department DepartmentEntityToDepartment(DepartmentEntity departmentEntity) {
        return new Department(new DepartmentId(departmentEntity.getId()),
                departmentEntity.getName(),
                departmentEntity.getShortName(),
                AreaMapper.AreaEntityToArea(departmentEntity.getAreaEntity()));
    }
}

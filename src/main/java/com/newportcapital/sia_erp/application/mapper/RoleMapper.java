package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.rol.Role;
import com.newportcapital.sia_erp.domain.model.rol.RoleId;
import com.newportcapital.sia_erp.infrastructure.role.RoleEntity;

public class RoleMapper {
    public static Role RoleEntityToRole(RoleEntity roleEntity) {
        return new Role(new RoleId(roleEntity.getId()), roleEntity.getName());
    }
}

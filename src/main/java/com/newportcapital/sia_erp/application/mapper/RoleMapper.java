package com.newportcapital.sia_erp.application.mapper;

import com.newportcapital.sia_erp.domain.model.rol.Role;
import com.newportcapital.sia_erp.domain.model.rol.RoleId;
import com.newportcapital.sia_erp.infrastructure.role.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public Role RoleEntityToRole(RoleEntity roleEntity) {
        if (roleEntity == null) return null;
        return new Role(new RoleId(roleEntity.getId()), roleEntity.getName());
    }
    public RoleEntity RoleToRoleEntity(Role roleModel) {
        if (roleModel == null) return null;
        return new RoleEntity(roleModel.getId().getId(), roleModel.getName());
    }
}

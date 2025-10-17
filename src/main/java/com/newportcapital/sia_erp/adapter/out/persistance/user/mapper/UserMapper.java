package com.newportcapital.sia_erp.adapter.out.persistance.user.mapper;

import com.newportcapital.sia_erp.application.mapper.DepartmentMapper;
import com.newportcapital.sia_erp.application.mapper.PlaceMapper;
import com.newportcapital.sia_erp.application.mapper.RoleMapper;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final RoleMapper  roleMapper;
    private final DepartmentMapper departmentMapper;
    private final PlaceMapper placeMapper;

    public UserMapper(RoleMapper roleMapper, DepartmentMapper departmentMapper, PlaceMapper placeMapper) {
        this.roleMapper = roleMapper;
        this.departmentMapper = departmentMapper;
        this.placeMapper = placeMapper;
    }

    public User mapUserEntityToUser(UserEntity userEntity) {
        if  (userEntity == null) return null;
        return new User( new UserId(userEntity.getId()),
                userEntity.getUser(),
                userEntity.getPassword(),
                userEntity.getName(),
                userEntity.getPaternalSurname(),
                userEntity.getMaternalSurname(),
                userEntity.getEmail(),
                userEntity.getStatus(),
                roleMapper.RoleEntityToRole(userEntity.getRoleEntity()),
                departmentMapper.DepartmentEntityToDepartment(userEntity.getDepartmentEntity()),
                placeMapper.PlaceEntityToPlace(userEntity.getPlaceEntity()),
                userEntity.getReceiveValidation(),
                userEntity.getReceiveCreation(),
                userEntity.getReceiveApproval1(),
                userEntity.getReceiveApproval2(),
                userEntity.getReceiveSalesValidation(),
                userEntity.getReceiveSecuritySale(),
                userEntity.getCreationDate(),
                userEntity.getEditionDate(),
                userEntity.getCreatorUserId(),
                userEntity.getEditorUserId(),
                userEntity.getAreaPlantaId(),
                userEntity.getCanDispatch(),
                userEntity.getEquipmentReview());
    }
    public UserEntity mapUserToUserEntity(User user) {
        if  (user == null) return null;
        return new UserEntity(user.getId().getId(),
                user.getUser(),
                user.getPassword(),
                user.getName(),
                user.getPaternalSurname(),
                user.getMaternalSurname(),
                user.getEmail(),
                user.getStatus(),
                roleMapper.RoleToRoleEntity(user.getRole()),
                departmentMapper.DepartmentToDepartmentEntity(user.getDepartment()),
                placeMapper.PlaceToPlaceEntity(user.getPlace()),
                user.getReceiveValidation(),
                user.getReceiveCreation(),
                user.getReceiveApproval1(),
                user.getReceiveApproval2(),
                user.getReceiveSalesValidation(),
                user.getReceiveSecuritySale(),
                user.getCreationDate(),
                user.getEditionDate(),
                user.getCreatorUserId(),
                user.getEditorUserId(),
                user.getAreaPlantaId(),
                user.getCanDispatch(),
                user.getEquipmentReview());
    }
}

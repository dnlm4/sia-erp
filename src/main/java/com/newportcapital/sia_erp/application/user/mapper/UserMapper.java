package com.newportcapital.sia_erp.application.user.mapper;

import com.newportcapital.sia_erp.application.mapper.DepartmentMapper;
import com.newportcapital.sia_erp.application.mapper.PlaceMapper;
import com.newportcapital.sia_erp.application.mapper.RoleMapper;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;

public class UserMapper {
    public static User mapUserEntityToUser(UserEntity userEntity) {
        return new User( new UserId(userEntity.getId()),
                userEntity.getUser(),
                userEntity.getPassword(),
                userEntity.getName(),
                userEntity.getPaternalSurname(),
                userEntity.getMaternalSurname(),
                userEntity.getEmail(),
                userEntity.getStatus(),
                RoleMapper.RoleEntityToRole(userEntity.getRole()),
                DepartmentMapper.DepartmentEntityToDepartment(userEntity.getDepartment()),
                PlaceMapper.PlaceEntityToPlace(userEntity.getPlace()),
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
}

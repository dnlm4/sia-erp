package com.newportcapital.sia_erp.application.user.service;

import com.newportcapital.sia_erp.adapter.web.user.dto.UserUpdateRequest;
import com.newportcapital.sia_erp.application.user.port.in.UpdateUserUseCase;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import com.newportcapital.sia_erp.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateUsersService implements UpdateUserUseCase {
    private final UserRepository userRepository;

    public UpdateUsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User updateUser(UserId id, UserUpdateRequest userUpdateRequest) {
        User userModel = userRepository.findById(id);
        userModel.update(
                id,
                userUpdateRequest.getUser(),
                userUpdateRequest.getPassword(),
                userUpdateRequest.getName(),
                userUpdateRequest.getPaternalSurname(),
                userUpdateRequest.getMaternalSurname(),
                userUpdateRequest.getEmail(),
                userUpdateRequest.getStatus(),
                userUpdateRequest.getRole(),
                userUpdateRequest.getDepartment(),
                userUpdateRequest.getPlace(),
                userUpdateRequest.getReceiveValidation(),
                userUpdateRequest.getReceiveCreation(),
                userUpdateRequest.getReceiveApproval1(),
                userUpdateRequest.getReceiveApproval2(),
                userUpdateRequest.getReceiveSalesValidation(),
                userUpdateRequest.getReceiveSecuritySale(),
                userUpdateRequest.getCreationDate(),
                userUpdateRequest.getEditionDate(),
                userUpdateRequest.getCreatorUserId(),
                userUpdateRequest.getEditorUserId(),
                userUpdateRequest.getAreaPlantaId(),
                userUpdateRequest.getCanDispatch(),
                userUpdateRequest.getEquipmentReview()
        );
        return userRepository.save(userModel);
    }
}

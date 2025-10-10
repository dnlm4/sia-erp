package com.newportcapital.sia_erp.application.user.usecase;

import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.repository.UserRepository;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class UserUseCase {
    private final UserRepository userRepository;

    public UserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserEntity findByUsername(String user){
        return userRepository.findByUsername(user);
    }
}

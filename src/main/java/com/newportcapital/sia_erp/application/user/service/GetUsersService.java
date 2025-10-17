package com.newportcapital.sia_erp.application.user.service;

import com.newportcapital.sia_erp.application.user.port.in.GetUsersUseCase;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import com.newportcapital.sia_erp.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class GetUsersService implements GetUsersUseCase {
    private final UserRepository userRepository;

    public GetUsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User findByUsername(String user) {
        return userRepository.findByUsername(user);
    }

    @Override
    public User findById(UserId id) {
        return userRepository.findById(id);
    }
}

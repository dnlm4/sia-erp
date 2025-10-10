package com.newportcapital.sia_erp.infrastructure.user.adapter.output.repsitory;

import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.repository.UserRepository;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import com.newportcapital.sia_erp.infrastructure.user.persistance.jpa.UserJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }
    @Override
    public UserEntity findByUsername(String user) {
        UserEntity userEntity= userJpaRepository.findByUser(user)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        return userEntity;
    }
}

package com.newportcapital.sia_erp.domain.repository;

import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;

import java.util.Optional;

public interface UserRepository {
    UserEntity findByUsername(String user);

}

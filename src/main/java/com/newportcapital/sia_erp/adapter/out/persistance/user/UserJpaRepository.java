package com.newportcapital.sia_erp.adapter.out.persistance.user;

import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUser(String user);
}

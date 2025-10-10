package com.newportcapital.sia_erp.infrastructure.user.persistance.jpa;

import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUser(String user);
}

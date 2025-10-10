package com.newportcapital.sia_erp.application.port.out;

import com.newportcapital.sia_erp.domain.model.user.User;

public interface UserRepositoryPort {
    User findByUserNickname(String user);
}

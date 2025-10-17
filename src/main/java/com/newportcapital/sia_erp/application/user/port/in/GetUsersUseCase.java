package com.newportcapital.sia_erp.application.user.port.in;

import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;

public interface GetUsersUseCase {
    User findByUsername(String user);
    User findById(UserId id);
}

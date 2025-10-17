package com.newportcapital.sia_erp.domain.repository;

import com.newportcapital.sia_erp.adapter.web.user.dto.UserUpdateRequest;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;


public interface UserRepository {
    User findByUsername(String user);
    User findById(UserId id);
    User save(User user);

}

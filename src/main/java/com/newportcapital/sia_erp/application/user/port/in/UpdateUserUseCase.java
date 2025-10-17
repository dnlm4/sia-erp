package com.newportcapital.sia_erp.application.user.port.in;

import com.newportcapital.sia_erp.adapter.web.user.dto.UserUpdateRequest;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;

public interface UpdateUserUseCase {
    User updateUser(UserId id, UserUpdateRequest userUpdateRequest);
}

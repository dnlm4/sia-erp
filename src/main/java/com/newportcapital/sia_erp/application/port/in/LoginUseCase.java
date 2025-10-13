package com.newportcapital.sia_erp.application.port.in;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginRequest;

public interface LoginUseCase {
    String login(LoginRequest loginRequest);

}

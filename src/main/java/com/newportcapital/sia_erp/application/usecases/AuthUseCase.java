package com.newportcapital.sia_erp.application.usecases;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginRequest;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginResponse;
import org.springframework.http.ResponseEntity;

public interface AuthUseCase {
    ResponseEntity<LoginResponse> login(LoginRequest loginRequest);
}

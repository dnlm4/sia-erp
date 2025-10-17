package com.newportcapital.sia_erp.application.usecases.Auth;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginRequest;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;

public interface AuthUseCase {
    ResponseEntity<LoginResponse> login(LoginRequest loginRequest);
    ResponseEntity<LoginResponse> refreshToken(HttpServletRequest request);
}

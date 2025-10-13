package com.newportcapital.sia_erp.adapter.web.authentication;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginRequest;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginResponse;
import com.newportcapital.sia_erp.application.usecases.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Endpoints for user login")
public class AuthenticationController {
    private final AuthService authService;

    public AuthenticationController(AuthService authService) {
        this.authService = authService;
    }

    @Operation(summary = "Login and get JWT token")
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }
}

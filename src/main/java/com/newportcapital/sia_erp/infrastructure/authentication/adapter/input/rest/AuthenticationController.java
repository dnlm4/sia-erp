package com.newportcapital.sia_erp.infrastructure.authentication.adapter.input.rest;

import com.newportcapital.sia_erp.application.authentication.dto.LoginRequest;
import com.newportcapital.sia_erp.application.authentication.dto.LoginResponse;
import com.newportcapital.sia_erp.application.user.usecase.UserUseCase;
import com.newportcapital.sia_erp.infrastructure.password.BcryptEncryptionService;
import com.newportcapital.sia_erp.infrastructure.security.JwtTokenProvider;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Endpoints for user login")
public class AuthenticationController {
    private final JwtTokenProvider jwtTokenProvider;
    private final BcryptEncryptionService bcryptEncryptionService;
    private final UserUseCase  userUseCase;

    public AuthenticationController(JwtTokenProvider jwtTokenProvider, BcryptEncryptionService bcryptEncryptionService, UserUseCase userUseCase) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.bcryptEncryptionService = bcryptEncryptionService;
        this.userUseCase = userUseCase;
    }
    @Operation(summary = "Login and get JWT token")
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        System.out.println("Login Request: ****************************************************************************************");
        System.out.println("Login Request: " + loginRequest.getUser());
        System.out.println("Login Request: " + loginRequest.getPassword());

        String passwordRequestEncrypt = bcryptEncryptionService.hash(loginRequest.getPassword());

        UserEntity userEntity = userUseCase.findByUsername(loginRequest.getUser());
        boolean comparePassword = bcryptEncryptionService.matches(loginRequest.getPassword(),userEntity.getPassword());
        System.out.println("is wwwwwwwwww: " + comparePassword);

        System.out.println("Login Request: ****************************************************************************************");
        if(comparePassword){
            System.out.println("-añaññañañañañañañañañañañañ");
            String token = jwtTokenProvider.createToken(loginRequest.getUser(), List.of("ROLE_USER"));
            System.out.println("token: " + token);
            return ResponseEntity.ok(new LoginResponse(token));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}

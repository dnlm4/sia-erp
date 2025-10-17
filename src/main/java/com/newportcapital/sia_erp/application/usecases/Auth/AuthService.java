package com.newportcapital.sia_erp.application.usecases.Auth;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginRequest;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginResponse;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.UserTokenPayload;
import com.newportcapital.sia_erp.application.user.service.GetUsersService;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.infrastructure.password.BcryptEncryptionService;
import com.newportcapital.sia_erp.infrastructure.security.JwtTokenProvider;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements AuthUseCase{
    private final JwtTokenProvider jwtTokenProvider;
    private final BcryptEncryptionService bcryptEncryptionService;
    private final GetUsersService getUsersService;

    public AuthService(JwtTokenProvider jwtTokenProvider, BcryptEncryptionService bcryptEncryptionService, GetUsersService getUsersService) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.bcryptEncryptionService = bcryptEncryptionService;
        this.getUsersService = getUsersService;
    }

    @Override
    public ResponseEntity<LoginResponse> login(LoginRequest loginRequest) {

        User userModel = getUsersService.findByUsername(loginRequest.getUser());
        boolean comparePassword = bcryptEncryptionService.matches(loginRequest.getPassword(),userModel.getPassword());

        System.out.println("login: ");
        if(comparePassword){
            System.out.println("xxx: ");
            String token = jwtTokenProvider.createToken(
                    new UserTokenPayload(userModel.getId().getId(),userModel.getUser(),userModel.getEditionDate().toString()));
            System.out.println("token: "+token);
            return ResponseEntity.ok(new LoginResponse(token));
        }
        System.out.println("nooologin: ");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @Override
    public ResponseEntity<LoginResponse> refreshToken(HttpServletRequest request) {

        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String token = authHeader.substring(7);
        String username = jwtTokenProvider.getUsername(token);

        User userModel = getUsersService.findByUsername(username);
        String newToken = jwtTokenProvider.createToken(
                new UserTokenPayload(userModel.getId().getId(),userModel.getUser(),userModel.getEditionDate().toString()));
        return ResponseEntity.ok(new LoginResponse(newToken));
    }
}

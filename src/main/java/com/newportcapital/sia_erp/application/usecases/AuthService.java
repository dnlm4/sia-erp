package com.newportcapital.sia_erp.application.usecases;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginRequest;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginResponse;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.UserTokenPayload;
import com.newportcapital.sia_erp.application.user.usecase.UserUseCase;
import com.newportcapital.sia_erp.infrastructure.password.BcryptEncryptionService;
import com.newportcapital.sia_erp.infrastructure.security.JwtTokenProvider;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements AuthUseCase{
    private final JwtTokenProvider jwtTokenProvider;
    private final BcryptEncryptionService bcryptEncryptionService;
    private final UserUseCase userUseCase;

    public AuthService(JwtTokenProvider jwtTokenProvider, BcryptEncryptionService bcryptEncryptionService, UserUseCase userUseCase) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.bcryptEncryptionService = bcryptEncryptionService;
        this.userUseCase = userUseCase;
    }

    @Override
    public ResponseEntity<LoginResponse> login(LoginRequest loginRequest) {
        System.out.println("Login Request: ****************************************************************************************");
        System.out.println("Login Request: " + loginRequest.getUser());
        System.out.println("Login Request: " + loginRequest.getPassword());


        UserEntity userEntity = userUseCase.findByUsername(loginRequest.getUser());
        boolean comparePassword = bcryptEncryptionService.matches(loginRequest.getPassword(),userEntity.getPassword());
        System.out.println("is wwwwwwwwww: " + comparePassword);

        System.out.println("Login Request: ****************************************************************************************");
        if(comparePassword){
            String token = jwtTokenProvider.createToken(
                    new UserTokenPayload(userEntity.getId(),
                            userEntity.getUser(),
                            userEntity.getPassword(),
                            userEntity.getName(),
                            userEntity.getPaternalSurnameOrDefault(),
                            userEntity.getMaternalSurnameOrDefault(),
                            userEntity.getEmailOrDefault(),
                            userEntity.getRoleIdOrDefault(),
                            userEntity.getDepartmentIdOrDefault(),
                            userEntity.getPlaceIdOrDefault(),
                            userEntity.getReceiveValidationOrDefault(),
                            userEntity.getReceiveCreationOrDefault(),
                            userEntity.getReceiveApproval1OrDefault(),
                            userEntity.getReceiveApproval2OrDefault(),
                            userEntity.getReceiveSalesValidationOrDefault(),
                            userEntity.getReceiveSecuritySaleOrDefault()));
            System.out.println("token: " + token);
            return ResponseEntity.ok(new LoginResponse(token));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}

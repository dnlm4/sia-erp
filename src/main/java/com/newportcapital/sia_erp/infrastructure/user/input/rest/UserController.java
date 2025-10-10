package com.newportcapital.sia_erp.infrastructure.user.input.rest;

import com.newportcapital.sia_erp.application.authentication.dto.LoginResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "Authentication", description = "Endpoints for user login")
public class UserController {

    @GetMapping(value = "/test",produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginResponse> test() {
        return ResponseEntity.ok(new LoginResponse("davGOD"));
    }
}

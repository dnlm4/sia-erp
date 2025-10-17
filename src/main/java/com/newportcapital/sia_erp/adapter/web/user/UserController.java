package com.newportcapital.sia_erp.adapter.web.user;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.LoginResponse;
import com.newportcapital.sia_erp.adapter.web.user.dto.UserUpdateRequest;
import com.newportcapital.sia_erp.application.user.service.GetUsersService;
import com.newportcapital.sia_erp.application.user.service.UpdateUsersService;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Tag(name = "Authentication", description = "Endpoints for user login")
public class UserController {
    private final GetUsersService getUsersService;
    private final UpdateUsersService updateUsersService;

    public UserController(GetUsersService getUsersService, UpdateUsersService updateUsersService) {
        this.getUsersService = getUsersService;
        this.updateUsersService = updateUsersService;
    }

    @GetMapping(value = "/test",produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginResponse> test() {
        return ResponseEntity.ok(new LoginResponse("davGOD"));
    }

    @GetMapping(value = "/verify-token",produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> verifyToken() {
        // Si el token es válido, Spring Security permitirá llegar aquí
        return ResponseEntity.ok(true);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody UserUpdateRequest userUpdateRequest) {
        return ResponseEntity.ok(updateUsersService.updateUser(new UserId(id),userUpdateRequest));
    }


    
}

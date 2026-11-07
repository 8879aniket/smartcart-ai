package com.smartcart.identity.auth;

import com.smartcart.identity.user.dto.RegisterRequest;
import com.smartcart.identity.user.dto.RegisterResponse;
import com.smartcart.identity.user.entity.IdentityUser;
import com.smartcart.identity.user.service.IdentityUserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final IdentityUserService userService;

    public AuthController(IdentityUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(
            @Valid @RequestBody RegisterRequest request) {

        IdentityUser user = userService.register(
                request.email(),
                request.password()
        );

        RegisterResponse response = new RegisterResponse(
                user.getId(),
                user.getEmail()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
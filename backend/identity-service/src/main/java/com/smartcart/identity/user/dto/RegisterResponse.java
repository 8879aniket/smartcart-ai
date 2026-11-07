package com.smartcart.identity.user.dto;

import java.util.UUID;

public record RegisterResponse(
        UUID id,
        String email
) {}
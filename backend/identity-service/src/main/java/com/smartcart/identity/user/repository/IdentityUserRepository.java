package com.smartcart.identity.user.repository;

import com.smartcart.identity.user.entity.IdentityUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IdentityUserRepository
        extends JpaRepository<IdentityUser, UUID> {

    Optional<IdentityUser> findByEmail(String email);

    boolean existsByEmail(String email);
}
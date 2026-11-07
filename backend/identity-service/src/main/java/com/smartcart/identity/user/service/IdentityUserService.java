package com.smartcart.identity.user.service;

import com.smartcart.identity.user.entity.IdentityUser;
import com.smartcart.identity.user.repository.IdentityUserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smartcart.identity.common.EmailAlreadyRegisteredException;

import java.util.Locale;

@Service
public class IdentityUserService {

    private final IdentityUserRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;

    public IdentityUserService(
            IdentityUserRepository repository,
            BCryptPasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public IdentityUser register(String email, String password) {

        String normalizedEmail = email.trim().toLowerCase(Locale.ROOT);

        if (repository.existsByEmail(normalizedEmail)) {
            throw new EmailAlreadyRegisteredException(
                    "Email is already registered"
            );
        }

        String passwordHash = passwordEncoder.encode(password);

        IdentityUser user = new IdentityUser(
                normalizedEmail,
                passwordHash
        );

        return repository.save(user);
    }
}
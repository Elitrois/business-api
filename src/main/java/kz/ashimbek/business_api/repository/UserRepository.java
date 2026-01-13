package kz.ashimbek.business_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kz.ashimbek.business_api.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);    
}

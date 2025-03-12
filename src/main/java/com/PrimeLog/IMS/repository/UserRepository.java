package com.PrimeLog.IMS.repository;


import com.PrimeLog.IMS.objects.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom query methods can be added here
    // Example: Find user by username
    // Optional<User> findByUsername(String username);
}
package com.example.coffee.repository;

import com.example.coffee.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserServiceRepository extends JpaRepository<User,Integer> {
    Optional<User> findById(long userId);
    User findByAccountId(String accountId);
}

package com.playground.store.repository;

import com.playground.store.jpo.UserJpo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserJpo, String> {

    Optional<UserJpo> findByUserid(String userid);

    Optional<UserJpo> findByUsername(String username);
}

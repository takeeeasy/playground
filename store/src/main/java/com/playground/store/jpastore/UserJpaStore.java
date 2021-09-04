package com.playground.store.jpastore;

import com.playground.domain.entity.User;
import com.playground.domain.store.UserStore;
import com.playground.store.jpo.UserJpo;
import com.playground.store.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class UserJpaStore implements UserStore {

    @PersistenceContext
    EntityManager entityManager;

    private final UserRepository userRepository;

    public UserJpaStore(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(User user) {
        UserJpo jpo = new UserJpo(user);
        entityManager.persist(jpo);
    }

    @Override
    public User retrieveByUserid(String userid) {
        Optional<UserJpo> retVal = this.userRepository.findByUserid(userid);
        return retVal.map(UserJpo::toDomain).orElse(null);
    }

    @Override
    public User retrieveByUsername(String username) {
        Optional<UserJpo> retVal = this.userRepository.findByUsername(username);
        return retVal.map(UserJpo::toDomain).orElse(null);
    }
}

package com.playground.domain.store;

import com.playground.domain.entity.User;

public interface UserStore {
    void create(User user);

    User retrieveByUserid(String userid);

    User retrieveByUsername(String username);
}

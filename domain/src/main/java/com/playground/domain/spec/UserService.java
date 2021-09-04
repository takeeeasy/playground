package com.playground.domain.spec;

import com.playground.domain.entity.User;

public interface UserService {

    void register(User user);

    User find(String userid);

}

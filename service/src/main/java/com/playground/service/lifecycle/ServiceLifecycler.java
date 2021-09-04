package com.playground.service.lifecycle;

import com.playground.domain.lifecycle.ServiceLifecycle;
import com.playground.domain.spec.UserService;
import org.springframework.stereotype.Component;

@Component
public class ServiceLifecycler implements ServiceLifecycle {

    private final UserService userService;

    public ServiceLifecycler(UserService userService) {
        super();
        this.userService = userService;
    }

    @Override
    public UserService requestUserService() {
        return this.userService;
    }
}

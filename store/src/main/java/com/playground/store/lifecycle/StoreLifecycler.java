package com.playground.store.lifecycle;

import com.playground.domain.lifecycle.StoreLifecycle;
import com.playground.domain.store.UserStore;
import org.springframework.stereotype.Component;

@Component
public class StoreLifecycler implements StoreLifecycle {

    private final UserStore userStore;

    public StoreLifecycler(UserStore userStore) {
        this.userStore = userStore;
    }

    @Override
    public UserStore requestUserStore() {
        return this.userStore;
    }
}

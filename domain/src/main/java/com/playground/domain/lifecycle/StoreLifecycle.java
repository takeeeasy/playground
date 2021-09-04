package com.playground.domain.lifecycle;

import com.playground.domain.store.UserStore;

public interface StoreLifecycle {

  UserStore requestUserStore();
}

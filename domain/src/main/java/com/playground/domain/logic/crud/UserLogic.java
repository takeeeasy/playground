package com.playground.domain.logic.crud;

import com.playground.domain.entity.User;
import com.playground.domain.lifecycle.StoreLifecycle;
import com.playground.domain.spec.UserService;
import com.playground.domain.store.UserStore;

public class UserLogic implements UserService {

  private final UserStore userStore;

  public UserLogic(StoreLifecycle storeLifecycle) {
    this.userStore = storeLifecycle.requestUserStore();
  }

  @Override
  public void register(User user) {
    this.userStore.create(user);
  }

  @Override
  public User find(String userid) {
    return this.userStore.retrieveByUserid(userid);
  }
}

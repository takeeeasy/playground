package com.playground.service.logic;

import com.playground.domain.lifecycle.StoreLifecycle;
import com.playground.domain.logic.crud.UserLogic;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserSpringLogic extends UserLogic {

    public UserSpringLogic(StoreLifecycle storeLifecycle) {
        super(storeLifecycle);
    }
}

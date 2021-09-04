package com.playground.service.lifecycle;

import com.playground.domain.lifecycle.ProxyLifecycle;
import com.playground.domain.proxy.OrderProxy;
import org.springframework.stereotype.Component;

@Component
public class ProxyLifecycler implements ProxyLifecycle {

    private final OrderProxy orderProxy;

    public ProxyLifecycler(OrderProxy orderProxy) {
        this.orderProxy = orderProxy;
    }

    @Override
    public OrderProxy requestOrderProxy() {
        return this.orderProxy;
    }
}

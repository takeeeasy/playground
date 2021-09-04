package com.playground.service.bind;

import com.playground.domain.proxy.OrderProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

@Service
@EnableFeignClients(basePackages = "put.in.package.path")
public class OrderDelegator implements OrderProxy {
}

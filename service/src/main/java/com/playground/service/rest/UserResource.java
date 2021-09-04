package com.playground.service.rest;

import com.playground.domain.entity.User;
import com.playground.domain.lifecycle.ServiceLifecycle;
import com.playground.domain.spec.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "user-service")
public class UserResource {

  private final UserService userService;

  public UserResource(ServiceLifecycle serviceLifecycle) {
    this.userService = serviceLifecycle.requestUserService();
  }

  @GetMapping(path = "/userinfo")
  public void findUserInfo() {
    Logger logger = LogManager.getLogger("DEVELOPER_LOG");

    logger.info("test");
    logger.fatal("test");
    logger.error("test");
    logger.warn("test");
    logger.debug("test");

    User user = new User();
    user.setUserid("test1");
    user.setUsername("tester");
    user.setPassword("1234");
    user.setEmail("test@user.com");
    user.setRole("customer");
    userService.register(new User());
  }
}

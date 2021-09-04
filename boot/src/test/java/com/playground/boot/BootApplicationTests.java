package com.playground.boot;

import com.google.gson.Gson;
import com.playground.domain.entity.User;
import com.playground.domain.spec.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User result = userService.find("sampleid");
        Logger logger = LogManager.getLogger("DEV_LOG");
        logger.info(new Gson().toJson(result));
    }

}

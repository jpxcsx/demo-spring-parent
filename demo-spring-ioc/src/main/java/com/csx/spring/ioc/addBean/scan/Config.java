package com.csx.spring.ioc.scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cuisongxu
 * @date 2023/1/24 12:18
 */
@Configuration
public class Config {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}

package com.csx.spring.ioc.getBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author cuisongxu
 * @date 2023/1/24 18:02
 */
public class GetByApplicationContext {

    @SpringBootApplication
    public static class MainApplication {
        public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
        }
    }
}

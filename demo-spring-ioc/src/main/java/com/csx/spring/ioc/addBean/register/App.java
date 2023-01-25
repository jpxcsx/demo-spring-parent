package com.csx.spring.ioc.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cuisongxu
 * @date 2023/1/24 12:32
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(com.csx.spring.ioc.register.Ju.class);
    }
}

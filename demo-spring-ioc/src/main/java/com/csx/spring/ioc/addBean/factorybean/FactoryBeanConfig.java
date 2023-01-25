package com.csx.spring.ioc.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cuisongxu
 * @date 2023/1/24 12:29
 */
@Configuration
public class FactoryBeanConfig {

    /**
     * 实际向容器中放入的bean类型为 Dog
     * @return
     */
    @Bean
    public DogFactoryBean dog() {
        return new DogFactoryBean();
    }
}

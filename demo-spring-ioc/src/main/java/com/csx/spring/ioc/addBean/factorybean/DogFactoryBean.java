package com.csx.spring.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author cuisongxu
 * @date 2023/1/24 12:28
 */
public class DogFactoryBean implements FactoryBean<Dog> {

    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }
}

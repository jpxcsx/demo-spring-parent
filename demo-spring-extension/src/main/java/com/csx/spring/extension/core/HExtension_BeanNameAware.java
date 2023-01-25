package com.csx.spring.extension.core;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 扩展点8: {@link BeanNameAware}
 * <p>调用时机:
 *      Bean实例化之后，初始化之前
 * <p>使用场景:
 *      在初始化Bean之前拿到spring容器中注册的beanName
 * @author cuisongxu
 * @date 2023/1/22 15:59
 */
public class HExtension_BeanNameAware implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware setBeanName");
    }
}

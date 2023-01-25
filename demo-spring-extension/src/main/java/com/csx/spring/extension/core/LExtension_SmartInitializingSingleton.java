package com.csx.spring.extension.core;

import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * 扩展点12: {@link org.springframework.beans.factory.SmartInitializingSingleton}
 * <p>执行时机:
 *  在 Spring容器管理的所有单例对象(非懒加载对象)初始化完成之后调用的回调接口
 * {@link org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(Object, String)} 之后
 * <p>使用场景:
 *      用户可以扩展此接口在对所有单例对象初始化完毕后，做一些后置的业务处理
 * @author cuisongxu
 * @date 2023/1/22 16:29
 */
public class LExtension_SmartInitializingSingleton implements SmartInitializingSingleton {

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("SmartInitializingSingleton afterSingletonsInstantiated");
    }
}

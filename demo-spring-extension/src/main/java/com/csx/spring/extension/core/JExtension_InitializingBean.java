package com.csx.spring.extension.core;

import org.springframework.beans.factory.InitializingBean;

/**
 * 扩展点10: {@link InitializingBean}
 * <p>执行时机: {@link org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(Object, String)} 之后
 * <p>使用场景: 进行系统启动时的一些业务指标的初始化工作
 * @author cuisongxu
 * @date 2023/1/22 16:17
 */
public class JExtension_InitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet");
    }
}

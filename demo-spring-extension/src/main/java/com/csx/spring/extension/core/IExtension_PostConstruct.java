package com.csx.spring.extension.core;

import javax.annotation.PostConstruct;

/**
 * 扩展点9: {@link javax.annotation.PostConstruct}
 * <p>执行时机: postProcessBeforeInitialization 之后
 * <p>使用场景: 对某一类方法进行标注，来初始化某一个属性
 * @author cuisongxu
 * @date 2023/1/22 16:08
 */
public class IExtension_PostConstruct {

    public IExtension_PostConstruct() {
        System.out.println("IExtensionPostConstruct constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct init");
    }
}

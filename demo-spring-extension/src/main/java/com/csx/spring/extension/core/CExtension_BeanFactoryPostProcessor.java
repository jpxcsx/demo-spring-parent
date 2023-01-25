package com.csx.spring.extension.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 扩展点3: {@link BeanFactoryPostProcessor}
 * <p>调用时机: 读取 beanDefinition信息之后，实例化bean之前
 * <p>使用场景: 用户可以通过实现这个扩展接口来自行处理一些东西，比如已经注册的 beanDefinition的元信息
 *
 * @author cuisongxu
 * @date 2023/1/22 10:14
 */
public class CExtension_BeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor");
    }
}

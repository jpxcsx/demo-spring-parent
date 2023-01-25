package com.csx.spring.extension.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * 扩展点2: {@link BeanDefinitionRegistryPostProcessor}
 * <p>执行时机: refresh中的invokeBeanFactoryPostProcessors方法中)
 *     这是接口在读取项目的 beanDefinition 之后执行，提供的一个补充的扩展点
 * <p>使用场景:
 *      在这里动态注册自己的 beanDefinition，可以加载classpath之外的bean
 *
 * @author cuisongxu
 * @date 2023/1/22 10:03
 */
public class BExtension_BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    /**
     * 扩展点2 生效的是 该接口
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor postProcessBeanFactory");
    }
}

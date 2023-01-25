package com.csx.spring.extension.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

/**
 * 扩展点5: SmartInstantiationAwareBeanPostProcessor
 * @author cuisongxu
 * @date 2023/1/22 10:58
 */
public class EExtension_SmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    /**
     * 该触发点发生在 {@link InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation(Class, String)} 之前,
     *  返回第一个预测成功的类型，如果不能预测返回null。当调用 {@link org.springframework.beans.factory.BeanFactory#getType(String)} 通过Bean
     *  名称无法获取 Bean类型信息时就调用该回调方法来决定类型信息
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
    }

    /**
     * 该触发点发生在 {@link InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation(Class, String)} 之后, 用于确定
     * 该bean的构造函数之后，返回的是该bean的所有构造函数列表。用户可以扩展这个点来自定义选择相应的构造器来实例化这个bean
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
    }

    /**
     * 该触发点发生在 {@link InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation(Object, String)}
     *  当有循环依赖场景，当bean实例化好之后，为了防止有循环依赖，会提前暴露回调方法，用于bean实例化的后置处理，这个方法就是在提前暴露的回调方法中触发
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
    }
}

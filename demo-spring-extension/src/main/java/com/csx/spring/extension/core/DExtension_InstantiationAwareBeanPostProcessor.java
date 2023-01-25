package com.csx.spring.extension.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * 扩展点4: {@link InstantiationAwareBeanPostProcessor}
 * <p>调用时机:
 *      继承的接口BeanPostProcessor 在Bean的初始化阶段执行。 InstantiationAwareBeanPostProcessor 把可扩展的范围
 *  增加了实例化阶段 和 属性注入阶段
 * <p>使用场景:
 *      实现了某一类接口的bean在各个生命周期进行收集，或者对某个类型的bean进行统一操作等等。
 * @author cuisongxu
 * @date 2023/1/22 10:37
 */
public class DExtension_InstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    /**
     * 实例化bean之前，相当于new这个bean之前
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation");
        return null;
    }

    /**
     * 实例化这个bean之后，相当于new这个bean之后
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor postProcessAfterInstantiation");
        return true;
    }

    /**
     * bean已经实例化完成，在属性注入时阶段触发. @Autowired 和 @Resource 等注解原理基于此方法实现
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor postProcessProperties");
        return pvs;
    }

    /**
     * 初始化ban之前，相当于把bean注入到 spring 上下文之前
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor postProcessBeforeInitialization");
        return bean;
    }

    /**
     * 初始化bean之后，相当于把bean注入到spring上下文之后
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor postProcessAfterInitialization");
        return bean;
    }
}

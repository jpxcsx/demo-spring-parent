package com.csx.spring.extension.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * 扩展点6: {@link BeanFactoryAware}
 * <p>调用时机: bean实例化之后，注入属性之前，也就是 setter 之前
 * <p>使用场景: 拿到beanFactory中的每个bean做特殊化定制，也可以拿到 BeanFactory进行缓存，日后使用
 *
 * @author cuisongxu
 * @date 2023/1/22 11:08
 */
public class FExtension_BeanFactoryAware implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware setBeanFactory");
    }
}

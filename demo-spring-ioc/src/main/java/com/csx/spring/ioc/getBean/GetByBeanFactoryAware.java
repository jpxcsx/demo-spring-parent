package com.csx.spring.ioc.getBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author cuisongxu
 * @date 2023/1/24 17:55
 */
public class GetByBeanFactoryAware {

    @Component
    public static class BeanFactoryHelper implements BeanFactoryAware {

        private static BeanFactory beanFactory;

        /**
         * 重写 BeanFactoryAware 接口的方法
         * @param beanFactory: 参数赋值给本地属性之后即可使用 BeanFactory
         * @throws BeansException
         */
        @Override
        public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
            BeanFactoryHelper.beanFactory = beanFactory;
        }

        /**
         * 根据名称获取容器中的对象实例
         * @param beanName 被注入的必须存在于容器中，否则抛出异常 {@link org.springframework.beans.factory.NoSuchBeanDefinitionException}
         * @return
         */
        public static Object getBean(String beanName) {
            return beanFactory.getBean(beanName);
        }

        /**
         * 根据 class 获取容器中的对象实例
         * @param requiredType 被注入的必须存在于容器中，否则抛出异常 {@link org.springframework.beans.factory.NoSuchBeanDefinitionException}
         * @param <T>
         * @return
         */
        public static <T> T getBean(Class<T> requiredType) {
            return beanFactory.getBean(requiredType);
        }

        /**
         * 判断 spring 容器中是否包含指定名称的对象
         * @param beanName bean名称
         * @return
         */
        public static boolean containsBean(String beanName) {
            return beanFactory.containsBean(beanName);
        }
    }
}

package com.csx.spring.extension.core;

import org.springframework.beans.factory.FactoryBean;

/**
 * 扩展点11: {@link org.springframework.beans.factory.FactoryBean}
 * <p>使用场景:
 *      一般情况下，Spring 通过反射机制利用bean的class属性指定支线类去实例化bean，在某些情况下，实例化
 *      Bean的过程比较复杂，如果采用传统的方式，则需要在Bean中提供大量的配置信息。配置方式的灵活性是受限制的
 *      。这时采用编码的方式去让用户手动定制实例化Bean的逻辑不失为一种好的解决方案。
 * @author cuisongxu
 * @date 2023/1/22 16:20
 */
public class KExtension_FactoryBean implements FactoryBean<KExtension_FactoryBean.TestFactoryInnerBean> {


    @Override
    public TestFactoryInnerBean getObject() throws Exception {
        // 在这里可以定制复杂的实例化Bean的逻辑
        System.out.println("FactoryBean getObject");
        return new KExtension_FactoryBean.TestFactoryInnerBean();
    }

    @Override
    public Class<?> getObjectType() {
        return KExtension_FactoryBean.TestFactoryInnerBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public static class TestFactoryInnerBean {

    }
}

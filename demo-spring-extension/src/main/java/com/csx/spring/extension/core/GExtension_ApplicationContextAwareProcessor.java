package com.csx.spring.extension.core;

/**
 * 扩展点7: {@link org.springframework.context.support.ApplicationContextAwareProcessor}
 *
 *  <p>执行时机: bean实例化之后，属性填充之前
 *    里面是针对一系列 Aware 接口的回调
 *  <p>① EnvironmentAware 注入Environment, 也可以直接注入Environment 这个类的Bean并使用
 *  <p>② EmbeddedValueResolverAware 注入嵌入式值解析器
 *      用于获取 StringValueResolver的一个扩展类，StringValueResolver用于获取
 *      基于String类型的properties的变量，一般我们可以通过 @Value注解去获取，但也可以通过该类去获取
 *  <p>③ ResourceLoaderAware 注入资源加载器
 *      ResourceLoader可以获取classpath内所有的资源对象
 *  <p>④ ApplicationEventPublisherAware 注入应用事件发布器
 *      用于发布事件，结合 {@link org.springframework.context.ApplicationListener} 共同使用
 *      该对象也可以通过spring注入的方式获取到
 *  <p>⑤ MessageSourceAware 注入消息资源
 *      MessageSource主要用于做国际化
 *  <p>⑥ ApplicationContextAware 注入应用上下文
 *      ApplicationContext是Spring上下文管理器，可以手动的获取任何在spring上下文注册的bean
 *      也可以扩展这个接口来缓存spring上下文，包装成静态方法，
 *      同时ApplicationContext也实现了BeanFactory，MessageSource,ApplicationEventPublisher等接口。
 * @author cuisongxu
 * @date 2023/1/22 11:13
 */
public class GExtension_ApplicationContextAwareProcessor {

    public static void main(String[] args) {

    }
}

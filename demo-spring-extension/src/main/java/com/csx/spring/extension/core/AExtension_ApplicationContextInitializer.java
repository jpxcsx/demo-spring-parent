package com.csx.spring.extension.core;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 扩展点1: ApplicationContextInitializer 应用上下文初始化器
 *      <p>这是整个spring容器在  刷新之前  初始化 ConfigurableApplicationContext 类型容器的回调接口
 *      允许用户在容器还未被初始化之前做一些事情
 * <p>使用场景: ① 激活初始化配置 ② 在class还没有被类加载器加载前进行动态字节码注入
 * <p>扩展方式: 由于spring容器此时还没有被初始化，因此想要扩展生效，需要特别操作
 *      <p>① 在启动类中用 springApplication.addInitializers(new ExtensionApplicationContextInitializer());
 *      <p>② 配置文件中配置:
 *          context.initializer.classes=com.csx.spring.extension.ExtensionApplicationContextInitializer
 *      <p>③ Spring SPI 扩展,在 spring.factories中加入
 *          org.springframework.context.ApplicationContextInitializer=com.csx.spring.extension.ExtensionApplicationContextInitializer
 * @author cuisongxu
 * @date 2023/1/22 9:47
 */
public class AExtension_ApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializer initialize");
    }
}

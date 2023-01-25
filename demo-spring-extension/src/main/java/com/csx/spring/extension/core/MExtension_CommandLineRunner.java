package com.csx.spring.extension.core;

import org.springframework.boot.CommandLineRunner;

/**
 * 扩展点13: {@link CommandLineRunner}
 * <p>调用时机:
 *      整个项目启动完毕后，触发执行。如果有多个 CommandLineRunner，可以利用 {@link org.springframework.core.annotation.Order} 进行排序
 * <p>使用场景:
 *      用户扩展此接口，进行启动项目之后的一些业务的预处理
 * @author cuisongxu
 * @date 2023/1/22 16:45
 */
public class MExtension_CommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner run");
    }
}

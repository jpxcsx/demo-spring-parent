package com.csx.spring.extension.core;

import org.springframework.beans.factory.DisposableBean;

/**
 *
 * 扩展点14: {@link org.springframework.beans.factory.DisposableBean}
 * 调用时机:
 *      当此对象销毁时，会自动执行这个方法。比如运行 applicationContext.registerShutdownHook时，会触发这个方法
 * 使用场景:
 * @author cuisongxu
 * @date 2023/1/22 16:46
 */
public class NExtension_DisposableBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }
}

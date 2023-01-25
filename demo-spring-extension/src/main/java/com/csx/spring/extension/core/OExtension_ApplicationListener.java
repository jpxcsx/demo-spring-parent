package com.csx.spring.extension.core;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * 扩展点15: {@link org.springframework.context.ApplicationListener}
 * <p>
 *      可以自定义一些事件，并利用自定义监听器监听自定义的事件对事件做处理
 *      可以罗列下spring主要的内置事件
 *      <p>① ContextRefreshedEvent:
 *          ApplicationContext 被初始化或刷新时，该事件被发布。这也可以在 {@link ConfigurableApplicationContext#refresh()}
 *          触发。
 *      <p>② ContextStartedEvent:
 *          当使用 {@link ConfigurableApplicationContext#start()} 启动 {@link org.springframework.context.ApplicationContext}
 *          时,该事件被发布时，你可以查询数据库或者重启任何停止的应用程序
 *      <p>③ ContextStoppedEvent:
 *          当使用 {@link ConfigurableApplicationContext#stop()}停止{@link org.springframework.context.ApplicationContext}
 *          时，发布这个事件，可以在接收到该事件时做必要的清理工作
 *      <p>④ ContextClosedEvent:
 *          当使用 {@link ConfigurableApplicationContext#close()}关闭{@link org.springframework.context.ApplicationContext}
 *          时，该事件被发布。一个已经完毕的上下文到达生命周期末端，它不能被刷新或重启
 *      <p>⑤ RequestHandledEvent:
 *          这是一个 web-specific 事件，告诉所有bean HTTP 请求已经被服务，只能应用于使用 {@link org.springframework.web.servlet.DispatcherServlet}
 *          的Web应用。在使用Spring作为前端的MVC控制器时，当Spring处理用户请求结束后，系统会自动触发该事件
 * </p>
 * @author cuisongxu
 * @date 2023/1/22 16:46
 */
public class OExtension_ApplicationListener {
}

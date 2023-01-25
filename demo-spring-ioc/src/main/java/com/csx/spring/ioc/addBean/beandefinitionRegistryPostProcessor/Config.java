package com.csx.spring.ioc.beandefinitionRegistryPostProcessor;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author cuisongxu
 * @date 2023/1/24 13:28
 */
@Configuration
@Import(com.csx.spring.ioc.beandefinitionRegistryPostProcessor.MyPostProcessor.class)
public class Config {
}

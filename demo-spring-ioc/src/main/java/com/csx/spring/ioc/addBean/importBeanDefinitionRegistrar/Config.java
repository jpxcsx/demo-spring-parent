package com.csx.spring.ioc.importBeanDefinitionRegistrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author cuisongxu
 * @date 2023/1/24 13:24
 */
@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class Config {
}

package com.csx.spring.ioc.importSelector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author cuisongxu
 * @date 2023/1/24 12:37
 */
@Configuration
@Import(MyImportSelector.class)
public class ImportSelectorConfig {
}

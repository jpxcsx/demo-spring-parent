package com.csx.spring.ioc.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author cuisongxu
 * @date 2023/1/24 12:35
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        // 使用metadata可以获取到导入该类的元类的大量属性，通过对这些属性进行判断，可以达到动态注入bean的效果
        boolean flag = metadata.hasAnnotation("org.springframework.context.annotation.Import");
        if(flag) {
            return new String[]{"com.csx.spring.ioc.importSelector.A"};
        }
        return new String[]{"com.csx.spring.ioc.importSelector.B"};
    }
}

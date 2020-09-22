package com.lazyboyl.niu13.core.config;

import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.Set;

/**
 * @author linzf
 * @since 2019/7/22
 * 类描述：实现拦截器的自定义的扫描
 */
public class ClassPathNiu13SecurityScanner extends ClassPathBeanDefinitionScanner {

    public ClassPathNiu13SecurityScanner(BeanDefinitionRegistry registry) {
        super(registry);
    }

    public ClassPathNiu13SecurityScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
        super(registry, useDefaultFilters);
    }

    public ClassPathNiu13SecurityScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters, Environment environment) {
        super(registry, useDefaultFilters, environment);
    }


    /**
     * 功能描述： 实现spring的的扫描注入
     * @param basePackages
     * @return
     */
    @Override
    public Set<BeanDefinitionHolder> doScan(String... basePackages) {
        Set<BeanDefinitionHolder> beanDefinitions = super.doScan(basePackages);

        if (beanDefinitions.isEmpty()) {
            logger.warn("No DgbSecurity Spring Componet was found in '" + Arrays.toString(basePackages) + "' package. Please check your configuration.");
        }

        return beanDefinitions;
    }

}

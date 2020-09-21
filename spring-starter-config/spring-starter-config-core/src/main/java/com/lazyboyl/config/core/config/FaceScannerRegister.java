package com.lazyboyl.config.core.config;

import com.lazyboyl.config.core.constant.FaceConstant;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.type.AnnotationMetadata;


import java.util.Properties;

/**
 * @author linzf
 * @since 2020/9/21
 * 类描述： 将默认的注解注入spring体系的
 */
public class FaceScannerRegister implements ImportBeanDefinitionRegistrar, EnvironmentAware {


    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        ConfigurableEnvironment c = (ConfigurableEnvironment) environment;
        MutablePropertySources m = c.getPropertySources();
        Properties p = new Properties();
        for (FaceConstant fc : FaceConstant.values()) {
            String val = environment.getProperty(fc.getKey());
            if (val == null || "".equals(val)) {
                p.put(fc.getKey(), fc.getDefaultValue());
            }
        }
        m.addFirst(new PropertiesPropertySource("defaultProperties", p));
    }

}

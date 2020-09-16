package com.lazyboyl.demo.config;

import com.lazyboyl.demo.auth.impl.UserAuthDefault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author linzf
 * @since 2020/9/16
 * 类描述： 配置类
 */
@Configuration
public class StarterAutoConfigure {

    private Logger log = LoggerFactory.getLogger(StarterAutoConfigure.class);

    /**
     * 功能描述： 当没有类实现UserAuth接口同时注入的时候默认注入UserAuthDefault
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(name = "userAuth")
    public UserAuthDefault userAuth() {
        log.info("-----我被初始化了-----");
        return new UserAuthDefault();
    }

}

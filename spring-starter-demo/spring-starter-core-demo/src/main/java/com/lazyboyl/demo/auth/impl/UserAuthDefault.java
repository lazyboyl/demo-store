package com.lazyboyl.demo.auth.impl;

import com.lazyboyl.demo.auth.UserAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author linzf
 * @since 2020/9/16
 * 类描述：
 */

public class UserAuthDefault implements UserAuth {

    private Logger log = LoggerFactory.getLogger(UserAuthDefault.class);

    @Override
    public boolean authAction(String url) {
        log.info("你当前请求的是一个默认的鉴权方法");
        return true;
    }
}

package com.lazyboyl.demo.two.auth;

import com.lazyboyl.demo.auth.UserAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author linzf
 * @since 2020/9/16
 * 类描述：
 */
@Component("userAuth")
public class UserAuthImpl implements UserAuth {

    private Logger log = LoggerFactory.getLogger(UserAuthImpl.class);

    @Override
    public boolean authAction(String url) {
        log.info("----我是被重新定义的鉴权的方法----");
        return false;
    }
}

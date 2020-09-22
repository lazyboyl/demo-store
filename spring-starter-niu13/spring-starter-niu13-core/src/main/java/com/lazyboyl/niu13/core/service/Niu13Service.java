package com.lazyboyl.niu13.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author linzf
 * @since 2020/9/21
 * 类描述：
 */
@Service
public class Niu13Service {

    private Logger log = LoggerFactory.getLogger(Niu13Service.class);

    @Value("${xxxface.url}")
    private String url;

    @Value("${xxxface.key}")
    private String key;

    public boolean faceCheck() {
        log.info("你正在使用{}通过{}来获取人脸识别的结果", key, url);
        return true;
    }

}

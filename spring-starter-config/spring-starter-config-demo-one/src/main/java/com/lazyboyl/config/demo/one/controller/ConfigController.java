package com.lazyboyl.config.demo.one.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2020/9/21
 * 类描述：
 */
@RestController
public class ConfigController {

    @Value("${xxxface.url}")
    private String url;

    @Value("${xxxface.key}")
    private String key;


    @GetMapping("test")
    public String test(){
        System.out.println(url + "=====" + key);
        return "test";
    }

}

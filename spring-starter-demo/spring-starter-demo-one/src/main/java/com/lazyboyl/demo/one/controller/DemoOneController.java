package com.lazyboyl.demo.one.controller;

import com.lazyboyl.demo.auth.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2020/9/16
 * 类描述：
 */
@RestController
public class DemoOneController {

    @Autowired
    private UserAuth userAuth;

    @GetMapping("test")
    public String test() {
        userAuth.authAction("test");
        return "test";
    }

}

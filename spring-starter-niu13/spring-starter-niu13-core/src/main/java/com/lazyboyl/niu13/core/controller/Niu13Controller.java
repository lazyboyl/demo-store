package com.lazyboyl.niu13.core.controller;

import com.lazyboyl.niu13.core.service.Niu13Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2020/9/22
 * 类描述：
 */
@RestController
public class Niu13Controller {

    @Autowired
    private Niu13Service niu13Service;


    @GetMapping("faceCheck")
    public String faceCheck(){
        niu13Service.faceCheck();
        return "人脸识别接口调用";
    }

}

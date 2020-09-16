package com.lazyboyl.demo.auth;

/**
 * @author linzf
 * @since 2020/9/16
 * 类描述： 实现用户的鉴权
 */
public interface UserAuth {

    /**
     * 功能描述： 实现用户的鉴权
     * @param url 响应的接口地址
     * @return 返回鉴权结果
     */
    boolean authAction(String url);

}

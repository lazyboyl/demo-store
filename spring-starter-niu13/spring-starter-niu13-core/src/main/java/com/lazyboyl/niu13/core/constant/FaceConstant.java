package com.lazyboyl.niu13.core.constant;

/**
 * @author linzef
 * 类描述： 配置属性的枚举类
 */

public enum FaceConstant {

    URL("xxxface.url","http://xxx.face.com/get"),
    KEY("xxxface.key","abcdefghijklmn");

    private String key;

    private String defaultValue;

    FaceConstant(String key, String defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public String getKey() {
        return key;
    }

    public String getDefaultValue() {
        return defaultValue;
    }


}

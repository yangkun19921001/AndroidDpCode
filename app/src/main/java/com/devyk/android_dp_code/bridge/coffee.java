package com.devyk.android_dp_code.bridge;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 16:47
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is coffee 定义一个抽象咖啡
 * </pre>
 */
public abstract class coffee {


    protected CoffeeAdditives impl;

    public coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 制作什么得咖啡由子类决定
     */
    public abstract void makeCoffee();
}

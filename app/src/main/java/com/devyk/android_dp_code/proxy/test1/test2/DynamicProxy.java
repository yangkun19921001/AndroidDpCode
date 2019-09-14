package com.devyk.android_dp_code.proxy.test1.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 12:00
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DynamicProxy
 * </pre>
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 代理者的引用（这里可以理解为 X 程序员）
     */
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过反射调用其代理者的方法
        return method.invoke(object,args);
    }
}

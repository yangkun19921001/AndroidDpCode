package com.devyk.android_dp_code.mediator.test2;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:50
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Mediator 抽象中介者
 * </pre>
 */
public abstract class Mediator {

    /**
     * 同事对象改变时通知中介者的方法
     * 在同事对象改变时由中介者去通知其它同事对象
     */
    public abstract void changed(Colleague c);
}

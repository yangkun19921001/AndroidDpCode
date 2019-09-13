package com.devyk.android_dp_code.mediator.test2;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:53
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Colleague 抽象同事
 * </pre>
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

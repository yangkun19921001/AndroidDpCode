package com.devyk.android_dp_code.mediator.test1;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:29
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ConcreteMediator 具体中介类
 * </pre>
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }
}

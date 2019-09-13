package com.devyk.android_dp_code.mediator.test1;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:28
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ConcreteColleagueB
 * </pre>
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void action() {
        System.out.println("ConcreteColleagueB 将信息递交给中介者处理");
    }
}

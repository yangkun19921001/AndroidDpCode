package com.devyk.android_dp_code.mediator.test1;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:25
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Mediator
 * </pre>
 */
public abstract class Mediator {
    /**
     * 具体同事类 A
     */
    protected ConcreteColleagueA concreteColleagueA;

    /**
     * 具体同事类 B
     */
    protected ConcreteColleagueB concreteColleagueB;

    /**
     * 抽象中介方法、子类实现
     */
    public abstract void  method();

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA){
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB){
        this.concreteColleagueB = concreteColleagueB;
    }

}

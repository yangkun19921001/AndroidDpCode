package com.devyk.android_dp_code.visitor;

import java.util.Random;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 12:25
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Manager 经理工作量
 * </pre>
 */
public class Manager extends Staff{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 一年做的产品数量
     * @return
     */
    public int getProducts(){
        return new Random().nextInt(10);
    }

}

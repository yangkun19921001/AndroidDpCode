package com.devyk.android_dp_code.visitor;

import java.util.Random;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 12:25
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Engineer 工程师
 * </pre>
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    /**
     * 工程师这一年写的代码量
     */
    public int getCodeLines(){
        return new Random().nextInt(10 * 10000);
    }
}

package com.devyk.android_dp_code.visitor;

import java.util.Random;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 12:17
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Staff 员工抽象类
 * </pre>
 */
public abstract class Staff {
    public String  name;

    /**
     * 员工 kpi
     */
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 接受公司领导层对员的访问
     * @param visitor
     */
    public abstract  void accept(Visitor visitor);
}

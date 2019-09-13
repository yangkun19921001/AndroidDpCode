package com.devyk.android_dp_code.visitor;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 12:24
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Visitor
 * </pre>
 */
public interface Visitor {

    /**
     * 访问工程师类型
     */
    public void visit(Engineer engineer);

    /**
     * 访问经理类型
     */
    public void visit(Manager leader);
}

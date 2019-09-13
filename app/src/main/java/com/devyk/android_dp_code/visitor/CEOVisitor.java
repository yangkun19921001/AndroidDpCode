package com.devyk.android_dp_code.visitor;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 12:35
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CEOVisitor CEO 访问者，只关注业绩
 * </pre>
 */
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("engineer = [" + "name: " + engineer.name + " kpi: " + engineer.kpi + "]");
    }

    @Override
    public void visit(Manager leader) {
        System.out.println("leader = [" + "name: " + leader.name + " kpi: " + leader.kpi + " 产品数量：" + leader.getProducts() + "]");

    }
}

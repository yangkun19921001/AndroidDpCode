package com.devyk.android_dp_code.visitor;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 12:39
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CTOVisitor CTO 访问者 关注员工的技术层面的贡献
 * </pre>
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("engineer = [" + engineer.name + " 代码行数："+engineer.getCodeLines()+"]");
    }

    @Override
    public void visit(Manager leader) {
        System.out.println("leader = [" + leader.name + " 产品数量："+leader.getProducts()+"]");
    }
}

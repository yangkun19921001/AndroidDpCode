package com.devyk.android_dp_code.proxy.test1;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 11:35
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is XProgrammer 具体诉讼人 也就是 X 程序员
 * </pre>
 */
public class XProgrammer implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("老板欠 X 程序员工资，申请仲裁!");

    }

    @Override
    public void burden() {
        System.out.println("这是合同书和过去一年的银行工资流水");

    }

    @Override
    public void defend() {
        System.out.println("证据确凿！不需要再说什么了！");

    }

    @Override
    public void finish() {
        System.out.println("诉讼成功！判决老板即日起 7 天内结算工资！");
    }
}

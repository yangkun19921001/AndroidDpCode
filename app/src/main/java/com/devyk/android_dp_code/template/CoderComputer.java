package com.devyk.android_dp_code.template;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 00:23
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CoderComputer 程序员的电脑
 * </pre>
 */
public class CoderComputer extends AbstractComputer {

    @Override
    protected void login() {
        System.out.println("密码输入完成，交于系统检查。");
        super.login();
    }
}

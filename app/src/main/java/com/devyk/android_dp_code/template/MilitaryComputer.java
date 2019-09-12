package com.devyk.android_dp_code.template;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 00:25
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is MilitaryComputer
 * </pre>
 */
public class MilitaryComputer extends AbstractComputer {

    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查防火墙");
    }

    @Override
    protected void login() {
        System.out.println("视网膜扫描 \n 视网膜验证成功");
        super.login();
    }
}

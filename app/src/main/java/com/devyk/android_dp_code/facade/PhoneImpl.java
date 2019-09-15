package com.devyk.android_dp_code.facade;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 16:03
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is PhoneImpl
 * </pre>
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");
    }
}

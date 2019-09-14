package com.devyk.android_dp_code.proxy.test1;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 11:27
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ILawsuit 诉讼接口类
 * </pre>
 */
public interface ILawsuit {

    /**
     * 提交申请
     */
    void submit();

    /**
     * 举行举证
     */
    void burden();

    /**
     * 开始辩护
     */
    void defend();

    /**
     * 诉讼完成
     */
    void finish();
}

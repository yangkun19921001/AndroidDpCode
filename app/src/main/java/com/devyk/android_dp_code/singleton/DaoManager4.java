package com.devyk.android_dp_code.singleton;

/**
 * <pre>
 *     author  : devyk on 2019-08-29 23:44
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DaoManager4 静态内部类单例模式
 * </pre>
 */
public class DaoManager4 {

    private DaoManager4(){}

    public static DaoManager4 getInstance(){
        return DaoManager4Holder.sInstance;
    }

    /**
     * 静态内部类
     *
     */
    private static class DaoManager4Holder{
        private static final DaoManager4 sInstance = new DaoManager4();
    }
}

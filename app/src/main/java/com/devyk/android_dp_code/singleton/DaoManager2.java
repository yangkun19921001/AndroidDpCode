package com.devyk.android_dp_code.singleton;

/**
 * <pre>
 *     author  : devyk on 2019-08-29 21:53
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DaoManager2
 * </pre>
 */
public class DaoManager2 {

    private static DaoManager2 instance;

    private DaoManager2(){}

    /**
     * 保证线程安全的懒汉式
     * @return
     */
    public static synchronized DaoManager2 getInstance(){
        if (null == instance) {
            instance = new DaoManager2();
        }
        return instance;
    }
}

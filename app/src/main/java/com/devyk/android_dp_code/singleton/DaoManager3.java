package com.devyk.android_dp_code.singleton;

/**
 * <pre>
 *     author  : devyk on 2019-08-29 22:03
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DaoManager3
 * </pre>
 */
public class DaoManager3 {

    private static DaoManager3 instance;

    private DaoManager3() {
    }

    /**
     * 保证线程安全的懒汉式
     *
     * @return
     */
    public static DaoManager3 getInstance() {
        if (null == instance) {
            synchronized (DaoManager3.class) {
                if (null == instance)
                    instance = new DaoManager3();
            }
        }
        return instance;
    }
}

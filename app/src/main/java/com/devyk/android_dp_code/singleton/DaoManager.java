package com.devyk.android_dp_code.singleton;

/**
 * <pre>
 *     author  : devyk on 2019-08-29 21:38
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DaoManager 饿汉式单例
 * </pre>
 */
public class DaoManager {

    /**
     * 饿汉式单例
     */
    private static DaoManager instance = new DaoManager();

    private DaoManager(){}

    public static DaoManager getInstance(){
        return instance;
    }



}

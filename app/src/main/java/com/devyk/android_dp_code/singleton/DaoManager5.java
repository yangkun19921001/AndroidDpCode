package com.devyk.android_dp_code.singleton;

import android.util.Log;

/**
 * <pre>
 *     author  : devyk on 2019-08-30 22:32
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DaoManager5
 * </pre>
 */
public enum  DaoManager5 {

    INSTANCE;

    public void doSomething(){
        Log.i("DAO->","枚举单例");
    }
}

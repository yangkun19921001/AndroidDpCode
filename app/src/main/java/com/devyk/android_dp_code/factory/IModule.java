package com.devyk.android_dp_code.factory;

import android.app.Fragment;

import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-04 23:31
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is IModule
 * </pre>
 */
public abstract class IModule {

    /**
     * 根据不同的权限 拿到功能模块
     * @param permission
     * @return
     */
    public abstract List<IFunctionModule> getMoudleFun(String permission);
}

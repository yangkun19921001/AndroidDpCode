package com.devyk.android_dp_code.state;

import android.content.Context;

/**
 * <pre>
 *     author  : devyk on 2019-09-07 18:04
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is IUserState
 * </pre>
 */
public interface IUserState {

    /**
     * 购物
     * @param id
     */
    void Shopping(Context context,int id);

    /**
     * 注销
     * @param context
     * @param token
     */
    void loginOut(Context context,String token);
}

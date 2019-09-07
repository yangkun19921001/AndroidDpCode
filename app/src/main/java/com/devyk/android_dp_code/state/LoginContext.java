package com.devyk.android_dp_code.state;

import android.content.Context;

/**
 * <pre>
 *     author  : devyk on 2019-09-07 18:03
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LoginContext 用户接口和状态管理类
 * </pre>
 */
public class LoginContext {
    /**
     * 用户状态 默认未登录
     */
    private IUserState mIuserState = new LogoutState();

    private LoginContext() {
    }

    public void shopping(Context context,int id) {
        mIuserState.Shopping(context,id);
    }

    /**
     * 静态内部类单例
     */
    private static class LoginHolder {
        private static LoginContext loginContext = new LoginContext();
    }

    public static LoginContext getInstance() {
        return LoginHolder.loginContext;
    }

    /**
     * 注入用户的状态
     * @param userState
     */
    public void setState(IUserState userState){
        this.mIuserState = userState;
    }
}

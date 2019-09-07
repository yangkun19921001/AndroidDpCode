package com.devyk.android_dp_code.state;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * <pre>
 *     author  : devyk on 2019-09-07 18:08
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LogoutState
 * </pre>
 */
public class LogoutState implements IUserState {
    private String TAG = getClass().getSimpleName();

    @Override
    public void Shopping(Context context, int id) {
        gotoLogin(context);

    }

    private void gotoLogin(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }

    @Override
    public void loginOut(Context context, String token) {
        Log.i(TAG, "已经是退出状态");
    }


}

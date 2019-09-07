package com.devyk.android_dp_code.state;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * <pre>
 *     author  : devyk on 2019-09-07 18:05
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LoginState
 * </pre>
 */
public class LoginState implements IUserState {
    private String TAG = getClass().getSimpleName();

    @Override
    public void Shopping(Context context,int id) {
        Log.i(TAG, "购买商品-》" + id + " 即将支付");
        Toast.makeText(context,"购买商品-》" + id + " 即将支付",Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginOut(Context context,String token) {
        Log.i(TAG, "退出系统成功");
        Toast.makeText(context,"退出系统成功",Toast.LENGTH_LONG).show();
    }
}

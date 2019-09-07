package com.devyk.android_dp_code.state;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.devyk.android_dp_code.R;

/**
 * <pre>
 *     author  : devyk on 2019-09-07 17:49
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is HomeActivity
 * </pre>
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
    }

    public void logout(View view) {
        LoginContext.getInstance().setState(new LogoutState());
    }

    public void shopping(View view) {
        LoginContext.getInstance().shopping(getApplicationContext(),199);
    }
}

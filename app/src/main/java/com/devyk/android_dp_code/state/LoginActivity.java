package com.devyk.android_dp_code.state;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.devyk.android_dp_code.R;

/**
 * <pre>
 *     author  : devyk on 2019-09-07 17:49
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LoginActivity
 * </pre>
 */
public class LoginActivity extends Activity {

    private EditText mUser;
    private EditText mPwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        mUser = findViewById(R.id.etUser);
        mPwd = findViewById(R.id.etPwd);

    }

    public void login(View view) {
        if (mUser.getText().toString().trim().equals("123456") && mPwd.getText().toString().trim().equals("123456")) {
            LoginContext.getInstance().setState(new LoginState());
            Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        }
    }
}

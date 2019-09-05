package com.devyk.android_dp_code.abstract_factory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Button;

/**
 * <pre>
 *     author  : devyk on 2019-09-05 22:37
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ThemeButton 抽象主题按钮类
 * </pre>
 */
@SuppressLint("AppCompatCustomView")
public  abstract class ThemeButton extends Button {
    public Context mContext;

    public ThemeButton(Context context) {
        super(context);
        mContext = context;

        initTextColor();

        initBackgroundColor()
        ;
    }

    /**
     * 初始话按钮颜色
     */
    public abstract void initTextColor();


    /**
     * 初始化按钮颜色
     */
    public abstract void initBackgroundColor();
}

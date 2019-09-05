package com.devyk.android_dp_code.abstract_factory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toolbar;

/**
 * <pre>
 *     author  : devyk on 2019-09-05 22:37
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ThemeToolbar
 * </pre>
 */
@SuppressLint("NewApi")
public abstract class ThemeToolbar extends Toolbar {
    public ThemeToolbar(Context context) {
        super(context);


        initIcon();

        initTextColor();

        initBackgroundColor()
        ;
    }

    /**
     * 初始化图标
     */
    public abstract void initIcon();

    /**
     * 初始话按钮颜色
     */
    public abstract void initTextColor();


    /**
     * 初始化按钮颜色
     */
    public abstract void initBackgroundColor();
}



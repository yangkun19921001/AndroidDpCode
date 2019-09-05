package com.devyk.android_dp_code.abstract_factory;

import android.content.Context;

/**
 * <pre>
 *     author  : devyk on 2019-09-05 22:34
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is AbstractThemeFactory 抽象主题工厂类
 * </pre>
 */
public abstract class AbstractThemeFactory {

    protected Context mContext;

    public AbstractThemeFactory(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * 创建主题按钮
     */
    public  abstract ThemeButton createButton();

    /**
     * 创建主题标题栏
     */
    public abstract  ThemeToolbar createToolbar();
}

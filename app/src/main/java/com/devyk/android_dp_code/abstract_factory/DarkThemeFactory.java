package com.devyk.android_dp_code.abstract_factory;

import android.content.Context;

/**
 * <pre>
 *     author  : devyk on 2019-09-05 22:39
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DarkThemeFactory 暗色系主题工厂类
 * </pre>
 */
public class DarkThemeFactory extends AbstractThemeFactory {
    public DarkThemeFactory(Context mContext) {
        super(mContext);
    }

    @Override
    public ThemeButton createButton() {
        return new ButtonDark(mContext);
    }

    @Override
    public ThemeToolbar createToolbar() {
        return new ToolbarDark(mContext);
    }
}

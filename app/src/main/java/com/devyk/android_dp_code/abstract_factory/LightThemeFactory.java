package com.devyk.android_dp_code.abstract_factory;

import android.content.Context;

/**
 * <pre>
 *     author  : devyk on 2019-09-05 22:43
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LightThemeFactory 亮色系主题工厂类
 * </pre>
 */
public class LightThemeFactory extends AbstractThemeFactory {
    public LightThemeFactory(Context mContext) {
        super(mContext);
    }

    @Override
    public ThemeButton createButton() {
        return new ButtonLight(mContext);
    }

    @Override
    public ThemeToolbar createToolbar() {
        return new ToolbarLight(mContext);
    }
}

package com.devyk.android_dp_code.abstract_factory;

import android.content.Context;
import android.os.Build;

import com.devyk.android_dp_code.R;

/**
 * <pre>
 *     author  : devyk on 2019-09-05 22:40
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ButtonDrak
 * </pre>
 */
class ButtonDark extends ThemeButton {
    public ButtonDark(Context mContext) {
        super(mContext);
    }

    @Override
    public void initTextColor() {
        setTextColor(mContext.getResources().getColor(R.color.dark_color));

    }

    @Override
    public void initBackgroundColor() {
        setBackgroundColor(mContext.getResources().getColor(R.color.dark_color));
    }
}

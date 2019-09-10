package com.devyk.android_dp_code.memorandum;

/**
 * <pre>
 *     author  : devyk on 2019-09-10 20:49
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Memorandum
 * </pre>
 */
public class Memorandum {
    public String text;
    public int cursor;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }
}

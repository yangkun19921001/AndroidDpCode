package com.devyk.android_dp_code.memorandum;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * <pre>
 *     author  : devyk on 2019-09-10 20:57
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is NodeEditText 编辑器
 * </pre>
 */
@SuppressLint("AppCompatCustomView")
public class NodeEditText extends EditText {
    public NodeEditText(Context context) {
        super(context);
    }

    public NodeEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NodeEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 创建备忘录对象，即存储编辑器的指定数据
     * @return
     */
    public Memorandum createMemorandum(){
        Memorandum memorandum = new Memorandum();
        memorandum.text = getText().toString().trim();
        memorandum.cursor = getSelectionStart();
        return memorandum;

    }

    /**
     * 从备忘录中恢复数据
     */
    public void restore(Memorandum memorandum){
        setText(memorandum.text);
        setSelection(memorandum.cursor);
    }


}

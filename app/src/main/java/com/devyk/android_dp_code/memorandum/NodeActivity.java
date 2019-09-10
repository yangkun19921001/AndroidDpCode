package com.devyk.android_dp_code.memorandum;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.devyk.android_dp_code.R;

/**
 * <pre>
 *     author  : devyk on 2019-09-10 21:03
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is NodeActivity
 * </pre>
 */
public class NodeActivity extends Activity {

    private NodeEditText etNode;


    protected NoteCaretaker mNoteCaretaker = new NoteCaretaker();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_node);

        initView();
    }

    private void initView() {
        etNode = findViewById(R.id.etNode);
    }

    /**
     * 点击保存
     *
     * @param view
     */
    public void save(View view) {
        mNoteCaretaker.saveMemorandum(etNode.createMemorandum());
        makeToast("保存笔记：");
    }

    /**
     * 撤销
     *
     * @param view
     */
    public void undo(View view) {
        etNode.restore(mNoteCaretaker.getPrevMemorandum());
        makeToast("撤销：");
    }

    /**
     * 重做
     *
     * @param view
     */
    public void redo(View view) {
        etNode.restore(mNoteCaretaker.getNextMemorandum());
        makeToast("重做：");
    }


    void makeToast(String msg) {
        Toast.makeText(getApplicationContext(), msg + etNode.getText() + ",光标位置：" + etNode.getSelectionStart(), Toast.LENGTH_SHORT).show();
    }
}

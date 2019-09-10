package com.devyk.android_dp_code.memorandum;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-10 20:47
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is NoteCaretaker 负责管理 Memorandum 备忘录
 * </pre>
 */
public class NoteCaretaker {

    /**
     * 最大存储容量
     */
    private static final int MAX = 50;

    /**
     * 初始化 50 个容量
     */
    private List<Memorandum> mMemorandumLists = new ArrayList<>(MAX);

    /**
     * 存档位置
     */
    private int mIndex = 0;


    /**
     * 保存备忘录到记录列表中
     */
    public void saveMemorandum(Memorandum memorandum) {
        if (mMemorandumLists.size() > MAX){
            mMemorandumLists.remove(0);
        }
        mMemorandumLists.add(memorandum);
        mIndex = mMemorandumLists.size() - 1;
    }

    /**
     * 获取上一个存档信息，相当于撤销功能
     */
    public Memorandum getPrevMemorandum(){
        mIndex = mIndex > 0 ? --mIndex : mIndex;
        return mMemorandumLists.get(mIndex);
    }

    /**
     * 获取下一个存档信息
     */
    public Memorandum getNextMemorandum(){
        mIndex = mIndex < mMemorandumLists.size() - 1? ++mIndex : mIndex;
        return mMemorandumLists.get(mIndex);
    }
}

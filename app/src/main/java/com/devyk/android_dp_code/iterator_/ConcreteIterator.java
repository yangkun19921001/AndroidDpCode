package com.devyk.android_dp_code.iterator_;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-11 23:55
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ConcreteIterator 具体迭代器类
 * </pre>
 */
public class ConcreteIterator<T> implements Iterator<T> {


    /**
     * 模拟用一个 List
     */
    private List<T> mList = new ArrayList<>();

    private int cursor = 0;


    public ConcreteIterator(List<T> list) {
        this.mList = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != mList.size();
    }

    @Override
    public T next() {
        //定义一个临时变量
        T obj = null;
        if (this.hasNext()) {
            obj = this.mList.get(cursor++);
        }
        return obj;
    }
}

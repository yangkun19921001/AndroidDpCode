package com.devyk.android_dp_code.iterator_;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-12 00:01
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ConcreteAggregate
 * </pre>
 */
public class ConcreteAggregate<T> implements Aggregate<T>{

    /**
     * 模拟具体容器
     */
    private List<T> mLists = new ArrayList<>();

    @Override
    public void add(T t) {
        mLists.add(t);
    }

    @Override
    public void remove(T t) {
        mLists.remove(t);

    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(mLists);
    }
}

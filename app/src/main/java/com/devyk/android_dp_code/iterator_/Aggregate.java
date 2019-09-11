package com.devyk.android_dp_code.iterator_;

/**
 * <pre>
 *     author  : devyk on 2019-09-11 23:59
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Aggregate 容器接口
 * </pre>
 */
public interface Aggregate<T> {

    /**
     * 添加一个对象
     * @param t
     */
    void add(T t);

    /**
     * 删除的对象
     * @param t
     */
    void remove(T t);

    /**
     * 获取容器的迭代器
     * @return
     */
    Iterator<T> iterator();

}

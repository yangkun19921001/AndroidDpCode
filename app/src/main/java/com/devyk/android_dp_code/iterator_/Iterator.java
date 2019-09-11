package com.devyk.android_dp_code.iterator_;

/**
 * <pre>
 *     author  : devyk on 2019-09-11 23:53
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Iterator 迭代器接口
 * </pre>
 */
public interface Iterator<T> {

    /**
     *  是否还有下一个元素
     * @return true 表示有，false 表示没有
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移动到下一位
     * @return
     */
    T next();
}

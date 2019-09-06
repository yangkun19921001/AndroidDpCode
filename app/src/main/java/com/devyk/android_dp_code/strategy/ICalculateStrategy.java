package com.devyk.android_dp_code.strategy;

/**
 * <pre>
 *     author  : devyk on 2019-09-06 00:01
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ICalculateStrategy 计算费用接口
 * </pre>
 */
public interface ICalculateStrategy {

    /**
     * 按距离计算车费
     * @param km  公里数
     * @return
     */
    int calculatePrice(int km);
}

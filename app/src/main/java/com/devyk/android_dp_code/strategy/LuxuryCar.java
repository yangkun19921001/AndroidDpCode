package com.devyk.android_dp_code.strategy;

/**
 * <pre>
 *     author  : devyk on 2019-09-06 00:07
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LuxuryCar
 * </pre>
 */
public class LuxuryCar implements ICalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km > 0 && km <= 5)
            return 8;
        if (km > 5 && km <= 7)
            return 13;
        if (km > 7 && km <= 10)
            return 15;
        return 13;
    }
}

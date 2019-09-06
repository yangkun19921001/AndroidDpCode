package com.devyk.android_dp_code.strategy;

/**
 * <pre>
 *     author  : devyk on 2019-09-06 00:06
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is GeneralCar 普通车
 * </pre>
 */
public class GeneralCar implements ICalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km > 0 && km <= 5)
            return 5;
        if (km > 5 && km <= 7)
            return 7;
        if (km > 7 && km <= 10)
            return 10;
        return 10;
    }
}

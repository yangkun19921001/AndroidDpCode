package com.devyk.android_dp_code.strategy;

/**
 * <pre>
 *     author  : devyk on 2019-09-06 00:16
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is TransportationCalculator
 * </pre>
 */
public class TransportationCalculator {

    /**
     * 交通工具计算费用策略类
     */
    private ICalculateStrategy iCalculateStrategy = new GeneralCar();


    /**
     * 设置策略
     * @param calculateStrategy
     */
    public void setStrategy(ICalculateStrategy calculateStrategy) {
        this. iCalculateStrategy = calculateStrategy;
    }


    public int calcu(int km){
        return iCalculateStrategy.calculatePrice(km);
    }
}

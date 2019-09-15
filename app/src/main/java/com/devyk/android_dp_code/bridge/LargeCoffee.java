package com.devyk.android_dp_code.bridge;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 16:50
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LargeCoffee 大杯咖啡
 * </pre>
 */
public class LargeCoffee  extends coffee{
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("制作大杯咖啡->" + impl.addSomething());

    }
}

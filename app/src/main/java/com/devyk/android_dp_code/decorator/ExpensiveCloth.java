package com.devyk.android_dp_code.decorator;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 14:02
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ExpensiveCloth
 * </pre>
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        //穿短袖
        dressShirt();
        //穿皮衣
        dressLeather();
        //穿牛仔裤
        dressJean();
    }

    private void dressShirt() {
        System.out.println("穿上短袖");
    }

    private void dressLeather() {
        System.out.println("穿上皮衣");
    }

    private void dressJean() {
        System.out.println("穿上牛仔裤");
    }
}

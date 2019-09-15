package com.devyk.android_dp_code.decorator;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 14:05
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CheapCloth
 * </pre>
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }

    private void dressShorts() {
        System.out.println("穿条短裤");
    }
}

package com.devyk.android_dp_code.decorator;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 14:01
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is PersonCloth
 * </pre>
 */
public abstract class PersonCloth extends Person {
    protected Person person
            ;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}

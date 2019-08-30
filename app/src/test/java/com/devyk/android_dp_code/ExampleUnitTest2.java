package com.devyk.android_dp_code;

import android.printservice.PrintService;

import org.junit.Test;

import java.util.HashSet;

/**
 * <pre>
 *     author  : devyk on 2019-08-30 15:14
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ExampleUnitTest2
 * </pre>
 */
public class ExampleUnitTest2 {


    @Test
    public void mian() {
        Person p1 = new Person("yangkun", 28);
        Person p2 = new Person("yangkun", 28);
        Person p3 = new Person("yangkun2", 28);
        Person p4 = new Person("yangkun3", 28);
        Person p5 = new Person("yangkun4", 28);


        HashSet<Person> h1 = new HashSet<>();
        h1.add(p1);
        h1.add(p2);
        h1.add(p3);
        h1.add(p4);
        h1.add(p5);
        System.out.println("p1 == p2 ? " + (p1 == p2));
        System.out.println("p1 == p2 ? " + (p1.equals(p2)));
        System.out.println("h1 " +h1);


    }

    /**
     * @desc Person类。
     */
    private static class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " - " + age;
        }

//        @Override
//        public int hashCode() {
//            return name.hashCode() + new Integer(age).hashCode();
//        }

        /**
         * 37          * @desc 覆盖equals方法
         * 38
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            //如果是同一个对象返回true，反之返回false
            if (this == obj) {
                return true;
            }

            //判断是否类型相同
            if (this.getClass() != obj.getClass()) {
                return false;
            }

            Person person = (Person) obj;
            return name.equals(person.name) && age == person.age;
        }
    }
}
package com.devyk.android_dp_code;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.printservice.PrintService;

import com.devyk.android_dp_code.abstract_factory.DarkThemeFactory;
import com.devyk.android_dp_code.abstract_factory.ThemeButton;
import com.devyk.android_dp_code.abstract_factory.ThemeToolbar;
import com.devyk.android_dp_code.builder.LoginManager;
import com.devyk.android_dp_code.factory.FunModuleFactor;
import com.devyk.android_dp_code.factory.IFunctionModule;
import com.devyk.android_dp_code.prototype.WordDocument;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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

    private Object obj1 = new Object();
    private Object obj2 = new Object();


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
        System.out.println("h1 " + h1);


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

    @Test
    public void test2() {

        LoginManager loginManager = new LoginManager.Builder()
                .isAutoLogin(true)
                .isBootLauncher(true)
                .isCrashOnRestart(true)
                .isSavePwd(true)
                .build();

        System.out.printf("loginManager:" + loginManager.toString());

    }

    @Test
    public void hashMapTest() {

    }

    private void showAlertDialog(Context context) {
        new AlertDialog.Builder(context)
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("测试数据")
                .setTitle("提示")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setNegativeButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).create()//最后一步就是在 Builder 中构建出 AlerDialog 对象，并初始化数据
                .show(); // 显示

    }

    @Test
    public void test4() {
        //1. 构建文档对象
        WordDocument wordDocument = new WordDocument();
        //2. 编辑文档
        wordDocument.setmTxt("今天是一个好天气");
        wordDocument.addImagepath("/sdcard/image.png");
        wordDocument.addImagepath("/sdcard/image2.png");
        wordDocument.addImagepath("/sdcard/image3.png");
        //打印文档内容
        wordDocument.println();


        System.out.println("--------------------开始clone-----\n\n");

        //以原始文档为准，copy 副本
        WordDocument cloneDoc = wordDocument.clone();

        System.out.println(" 打印副本，看看数据  \n\n");
        //打印副本，看看数据
        cloneDoc.println();

        //在副本文档上修改
        cloneDoc.setmTxt("副奔上修改文档：老龙王哭了");
        cloneDoc.addImagepath("/sdcard/副本发生改变");
        System.out.println("  打印修改后的副本  \n\n");
        //打印修改后的副本
        cloneDoc.println();
        System.out.println("----看会不会影响原始文档-----\n\n");
        //看会不会影响原始文档？？？？？？？
        wordDocument.println();

        System.out.println("内存地址：\nwordDocument: " + wordDocument.toString() + "\n" + "cloneDoc: " + cloneDoc.toString());

    }

    @Test
    public void test5() {
        new Thread("线程 1 ") {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("Thread: " + getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj2) {
                        System.out.printf("Thread: " + getName() + "---> synchronized");
                    }

                }

            }
        }.start();

        new Thread("线程 2 ") {
            @Override
            public void run() {
                synchronized (obj2) {
                    System.out.println("Thread: " + getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj1) {
                        System.out.println("Thread: " + getName() + "---> synchronized");
                    }
                }

            }
        }.start();
    }

    @Test
    public void test6() {
        Integer i11 = 333;
        Integer i22 = 333;
        System.out.println(i11 == i22);// 输出 false
        System.out.println(i11.equals(i22));// 输出 false
        Integer i33 = 127;
        Integer i44 = 127;
        System.out.println(i33 == i44);// 输出 true


        Integer i55 = 128;
        Integer i66 = 128;
        System.out.println(i55 == i66);// 输出 true
    }


    @Test
    public void test7() {

        FunModuleFactor funModuleFactor = new FunModuleFactor();
        List<IFunctionModule> vip = funModuleFactor.getMoudleFun("VIP");
        System.out.println("VIP:" + vip.size());


        List<IFunctionModule> kip = funModuleFactor.getMoudleFun("KIP");
        System.out.println("KIP:" + kip.size());

    }

    @Test
    public void testAbstractFactory(){
        DarkThemeFactory darkThemeFactory = new DarkThemeFactory(null);
        //创建暗色主题按钮
        ThemeButton button = darkThemeFactory.createButton();
        //创建亮色主题标题栏
        ThemeToolbar toolbar = darkThemeFactory.createToolbar();
    }
}

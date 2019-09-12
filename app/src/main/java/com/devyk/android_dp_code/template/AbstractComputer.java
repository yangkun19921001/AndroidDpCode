package com.devyk.android_dp_code.template;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 00:11
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is AbstractComputer 抽象模板
 * </pre>
 */
public abstract class AbstractComputer {

    /**
     * 开启电源
     */
    protected void powerOn(){
        System.out.println("开启电源");
    }

    /**
     * 硬件检查
     */
    protected void checkHardware(){
        System.out.println("硬件检查");
    }

    /**
     * 加载系统
     */
    protected void loadSystem(){
        System.out.println("加载系统");
    }


    /**
     * 屏幕显示
     */
    protected void showScreen(){
        System.out.println("屏幕显示");
    }

    /**
     * 输入用户信息
     */
    protected void login(){
        System.out.println("密码验证成功，进入主页面。");
    }

    /**
     * 启动计算机方法，步骤固定为开启电源、硬件检查、加载系统、屏幕显示、登录。设计为 final 防止被重写
     */
    public final void startUp(){
        System.out.println("------>>>>>>>   startup  ");
        powerOn();
        checkHardware();
        loadSystem();
        showScreen();
        login();
        System.out.println("------>>>>>>>   Successful");
    }
}

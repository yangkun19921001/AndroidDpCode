package com.devyk.android_dp_code.builder;

/**
 * <pre>
 *     author  : devyk on 2019-09-01 16:48
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is LoginManager
 * </pre>
 */
public class LoginManager {

    /**
     * 记住密码
     */
    private boolean isSavePwd;
    /**
     * 自动登录
     */
    private boolean isAutoLogin;
    /**
     * 开机自启动
     */
    private boolean isBootLauncher;
    /**
     * 崩溃重启
     */
    private boolean isCrashOnRestart;



    public LoginManager(Builder builder){
        this.isAutoLogin = builder.isAutoLogin;
        this.isBootLauncher = builder.isBootLauncher;
        this.isCrashOnRestart = builder.isCrashOnRestart;
        this.isSavePwd = builder.isSavePwd;
    }

    public boolean isSavePwd() {
        return isSavePwd;
    }

    public boolean isAutoLogin() {
        return isAutoLogin;
    }

    public boolean isBootLauncher() {
        return isBootLauncher;
    }

    public boolean isCrashOnRestart() {
        return isCrashOnRestart;
    }

    public static class Builder{
        /**
         * 记住密码
         */
         boolean isSavePwd;
        /**
         * 自动登录
         */
         boolean isAutoLogin;
        /**
         * 开机自启动
         */
         boolean isBootLauncher;
        /**
         * 崩溃重启
         */
         boolean isCrashOnRestart;

        public Builder(){
            this.isSavePwd = false;
            this.isAutoLogin = false;
            this.isBootLauncher = false;
            this.isCrashOnRestart = false;
        }

        public Builder isSavePwd(boolean savePwd){
            this.isSavePwd = savePwd;
            return this;
        }

        public Builder isAutoLogin(boolean autoLogin){
            this.isAutoLogin = autoLogin;
            return this;
        }

        public Builder isBootLauncher(boolean bootLauncher){
            this.isBootLauncher = bootLauncher;
            return this;
        }

        public Builder isCrashOnRestart(boolean onReStartApp){
            this.isCrashOnRestart = onReStartApp;
            return this;
        }

        /**
         * 最后构建出来
         * @return
         */
        public LoginManager build(){
            return new LoginManager(this);
        }

    }

    @Override
    public String toString() {
        return "LoginManager{" +
                "isSavePwd=" + isSavePwd +
                ", isAutoLogin=" + isAutoLogin +
                ", isBootLauncher=" + isBootLauncher +
                ", isCrashOnRestart=" + isCrashOnRestart +
                '}';
    }
}

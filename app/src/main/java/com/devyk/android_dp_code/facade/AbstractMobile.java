package com.devyk.android_dp_code.facade;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 16:08
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is AbstractMobile
 * </pre>
 */
public abstract class AbstractMobile {
    /**
     * 定义一个打电话功能
     */
    protected Phone phone = null;

    /**
     * 定义一个拍照功能
     */
    protected ICamera camera = null;

    public AbstractMobile(Phone phone, ICamera camera) {
        this.phone = phone;
        this.camera = camera;
    }

    public abstract void dail();

    public abstract void videoChat();

    public abstract void hangup();

    public abstract void takePicture();

    public abstract void stop();
}

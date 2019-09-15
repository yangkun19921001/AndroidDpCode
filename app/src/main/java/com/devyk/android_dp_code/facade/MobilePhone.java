package com.devyk.android_dp_code.facade;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 16:00
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is MobilePhone 定义一个手机类
 * </pre>
 */
public class MobilePhone extends AbstractMobile {


    public MobilePhone(Phone phone, ICamera camera) {
        super(phone, camera);
    }

    public void dail() {
        phone.dail();

    }

    ;

    @Override
    public void videoChat() {
        System.out.println("视频聊天呼叫中...");
        camera.openCamera();
    }

    @Override
    public void hangup() {
        phone.hangup();
    }

    @Override
    public void takePicture() {
        camera.takePicture();
    }

    @Override
    public void stop() {
        camera.stop();
        phone.hangup();
    }

}

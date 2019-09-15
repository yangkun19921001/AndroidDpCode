package com.devyk.android_dp_code.facade;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 16:05
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CameraImpl
 * </pre>
 */
public class CameraImpl implements ICamera {
    @Override
    public void openCamera() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void stop() {
        System.out.println("关闭相机");
    }
}

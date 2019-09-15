package com.devyk.android_dp_code.facade;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 16:03
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ICamera
 * </pre>
 */
public interface ICamera {

    /**
     * 打开相机预览
     */
    public void openCamera();

    /**
     * 拍照
     */
    public void takePicture();

    /**
     * 关闭相机
     */
    public void stop();
}

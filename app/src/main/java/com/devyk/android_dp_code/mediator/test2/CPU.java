package com.devyk.android_dp_code.mediator.test2;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:59
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CPU 同事
 * </pre>
 */
public class CPU extends Colleague {
    private String dataVideo, dataSound;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 获取视频数据
     *
     * @return
     */
    public String getDataVideo() {
        return dataVideo;
    }

    /**
     * 获取音频数据
     *
     * @return
     */
    public String getDataSound() {
        return dataSound;
    }

    /**
     * 解码数据
     *
     * @param data
     */
    public void decodeData(String data) {
        String[] temp = data.split(",");
        //解析音视频数据
        this.dataVideo = temp[0];
        this.dataSound = temp[1];

        //告诉中介者自身状态改变
        mediator.changed(this);
    }
}

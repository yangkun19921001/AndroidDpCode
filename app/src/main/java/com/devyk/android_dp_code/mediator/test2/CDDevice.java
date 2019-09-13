package com.devyk.android_dp_code.mediator.test2;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:59
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CDDevice 光驱同事
 * </pre>
 */
public class CDDevice extends Colleague {
    private String videoData;//视频数据
    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    /**
     * 读取视频数据
     * @return
     */
    public String read(){
        return videoData;
    }

    /**
     * 加载视频数据
     */
    public void load(){
        videoData = "视频数据,音频数据";
        mediator.changed(this);
    }
}

package com.devyk.android_dp_code.mediator.test2;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:59
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is GraphicsCard 显卡
 * </pre>
 */
public class GraphicsCard extends Colleague{
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String url){
        System.out.println("视频 = [" + url + "]");
    }
}

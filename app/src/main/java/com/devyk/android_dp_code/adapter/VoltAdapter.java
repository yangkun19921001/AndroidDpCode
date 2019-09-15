package com.devyk.android_dp_code.adapter;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 11:06
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is VoltAdapter
 * </pre>
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

    private Volt220 mVolt220;

    public VoltAdapter(Volt220 mVolt220) {
        this.mVolt220 = mVolt220;
    }

    @Override
    public int getVolt220() {
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}

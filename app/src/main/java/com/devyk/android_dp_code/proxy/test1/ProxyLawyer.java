package com.devyk.android_dp_code.proxy.test1;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 11:41
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ProxyLawyer 代理律师
 * </pre>
 */
public class ProxyLawyer implements ILawsuit {
    /**
     * 持有一个具体被代理者的引用，这里就是 X 程序员，也可以是其它 Y 程序员 只是具体说明。
     */
    private ILawsuit mLawsuit;

    public ProxyLawyer(ILawsuit lawsuit) {
        mLawsuit = lawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}

package com.devyk.android_dp_code.factory;

import android.app.Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-04 23:43
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is FunModuleFactor
 * </pre>
 */
public class FunModuleFactor extends IModule {

    @Override
    public List<IFunctionModule> getMoudleFun(String permission) {
        switch (permission) {
            case "VIP":
                List<IFunctionModule> vipLists = new ArrayList<>();
                vipLists.add(new PlayMusicImpl());
                vipLists.add(new PlayVideoImpl());
                vipLists.add(new NewsImpl());
                return vipLists;
            default:
                List<IFunctionModule> kipLists = new ArrayList<>();
                kipLists.add(new PlayMusicImpl());
                kipLists.add(new NewsImpl());
                return kipLists;
        }
    }
}

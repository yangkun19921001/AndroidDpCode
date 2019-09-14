package com.devyk.android_dp_code.component;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 17:21
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Composite 具体枝干节点
 * </pre>
 */
public class Composite extends Component {
    /**
     * 存储节点的容器
     */
    private List<Component> mLists = new ArrayList<>();


    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("name: " + name);
        if (mLists != null && mLists.size() > 0) {
            for (Component component : mLists) {
                component.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component component) {
        mLists.add(component);
    }

    @Override
    public void removeChild(Component component) {
        mLists.remove(component);
    }

    @Override
    public Component getChildren(int index) {
        return mLists.get(index);
    }
}

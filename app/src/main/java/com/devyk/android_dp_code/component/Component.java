package com.devyk.android_dp_code.component;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 17:17
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Component 抽象根节点
 * </pre>
 */
public abstract class Component {


    /**
     * 节点名称
     */
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 具体的逻辑方法由子类实现
     */
    public abstract void doSomething();

    /**
     * 添加子节点
     * @param component
     */
    public abstract void addChild(Component component);

    /**
     * 移除子节点
     * @param component
     */
    public abstract void removeChild(Component component);

    /**
     * 获取子节点
     * @param index
     * @return
     */
    public abstract Component getChildren(int index);

}

package com.devyk.android_dp_code.component.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 17:37
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Dir 文件、文件夹抽象类
 * </pre>
 */
public abstract class Dir {
    /**
     * 声明一个 List 成员变量存储文件夹下面所有元素
     */
    protected List<Dir> mDirs = new ArrayList<>();

    /**
     * 当前文件或文件夹名称
     */
    protected String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或文件夹
     * @param dir
     */
    public abstract void addDir(Dir dir);

    /**
     * 移除一个文件或文件夹
     * @param dir
     */
    public abstract void removeDir(Dir dir);

    /**
     * 清空文件夹下面所有的元素
     */
    public abstract void clear();

    /**
     * 输出文件夹下目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有的文件或子文件夹
     */
    public abstract List<Dir> getFiles();

    /**
     * 获取文件或文件夹名称
     * @return
     */
    public String getName(){
        return name;
    }
}

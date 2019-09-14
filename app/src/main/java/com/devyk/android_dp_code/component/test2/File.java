package com.devyk.android_dp_code.component.test2;

import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 17:46
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is File
 * </pre>
 */
public class File extends Dir {
    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void removeDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void print() {
        System.out.println("name: "+name);
    }

    @Override
    public List<Dir> getFiles() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }
}

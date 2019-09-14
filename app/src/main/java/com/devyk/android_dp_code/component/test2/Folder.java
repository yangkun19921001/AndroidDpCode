package com.devyk.android_dp_code.component.test2;

import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-14 17:42
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is Folder
 * </pre>
 */
public class Folder extends Dir {
    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        mDirs.add(dir);

    }

    @Override
    public void removeDir(Dir dir) {
        mDirs.remove(dir);
    }

    @Override
    public void clear() {
        mDirs.clear();
    }

    @Override
    public void print() {
        System.out.print(getName() + " (");
        Iterator<Dir> iterator = mDirs.iterator();
        while (iterator.hasNext()) {
            Dir dir = iterator.next();
            dir.print();
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }

    @Override
    public List<Dir> getFiles() {
        return mDirs;
    }
}

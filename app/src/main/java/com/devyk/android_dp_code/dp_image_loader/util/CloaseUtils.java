package com.devyk.android_dp_code.dp_image_loader.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * <pre>
 *     author  : devyk on 2019-08-28 00:13
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is CloaseUtils
 * </pre>
 */
public class CloaseUtils {

    public static void close(Closeable... closeable) {
        if (closeable != null) {
            try {
                if (closeable.length == 1 && closeable[0] != null){
                    closeable[0].close();
                    return;
                }
                for (int i = 0; i < closeable.length; i++) {
                    closeable[i].close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

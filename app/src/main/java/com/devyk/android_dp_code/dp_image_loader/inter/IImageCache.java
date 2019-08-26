package com.devyk.android_dp_code.dp_image_loader.inter;

import android.graphics.Bitmap;

/**
 * <pre>
 *     author  : devyk on 2019-08-27 00:13
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is IImageCache
 * </pre>
 */
public interface IImageCache {

    /**
     * 存图片
     */
    void put(String url, Bitmap bitmap);

    /**
     * 获取图片
     */
    Bitmap get(String url);
}

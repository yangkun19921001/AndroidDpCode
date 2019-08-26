package com.devyk.android_dp_code.dp_image_loader.cache;

import android.graphics.Bitmap;

import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;

/**
 * <pre>
 *     author  : devyk on 2019-08-27 00:12
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is MemoryCache 对图片内存缓存
 * </pre>
 */
public class MemoryCache implements IImageCache
{
    @Override
    public void put(String url, Bitmap bitmap) {

    }

    @Override
    public Bitmap get(String url) {
        return null;
    }
}

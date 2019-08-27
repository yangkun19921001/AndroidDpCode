package com.devyk.android_dp_code.dp_image_loader.cache;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;

import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;
import com.devyk.android_dp_code.dp_image_loader.util.ImageLoaderUtils;

/**
 * <pre>
 *     author  : devyk on 2019-08-27 00:12
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is MemoryCache 对图片内存缓存
 * </pre>
 */
public class MemoryCache implements IImageCache {

    /**
     * 初始化内存缓存
     */
    private LruCache<String, Bitmap> mMemoryLru;

    public MemoryCache() {
        init();
    }

    private void init() {
        int currentMaxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //内存缓存的大小
        int cacheSize = currentMaxMemory / 8;
        mMemoryLru = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getByteCount() / 1024;
            }
        };
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        String key = ImageLoaderUtils.hashKeyForDisk(url);
        mMemoryLru.put(key, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        String key = ImageLoaderUtils.hashKeyForDisk(url);
        return mMemoryLru.get(key);
    }
}

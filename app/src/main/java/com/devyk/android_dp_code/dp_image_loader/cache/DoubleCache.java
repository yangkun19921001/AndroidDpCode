package com.devyk.android_dp_code.dp_image_loader.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;
import com.devyk.android_dp_code.dp_image_loader.util.ImageLoaderUtils;

/**
 * <pre>
 *     author  : devyk on 2019-08-27 20:19
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DoubleCache
 * </pre>
 */
public class DoubleCache implements IImageCache {

    private String TAG = getClass().getSimpleName();

    /**
     * 内存缓存
     */
    private IImageCache mMemoryCache;

    /**
     * 磁盘缓存
     */
    private IImageCache mDiskCache;

    public DoubleCache(Context context) {
        this.mMemoryCache = new MemoryCache();
        this.mDiskCache = new DiskCache(context);
    }

    @Override
    public void put(String key, Bitmap bitmap) {
        mMemoryCache.put(key, bitmap);
        mDiskCache.put(key, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if (bitmap != null) {
            Log.i(TAG,"使用内存缓存");
            return bitmap;
        }
        Log.i(TAG,"使用磁盘缓存");
        return mDiskCache.get(url);
    }
}

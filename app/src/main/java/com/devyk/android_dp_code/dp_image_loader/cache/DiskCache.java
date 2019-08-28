package com.devyk.android_dp_code.dp_image_loader.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;
import com.devyk.android_dp_code.dp_image_loader.util.CacheUtils;
import com.devyk.android_dp_code.dp_image_loader.util.CloaseUtils;
import com.devyk.android_dp_code.dp_image_loader.util.ImageLoaderUtils;
import com.jakewharton.disklrucache.DiskLruCache;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <pre>
 *     author  : devyk on 2019-08-27 20:19
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DiskCache 本地磁盘缓存
 * </pre>
 */
public class DiskCache implements IImageCache {

    private DiskLruCache mDiskLruCache;

    private static final int MAX_SIZE = 10 * 1024 * 1024;//10MB
    //IO缓存流大小
    private static final int IO_BUFFER_SIZE = 8 * 1024;

    //缓存个数
    private static final int DISK_CACHE_INDEX = 0;

    public DiskCache(Context context) {
        try {
            File cacheDir = CacheUtils.getDiskCacheDir(context, "bitmapCache");
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }
            mDiskLruCache = DiskLruCache.open(cacheDir, ImageLoaderUtils.getAppVersion(context), 1, MAX_SIZE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void put(String url, Bitmap bitmap) {
        DiskLruCache.Snapshot snapshot = null;
        BufferedOutputStream out = null;
        BufferedInputStream in = null;
        String key = ImageLoaderUtils.hashKeyForDisk(url);
        try {
            snapshot = mDiskLruCache.get(key);
            if (snapshot != null) {
                DiskLruCache.Editor editor = mDiskLruCache.edit(key);
                if (editor != null) {
                    InputStream inputStream = ImageLoaderUtils.bitmap2InputStream(bitmap, 50);
                    in = new BufferedInputStream(inputStream, IO_BUFFER_SIZE);
                    out = new BufferedOutputStream(editor.newOutputStream(DISK_CACHE_INDEX), IO_BUFFER_SIZE);
                    int b;
                    while ((b = in.read()) != -1) {
                        out.write(b);
                    }
                    editor.commit();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            CloaseUtils.close(snapshot, out, in);
        }
    }

    @Override
    public Bitmap get(String url) {
        //通过key值在缓存中找到对应的Bitmap
        Bitmap bitmap = null;
        InputStream fileInputStream = null;
        String key = ImageLoaderUtils.hashKeyForDisk(url);
        try {
            DiskLruCache.Snapshot snapshot = mDiskLruCache.get(key);
            if (snapshot == null) return null;
            //得到文件输入流
            fileInputStream = snapshot.getInputStream(DISK_CACHE_INDEX);
            if (fileInputStream != null)
                bitmap = BitmapFactory.decodeStream(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            CloaseUtils.close(fileInputStream);
        }
        return bitmap;
    }


}

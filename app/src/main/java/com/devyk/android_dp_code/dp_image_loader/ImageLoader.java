package com.devyk.android_dp_code.dp_image_loader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;

import com.devyk.android_dp_code.dp_image_loader.cache.DiskCache;
import com.devyk.android_dp_code.dp_image_loader.cache.MemoryCache;
import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;
import com.jakewharton.disklrucache.DiskLruCache;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <pre>
 *     author  : devyk on 2019-08-27 00:11
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ImageLoader
 * </pre>
 */
public class ImageLoader {
    private String TAG = getClass().getSimpleName();


    /**
     * 默认内存缓存
     */
    private IImageCache mMemoryCache;

    /**
     * 线程池
     */
    private ExecutorService mExecutorService;

    /**
     * 主线程管理
     */
    private Handler mHandler = new Handler(Looper.getMainLooper());

    private static ImageLoader instance;

    public static ImageLoader getInstance() {
        if (instance == null)
            instance = new ImageLoader();

        return instance;
    }

    public ImageLoader() {
        mMemoryCache = new MemoryCache();
        //线程池，线程数据量为 CPU 的数量
        mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    /**
     * 用户配置缓存策略
     *
     * @param imageCache
     */
    public void setImageCache(IImageCache imageCache) {
        this.mMemoryCache = imageCache;
    }

    /**
     * 加载图片
     */
    public void loadImage(final String url, final ImageView imageView) {
        Bitmap bitmap = mMemoryCache.get(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }

        imageView.setTag(url);

        //如果内存缓存中没有图片，就开启网络请求去下载
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap downBitmap = downloadImage(url);
                if (downBitmap == null) return;
                if (imageView.getTag().equals(url)) {
                    displayImage(downBitmap, imageView);
                }

            }
        });

    }

    /**
     * 显示图片
     *
     * @param downBitmap
     * @param imageView
     */
    private void displayImage(final Bitmap downBitmap, final ImageView imageView) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "下载图片");
                imageView.setImageBitmap(downBitmap);
            }
        });

    }

    /**
     * 下载图片
     *
     * @param imageUrl
     * @return
     */
    private Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            //拿到请求到图片输入流
            InputStream inputStream = urlConnection.getInputStream();
            bitmap = BitmapFactory.decodeStream(inputStream);
            urlConnection.disconnect();
            //将图片缓存
            mMemoryCache.put(imageUrl, bitmap);
            //关闭连接
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

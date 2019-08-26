package com.devyk.android_dp_code.dp_image_loader;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import com.devyk.android_dp_code.dp_image_loader.cache.MemoryCache;

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


    /**
     * 内存缓存
     */
   private MemoryCache mMemoryCache ;

    /**
     * 线程池
     */
    private ExecutorService mExecutorService;

    /**
     * 主线程管理
     */
    private Handler mHandler = new Handler(Looper.getMainLooper());

    private static ImageLoader instance;

    public static ImageLoader getInstance(){
        if (instance == null)
            instance = new ImageLoader();

        return instance;
    }

    public ImageLoader(){
        mMemoryCache = new MemoryCache();
        //线程池，线程数据量为 CPU 的数量
        mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    /**
     * 加载图片
     */
    public void loadImage(String url, ImageView imageView){

    }
}

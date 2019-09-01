package com.devyk.android_dp_code.dp_image_loader.config;

import com.devyk.android_dp_code.dp_image_loader.cache.MemoryCache;
import com.devyk.android_dp_code.dp_image_loader.http.HttpURLConnectionDownloaderImp;
import com.devyk.android_dp_code.dp_image_loader.inter.IDownloader;
import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;

/**
 * <pre>
 *     author  : devyk on 2019-09-01 19:03
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ImageLoaderConfig
 * </pre>
 */
public class ImageLoaderConfig {
    /**
     * 图片缓存对象
     */
    public IImageCache imageCache = new MemoryCache();

    /**
     * 允许最大线程数量
     */
    public int threadCount = -1;

    /**
     * 失败显示的图片配置
     */
    public int errorIcon = -1;

    /**
     * 图片下载
     */
    public IDownloader downloader = new HttpURLConnectionDownloaderImp();


    private ImageLoaderConfig() {
    }

    /**
     * 配置 Builder
     */
    public static class Builder {
        /**
         * 图片缓存对象
         */
        IImageCache imageCache = new MemoryCache();

        /**
         * 允许最大线程数量
         */
        int threadCount = Runtime.getRuntime().availableProcessors() + 1;

        /**
         * 失败显示的图片配置
         */
        int errorIcon = -1;

        /**
         * 图片下载
         */
        IDownloader downloader = new HttpURLConnectionDownloaderImp();


        //设置线程数量
        public Builder setThreadCount(int threadCount) {
            this.threadCount = threadCount;
            return this;
        }

        //设置缓存
        public Builder setCache(IImageCache iImageCache) {
            this.imageCache = iImageCache;
            return this;
        }

        //图片下载
        public Builder setDownLoader(IDownloader iDownloader) {
            this.downloader = iDownloader;
            return this;
        }

        //设置显示失败的图片
        public Builder setLoaderErrorIcon(int icon) {
            this.errorIcon = icon;
            return this;
        }


        private void applyConfig(ImageLoaderConfig config) {
            config.errorIcon = this.errorIcon;
            config.imageCache = this.imageCache;
            config.threadCount = this.threadCount;
            config.downloader = this.downloader;
        }

        /**
         * 根据已经设置好的属性创建配置好对象
         */
        public ImageLoaderConfig create() {
            ImageLoaderConfig config = new ImageLoaderConfig();
            applyConfig(config);
            return config;
        }
    }

}

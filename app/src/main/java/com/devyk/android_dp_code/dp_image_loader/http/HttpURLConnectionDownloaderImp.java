package com.devyk.android_dp_code.dp_image_loader.http;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.devyk.android_dp_code.dp_image_loader.inter.IDownloader;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * <pre>
 *     author  : devyk on 2019-08-28 23:53
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is HttpURLConnectionDownloaderImp
 * </pre>
 */
public class HttpURLConnectionDownloaderImp implements IDownloader {
    @Override
    public Bitmap downLoader(String url) {
        return downloadImage(url);
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
            //关闭连接
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.devyk.android_dp_code.dp_image_loader.inter;

import android.graphics.Bitmap;

/**
 * <pre>
 *     author  : devyk on 2019-08-28 23:51
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is IDownloader
 * </pre>
 */
public interface IDownloader {

    /**
     * 下载图片
     */
    Bitmap downLoader(String url);
}

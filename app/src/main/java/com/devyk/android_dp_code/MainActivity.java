package com.devyk.android_dp_code;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.devyk.android_dp_code.dp_image_loader.ImageLoader;
import com.devyk.android_dp_code.dp_image_loader.adapter.ImageAdapter;
import com.devyk.android_dp_code.dp_image_loader.cache.DoubleCache;
import com.devyk.android_dp_code.dp_image_loader.config.ImageLoaderConfig;
import com.devyk.android_dp_code.dp_image_loader.http.HttpURLConnectionDownloaderImp;
import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_item);

        config();
        listView.setAdapter(new ImageAdapter(getApplicationContext()));


    }

    /**
     * 初始化配置
     */
    public void config() {
        ImageLoaderConfig config = new ImageLoaderConfig.Builder()
                .setCache(new DoubleCache(getApplicationContext()))
                .setLoaderErrorIcon(R.drawable.ic_launcher_background)
                .setThreadCount(10)
                .setDownLoader(new HttpURLConnectionDownloaderImp())
                .create();
        ImageLoader.getInstance().init(config);
    }


}

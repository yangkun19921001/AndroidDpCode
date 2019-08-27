package com.devyk.android_dp_code;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ListView;

import com.devyk.android_dp_code.dp_image_loader.ImageLoader;
import com.devyk.android_dp_code.dp_image_loader.adapter.ImageAdapter;
import com.devyk.android_dp_code.dp_image_loader.cache.DoubleCache;
import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_item);

        config();
        listView.setAdapter(new ImageAdapter(getApplicationContext()));

    }

    public void config() {
        //使用双缓存
        ImageLoader.getInstance().setImageCache(new DoubleCache(getApplicationContext()));

        //用户自定义
        ImageLoader.getInstance().setImageCache(new IImageCache() {
            @Override
            public void put(String url, Bitmap bitmap) {

            }

            @Override
            public Bitmap get(String url) {
                return null;
            }
        });
    }
}

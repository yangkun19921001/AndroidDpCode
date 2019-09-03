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
import com.devyk.android_dp_code.prototype.IntentUtils;

public class MainActivity extends Activity {

    private Object obj1 = new Object();
    private Object obj2 = new Object();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_item);

        config();
        listView.setAdapter(new ImageAdapter(getApplicationContext()));

        test5();


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

    public void test5(){
        new Thread("线程 1 "){
            @Override
            public void run() {
                synchronized (obj1){
                    System.out.println("Thread: "+getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj2){
                        System.out.println("Thread: "+getName() + "---> synchronized");
                    }

                }

            }
        }.start();

        new Thread("线程 2 "){
            @Override
            public void run() {
                synchronized (obj1){
                    System.out.println("Thread: "+getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj2){
                        System.out.println("Thread: "+getName() + "---> synchronized");
                    }
                }

            }
        }.start();
    }

    public void clone(View view) {
        startActivity(IntentUtils.toSMS());

    }


    /**
     *
     *  Thread: 线程 1 ---> 进入线程
     *  Thread: 线程 1 -----> waiting
     *  Thread: 线程 1 ---> synchronized
     *
     *  Thread: 线程 2 ---> 进入线程
     *  Thread: 线程 2 -----> waiting
     *  Thread: 线程 2 ---> synchronized
     */
}

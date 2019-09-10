package com.devyk.android_dp_code;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.devyk.android_dp_code.dp_image_loader.ImageLoader;
import com.devyk.android_dp_code.dp_image_loader.adapter.ImageAdapter;
import com.devyk.android_dp_code.dp_image_loader.cache.DoubleCache;
import com.devyk.android_dp_code.dp_image_loader.config.ImageLoaderConfig;
import com.devyk.android_dp_code.dp_image_loader.http.HttpURLConnectionDownloaderImp;
import com.devyk.android_dp_code.dp_image_loader.inter.IImageCache;
import com.devyk.android_dp_code.iterator.test2.ReceiverA;
import com.devyk.android_dp_code.iterator.test2.ReceiverB;
import com.devyk.android_dp_code.iterator.test2.ReceiverC;
import com.devyk.android_dp_code.memorandum.NodeActivity;
import com.devyk.android_dp_code.prototype.IntentUtils;
import com.devyk.android_dp_code.state.HomeActivity;

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

        registerOrderBroadcast();

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

    public void test5() {
        new Thread("线程 1 ") {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("Thread: " + getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj2) {
                        System.out.println("Thread: " + getName() + "---> synchronized");
                    }

                }

            }
        }.start();

        new Thread("线程 2 ") {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("Thread: " + getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj2) {
                        System.out.println("Thread: " + getName() + "---> synchronized");
                    }
                }

            }
        }.start();
    }

    public void clone(View view) {
        startActivity(IntentUtils.toSMS());
    }

    public void startAnmimation(View view) {

        //示例1
//        ObjectAnimator.ofFloat(view, "translationY", view.getHeight()).start();

        //示例2
//        ObjectAnimator backgroundColor = ObjectAnimator.ofInt(view, "backgroundColor", 0xFFFF8080, 0xFF8080FF);
//        backgroundColor.setDuration(5000);
//        backgroundColor.setEvaluator(new ArgbEvaluator());
//        backgroundColor.setRepeatCount(ValueAnimator.INFINITE);
//        backgroundColor.setRepeatMode(ValueAnimator.REVERSE);
//        backgroundColor.start();

        //从 scale 入手
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", 0.3f);
        scaleX.setDuration(2000);
        scaleX.start();


    }

    public void stateDP(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }


    private void registerOrderBroadcast() {
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.it.dp_order");
        filter.setPriority(1000);

        IntentFilter filterB = new IntentFilter();
        filterB.addAction("com.it.dp_order");
        filterB.setPriority(500);
        registerReceiver(new ReceiverB(),filterB);

        IntentFilter filterC = new IntentFilter();
        filterC.addAction("com.it.dp_order");
        filterC.setPriority(100);
        registerReceiver(new ReceiverC(),filterC);
        registerReceiver(new ReceiverA(),filter);
    }
    public void order(View view) {
        Intent intent = new Intent();
        intent.setAction("com.it.dp_order");
        intent.putExtra("limit",1000);
        intent.putExtra("MEG","中午了，该吃饭了");
        sendOrderedBroadcast(intent,null);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    public void Node(View view) {
        startActivity(new Intent(this, NodeActivity.class));
    }
}

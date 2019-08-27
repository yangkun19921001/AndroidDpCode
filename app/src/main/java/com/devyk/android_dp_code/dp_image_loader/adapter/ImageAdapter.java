package com.devyk.android_dp_code.dp_image_loader.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.devyk.android_dp_code.R;
import com.devyk.android_dp_code.dp_image_loader.ImageLoader;


public class ImageAdapter extends BaseAdapter {
    private Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (null == convertView) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().loadImage("https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2019/07/27/4/6617338.jpg&x=0&y=0&sw=0&sh=0&sl=W&fw=1050&exp=3600", holder.iv);
        ;
        return convertView;
    }

    class ViewHolder {
        ImageView iv;

        ViewHolder(View view) {
            iv = view.findViewById(R.id.image);
        }
    }
}

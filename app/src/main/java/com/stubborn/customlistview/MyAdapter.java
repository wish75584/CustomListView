package com.stubborn.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    int images[];
    String name[];
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, int[] images, String[] name) {
        this.context = context;
        this.images = images;
        this.name = name;
        this.layoutInflater = layoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return name.length;
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
        convertView = layoutInflater.inflate(R.layout.list_item,null);
        ImageView imageView = convertView.findViewById(R.id.img);
        TextView  textView = convertView.findViewById(R.id.text);

        imageView.setImageResource(images[position]);
        textView.setText(name[position]);

        return convertView;
    }
}

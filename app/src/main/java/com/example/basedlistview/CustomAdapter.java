package com.example.basedlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {

    int[] flag;
    String[] country_name;
    Context context;
    private LayoutInflater layoutInflater;


    CustomAdapter(Context context, String[] country_name, int[] flag) {


        this.context = context;
        this.country_name = country_name;
        this.flag = flag;


    }


    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ServiceCast", "ViewHolder"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.sample_view, parent, false);


        }

        ImageView imageView = convertView.findViewById(R.id.imageviewID);
        TextView textView = convertView.findViewById(R.id.country_nameId);

        imageView.setImageResource(flag[position]);
        textView.setText(country_name[position]);




        return convertView;
    }



}
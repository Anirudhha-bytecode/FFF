package com.example.mygridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int [] flags;
    String[] state_name;
    private LayoutInflater layoutInflater;
    CustomAdapter(Context context,String[] state_name,int[] flags)
    {
        this.context=context;
        this.state_name=state_name;
        this.flags=flags;
    }
    @Override
    public int getCount() {
        return state_name.length;
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
        if(convertView==null)
        {
            layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.sample_view,parent,false);
        }
        ImageView imageView=(ImageView) convertView.findViewById(R.id.imageview);
        TextView textView=(TextView)convertView.findViewById(R.id.textV);
        imageView.setImageResource(flags[position]);
        textView.setText(state_name[position]);
        return convertView;
    }
}

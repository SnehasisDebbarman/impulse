package com.example.impulse;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListview extends ArrayAdapter<String> {

    private String[] eventname;
    private String[] eventname2;
    private Integer[] imgid;
    private Activity context;

    public CustomListview(Activity context, String[] eventname,String[] eventname2,Integer[] imgid) {
        super(context, R.layout.layout,eventname);

        this.context=context;
        this.eventname=eventname;
        this.eventname2=eventname2;
        this.imgid=imgid;

    }



    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View r=convertView;
            ViewHolder viewHolder=null;
            if(r==null){
                String name;
                LayoutInflater layoutInflater=context.getLayoutInflater();
                r=layoutInflater.inflate(R.layout.layout,null,true);
                viewHolder=new ViewHolder(r);
                r.setTag(viewHolder);
            }
            else{
                viewHolder=(ViewHolder) r.getTag();
            }
            viewHolder.ivw.setImageResource(imgid[position]);
            viewHolder.tvw1.setText(eventname[position]);
            viewHolder.tvw2.setText(eventname2[position]);

            return r;
    }


    class ViewHolder{

        TextView tvw1;
        TextView tvw2;
        ImageView ivw;
        ViewHolder(View v){
            tvw1=v.findViewById(R.id.tveventname);
            tvw2=v.findViewById(R.id.tveventname2);
            ivw=v.findViewById(R.id.ImageView);


        }


    }
}

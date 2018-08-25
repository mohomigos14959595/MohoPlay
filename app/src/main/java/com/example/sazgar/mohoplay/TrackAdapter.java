package com.example.sazgar.mohoplay;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 *
 */

public class TrackAdapter extends ArrayAdapter<Track> {
    public TrackAdapter(Context context, List<Track> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.listitemsong,parent,false);
        }

        TextView textsong=(TextView)convertView.findViewById(R.id.textviewsongname);
        Track track=getItem(position);
        textsong.setText(track.getmTitle());

//        TextView textdetails=(TextView)convertView.findViewById(R.id.textviewdetailssong);
//        textdetails.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent gotodetails=new Intent();
//            }
//        });

        return convertView;
    }
}

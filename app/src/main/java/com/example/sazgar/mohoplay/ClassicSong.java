package com.example.sazgar.mohoplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassicSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_song);


        ImageView imageclassic=(ImageView)findViewById(R.id.imageclassicitem);




        Intent goclassicsong=getIntent();
        int position=goclassicsong.getIntExtra("position",-1);
        TextView t=(TextView)findViewById(R.id.t);
         //   t.setText(String.valueOf(position));

        if (position==2){
            //imageclassic.setImageResource(R.drawable.classic6);


        }

        }
}










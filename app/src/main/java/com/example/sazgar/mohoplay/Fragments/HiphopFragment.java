package com.example.sazgar.mohoplay.Fragments;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sazgar.mohoplay.HiphopDetails;
import com.example.sazgar.mohoplay.R;
import com.example.sazgar.mohoplay.Track;
import com.example.sazgar.mohoplay.TrackAdapter;

import java.util.ArrayList;

public class HiphopFragment extends Fragment implements AdapterView.OnItemClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_hiphop_fragment, container, false);

       final ArrayList<Track> trackshiphop=new ArrayList<>();
        trackshiphop.add(new Track("chonk",R.raw.vincent_augustus_chonk));
       trackshiphop.add(new Track("1400",R.raw.yung_kartz_10_1400));
       trackshiphop.add(new Track("wise guy",R.raw.yung_kartz_11_wise_guy));
//       trackshiphop.add();
//       trackshiphop.add();
//       trackshiphop.add();
//       trackshiphop.add();
//       trackshiphop.add();

        ListView listhiphop = (ListView)view.findViewById(R.id.listhiphop);
        TrackAdapter HiphopAdapter=new TrackAdapter(getContext(),trackshiphop);
        listhiphop.setAdapter(HiphopAdapter);

        listhiphop.setOnItemClickListener(this);

   return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent gotohiphopsong=new Intent(getActivity(),HiphopDetails.class);
        gotohiphopsong.putExtra("position",position);
        startActivity(gotohiphopsong);
    }
}

package com.example.sazgar.mohoplay.Fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sazgar.mohoplay.R;
import com.example.sazgar.mohoplay.Track;
import com.example.sazgar.mohoplay.TrackAdapter;

import java.util.ArrayList;

public class PopFragment extends Fragment {

    private ListView listpop;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_pop_fragment, container, false);

        final ArrayList<Track> trackspop=new ArrayList<>();
//        trackspop.add();
//        trackspop.add();
//        trackspop.add();
//        trackspop.add();
//        trackspop.add();
//        trackspop.add();
//        trackspop.add();
//

        listpop= (ListView) view.findViewById(R.id.listviewpop);
        TrackAdapter PopAdapter=new TrackAdapter(getContext(),trackspop);
        listpop.setAdapter(PopAdapter);

        return view;
    }
}

package com.example.sazgar.mohoplay.Fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sazgar.mohoplay.R;
import com.example.sazgar.mohoplay.Track;
import com.example.sazgar.mohoplay.TrackAdapter;

import java.util.ArrayList;

public class PlaylistFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_playlist_fragment, container, false);

        final ArrayList<Track> tracksplaylist=new ArrayList<>();
//        tracksplaylist.add();
//        tracksplaylist.add();
//        tracksplaylist.add();
//        tracksplaylist.add();
//        tracksplaylist.add();
//        tracksplaylist.add();
//        tracksplaylist.add();

        ListView listplaylist= (ListView) view.findViewById(R.id.listviewplaylist);
        TrackAdapter PlaylistAdapter=new TrackAdapter(getContext(),tracksplaylist);
        listplaylist.setAdapter(PlaylistAdapter);



        return view;
    }


}

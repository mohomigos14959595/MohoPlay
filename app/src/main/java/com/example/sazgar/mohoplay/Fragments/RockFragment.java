package com.example.sazgar.mohoplay.Fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sazgar.mohoplay.R;
import com.example.sazgar.mohoplay.Track;
import com.example.sazgar.mohoplay.TrackAdapter;

import java.util.ArrayList;

public class RockFragment extends Fragment {

//    @
//    }
@Nullable
@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
    View view = inflater.inflate(R.layout.activity_rock_fragment, container, false);


    final ArrayList<Track> tracksrock=new ArrayList<>();
   /* tracksrock.add();
    tracksrock.add();
   tracksrock.add();
    tracksrock.add();
   tracksrock.add();
    tracksrock.add();*/

    ListView listrock=(ListView)view.findViewById(R.id.listviewrock);
    TrackAdapter rockadapter = new TrackAdapter(getContext(),tracksrock);
    listrock.setAdapter(rockadapter);

   return view;

}
}

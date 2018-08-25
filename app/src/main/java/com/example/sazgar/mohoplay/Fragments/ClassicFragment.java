package com.example.sazgar.mohoplay.Fragments;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sazgar.mohoplay.ClassicSong;
import com.example.sazgar.mohoplay.R;
import com.example.sazgar.mohoplay.Track;
import com.example.sazgar.mohoplay.TrackAdapter;

import java.util.ArrayList;


public class ClassicFragment extends Fragment {
    private MediaPlayer mMediaPlayer;

    @Override
    public void onStart() {
        super.onStart();
        mMediaPlayer.start();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mMediaPlayer.stop();
        mMediaPlayer.release();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_classic_fragment, container, false);

        mMediaPlayer = MediaPlayer.create(getContext(), R.raw.tagclassic);
       // mMediaPlayer.start();
        final ArrayList<Track> tracksclassic = new ArrayList<>();
        tracksclassic.add(new Track("notice me", R.raw.noticeme));
        tracksclassic.add(new Track("howto", R.raw.howtodisappearcompletely));
        tracksclassic.add(new Track("the path that...", R.raw.greg_atkinson_05_the_path_that_leads_us_home_instrumental));
        tracksclassic.add(new Track("amarasiri", R.raw.amarasiri_peiris_08_kath_kawuruwath));
        tracksclassic.add(new Track("mid air machine", R.raw.midair_machine_by_sight_of_butterfly));
//       tracksclassic.add();
//       tracksclassic.add();
//       tracksclassic.add();
//       tracksclassic.add();
//       tracksclassic.add();
//       tracksclassic.add();

        TextView textsongname=(TextView)view.findViewById(R.id.textviewsongname);
        ListView listclassic = (ListView) view.findViewById(R.id.listviewclassic);
        final TrackAdapter ClassicAdapter = new TrackAdapter(getContext(), tracksclassic);
        listclassic.setAdapter(ClassicAdapter);


        listclassic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent goclassicsong = new Intent(getActivity(), ClassicSong.class);
                goclassicsong.putExtra("position", position);
                startActivity(goclassicsong);


            }
        });

        return view;
    }



}

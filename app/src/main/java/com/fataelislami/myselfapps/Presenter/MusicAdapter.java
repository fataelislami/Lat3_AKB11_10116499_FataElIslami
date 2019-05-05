package com.fataelislami.myselfapps.Presenter;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latihan 3 UTS
 * Tanggal : 30 April 2019
 */
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.fataelislami.myselfapps.Models.MusicModel;
import com.fataelislami.myselfapps.R;

import java.util.ArrayList;
import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {
    private Context context;
    List<MusicModel> musicModelList;
    private ArrayList<Integer> newMusic= new ArrayList<>();


    public MusicAdapter(Context context,List<MusicModel> musicModelList){
        this.context=context;
        this.musicModelList=musicModelList;

    }
    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_music,viewGroup,false);
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder musicViewHolder, int i) {
        MusicModel musicModel=musicModelList.get(i);
        musicViewHolder.txtMusicTitle.setText(musicModel.getTitle());
        musicViewHolder.txtMusicArtist.setText(musicModel.getArtist());
        musicViewHolder.txtMusicDuration.setText(musicModel.getDuration());
        musicViewHolder.imgMusic.setImageResource(musicModel.getImage());

        int uri=musicModel.getPath();
        newMusic.add(uri);
        musicViewHolder.setItem(newMusic);

    }

    @Override
    public int getItemCount() {
        return musicModelList.size();
    }
}

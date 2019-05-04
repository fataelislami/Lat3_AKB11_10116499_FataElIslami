package com.fataelislami.myselfapps.Presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fataelislami.myselfapps.Models.MusicModel;
import com.fataelislami.myselfapps.R;

import java.util.ArrayList;
import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {
    private Context context;
    List<MusicModel> musicModelList;

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
    }

    @Override
    public int getItemCount() {
        return musicModelList.size();
    }
}

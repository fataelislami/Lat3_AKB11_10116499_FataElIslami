package com.fataelislami.myselfapps.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fataelislami.myselfapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

class MusicViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtMusicTitle)
    TextView txtMusicTitle;
    @BindView(R.id.txtMusicArtist)
    TextView txtMusicArtist;
    private ArrayList<String> musicModel=new ArrayList<>();
    public MusicViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        musicModel=item;
    }

}

package com.fataelislami.myselfapps.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fataelislami.myselfapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

class VideoViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtVideoTitle)
    TextView txtVideoTitle;
    @BindView(R.id.txtVideoArtist)
    TextView txtVideoArtist;
    private ArrayList<String> videoModel=new ArrayList<>();
    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        videoModel=item;
    }

}

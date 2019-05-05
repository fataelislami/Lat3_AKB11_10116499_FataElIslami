package com.fataelislami.myselfapps.Presenter;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.fataelislami.myselfapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

class VideoViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtVideoTitle)
    TextView txtVideoTitle;
    @BindView(R.id.video)
    VideoView video;
    private ArrayList<VideoView> videoModel=new ArrayList<>();
    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<VideoView> item){//penerima value dari adapter
        videoModel=item;
    }

    @OnClick
    void onClick(@NonNull View itemView){
        int position=getAdapterPosition();
        videoModel.get(position).start();
        Toast.makeText(itemView.getContext(),"Play",Toast.LENGTH_LONG).show();
    }

}

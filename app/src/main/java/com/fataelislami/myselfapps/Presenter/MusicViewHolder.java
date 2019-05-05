package com.fataelislami.myselfapps.Presenter;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fataelislami.myselfapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

class MusicViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtMusicTitle)
    TextView txtMusicTitle;
    @BindView(R.id.txtMusicArtist)
    TextView txtMusicArtist;
    @BindView(R.id.txtMusicDuration)
    TextView txtMusicDuration;
    @BindView(R.id.imgMusic)
    ImageView imgMusic;
    private static MediaPlayer mediaPlayer; //THIS IS THE CHANGE I DONE
    private ArrayList<Integer> musicModel=new ArrayList<>();
    public MusicViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<Integer> item){//penerima value dari adapter
        musicModel=item;
    }

        @OnClick
    void onClick(@NonNull View itemView){
        int position=getAdapterPosition();
        int uri=musicModel.get(position);
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
                mediaPlayer = null;
                Toast.makeText(itemView.getContext(),"Stopping",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(itemView.getContext(),"Playing",Toast.LENGTH_LONG).show();
                mediaPlayer = MediaPlayer.create(itemView.getContext(), uri);
                mediaPlayer.start();
            }


    }

}

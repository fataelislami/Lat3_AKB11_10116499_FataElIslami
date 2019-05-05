package com.fataelislami.myselfapps.Presenter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.fataelislami.myselfapps.Models.VideoModel;
import com.fataelislami.myselfapps.R;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoViewHolder> {
    private Context context;
    List<VideoModel> videoModelList;
    private ArrayList<VideoView> newVideo= new ArrayList<>();


    public VideoAdapter(Context context, List<VideoModel> videoModelList){
        this.context=context;
        this.videoModelList=videoModelList;

    }
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_video,viewGroup,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder videoViewHolder, int i) {
        VideoModel videoModel=videoModelList.get(i);
        videoViewHolder.txtVideoTitle.setText(videoModel.getTitle());
        videoViewHolder.video.setVideoURI(Uri.parse(videoModel.getPath()));
        newVideo.add(videoViewHolder.video);
        videoViewHolder.setItem(newVideo);
    }


    @Override
    public int getItemCount() {
        return videoModelList.size();
    }
}

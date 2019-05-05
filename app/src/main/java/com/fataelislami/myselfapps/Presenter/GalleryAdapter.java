package com.fataelislami.myselfapps.Presenter;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latihan 3 UTS
 * Tanggal : 30 April 2019
 */
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fataelislami.myselfapps.Models.GalleryModel;
import com.fataelislami.myselfapps.R;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryViewHolder> {
    private Context context;
    List<GalleryModel> galleryModels;
    public GalleryAdapter(Context context,List<GalleryModel> galleryModels){
            this.context=context;
            this.galleryModels=galleryModels;
    }
    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_gallery,viewGroup,false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder galleryViewHolder, int i) {
        GalleryModel galleryModel=galleryModels.get(i);
        galleryViewHolder.txtGalleryName.setText(galleryModel.getName());
        galleryViewHolder.imgGallery.setImageResource(galleryModel.getImage());
    }

    @Override
    public int getItemCount() {
        return galleryModels.size();
    }
}

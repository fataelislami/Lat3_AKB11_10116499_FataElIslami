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
import android.widget.ImageView;
import android.widget.TextView;

import com.fataelislami.myselfapps.Models.GalleryModel;
import com.fataelislami.myselfapps.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

class GalleryViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.imgGallery)
    ImageView imgGallery;
    @BindView(R.id.txtGalleryName)
    TextView txtGalleryName;
    private ArrayList<String> galleryModel=new ArrayList<>();
    public GalleryViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        galleryModel=item;
    }
}

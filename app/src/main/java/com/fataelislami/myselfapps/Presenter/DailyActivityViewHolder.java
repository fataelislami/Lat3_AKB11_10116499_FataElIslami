package com.fataelislami.myselfapps.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fataelislami.myselfapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latihan 3 UTS
 * Tanggal : 30 April 2019
 */
public class DailyActivityViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtDailyTitle)
    TextView txtDailyTitle;
    @BindView(R.id.txtDailyDescription)
    TextView txtDailyDescription;
    private ArrayList<String> dailyActivityModel=new ArrayList<>();
    public DailyActivityViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        dailyActivityModel=item;
    }

}

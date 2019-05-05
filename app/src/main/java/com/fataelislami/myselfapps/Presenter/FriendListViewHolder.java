package com.fataelislami.myselfapps.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fataelislami.myselfapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FriendListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtFriendListName)
    TextView txtFriendListName;
    @BindView(R.id.txtFriendListAge) TextView txtFriendListAge;
    @BindView(R.id.imgFriendList)
    ImageView imgFriendList;
    private ArrayList<String> friendListModel=new ArrayList<>();

    public FriendListViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        friendListModel=item;
    }


}

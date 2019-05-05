package com.fataelislami.myselfapps.Presenter;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fataelislami.myselfapps.Models.FriendListModel;
import com.fataelislami.myselfapps.R;

import java.util.List;

public class FriendListAdapter extends RecyclerView.Adapter<FriendListViewHolder> {
    private Context context;
    List<FriendListModel> friendListModels;
    public FriendListAdapter(Context context,List<FriendListModel> friendListModels){
        this.context=context;
        this.friendListModels=friendListModels;
    }
    @NonNull
    @Override
    public FriendListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_friendlist,viewGroup,false);
        return new FriendListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendListViewHolder friendListViewHolder, int i) {
        FriendListModel friendListModel=friendListModels.get(i);
        friendListViewHolder.txtFriendListName.setText(friendListModel.getName());
        friendListViewHolder.txtFriendListAge.setText(friendListModel.getAge());
        friendListViewHolder.imgFriendList.setImageResource(friendListModel.getImage());
    }

    @Override
    public int getItemCount() {
        return friendListModels.size();
    }
}

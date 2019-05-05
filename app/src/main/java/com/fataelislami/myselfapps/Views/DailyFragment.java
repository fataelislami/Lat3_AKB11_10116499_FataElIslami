package com.fataelislami.myselfapps.Views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fataelislami.myselfapps.Models.FriendListModel;
import com.fataelislami.myselfapps.Models.DailyActivityModel;
import com.fataelislami.myselfapps.Presenter.FriendListAdapter;
import com.fataelislami.myselfapps.Presenter.DailyActivityAdapter;
import com.fataelislami.myselfapps.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latihan 3 UTS
 * Tanggal : 30 April 2019
 */

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DailyFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    @BindView(R.id.rvDaily)
    RecyclerView rvDaily;
    List<DailyActivityModel> dailyActivityModelList;
    //FriendList Init
    @BindView(R.id.rvFriendList)
    RecyclerView rvFriendList;
    List<FriendListModel> friendListModelList;
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment=inflater.inflate(R.layout.fragment_daily, container, false);
        ButterKnife.bind(this,viewFragment);
        //Proses RV Daily
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        initDataDaily();
        rvDaily.setLayoutManager(linearLayoutManager);
        rvDaily.setHasFixedSize(true);
        DailyActivityAdapter dailyActivityAdapter =new DailyActivityAdapter(getContext(), dailyActivityModelList);
        rvDaily.setAdapter(dailyActivityAdapter);
        //Proses RV Daily END
        //Proses RV Friend
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        initDataFriend();
        rvFriendList.setLayoutManager(linearLayoutManager2);
        rvFriendList.setHasFixedSize(true);
        FriendListAdapter friendListAdapter=new FriendListAdapter(getContext(),friendListModelList);
        rvFriendList.setAdapter(friendListAdapter);
        //Proses RV Friend END
        return viewFragment;
    }

    private void initDataFriend() {
        friendListModelList =new ArrayList<>();
        friendListModelList.add(new FriendListModel("Mamun SW","19 Tahun", R.drawable.mamun));
        friendListModelList.add(new FriendListModel("Imam DC","22 Tahun", R.drawable.imam));
        friendListModelList.add(new FriendListModel("Reza IF","13 Tahun", R.drawable.reza));
    }

    private void initDataDaily() {
        dailyActivityModelList = new ArrayList<>();
        dailyActivityModelList.add(new DailyActivityModel("Sholat Shubuh","InsyaAllah Dimesjid"));
        dailyActivityModelList.add(new DailyActivityModel("Makan Pagi","beli nasi kuning"));
        dailyActivityModelList.add(new DailyActivityModel("Mandi Pagi","Sabun,shampo dan gosok gigi"));
        dailyActivityModelList.add(new DailyActivityModel("Kuliah","Mata Kuliah AKB Tercinta"));
        dailyActivityModelList.add(new DailyActivityModel("Sholat Dzuhur","InsyaAllah Dimesjid"));
        dailyActivityModelList.add(new DailyActivityModel("Istirahat","Jajan Jajan Ringan"));
        dailyActivityModelList.add(new DailyActivityModel("Main Game","Sampe Shubuh :D"));





    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

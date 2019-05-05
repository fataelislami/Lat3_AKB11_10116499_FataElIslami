package com.fataelislami.myselfapps.Views.SubMusicVideoFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fataelislami.myselfapps.Models.MusicModel;
import com.fataelislami.myselfapps.Presenter.MusicAdapter;
import com.fataelislami.myselfapps.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TabMusicFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TabMusicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabMusicFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    @BindView(R.id.rvMusic)
    RecyclerView rvMusic;
    List<MusicModel> musicModelList;
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TabMusicFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TabMusicFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TabMusicFragment newInstance(String param1, String param2) {
        TabMusicFragment fragment = new TabMusicFragment();
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
        View viewFragment=inflater.inflate(R.layout.fragment_tab_music, container, false);
        ButterKnife.bind(this,viewFragment);
        //Proses RV
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        initData();
        rvMusic.setLayoutManager(linearLayoutManager);
        rvMusic.setHasFixedSize(true);
        MusicAdapter musicAdapter =new MusicAdapter(getContext(), musicModelList);
        rvMusic.setAdapter(musicAdapter);
        //Proses RV End
        return viewFragment;
    }

    private void initData() {
        //data lagu dipotong beberapa agar tidak memberatkan apk
        //namun untuk lagu full tetap 100% worked pak hehe :D
        int musik1=R.raw.tompiramadhan;
        int musik2=R.raw.ungulebaran;
        int musik3=R.raw.seventeen;
        int musik4=R.raw.hadadalwi;
        int musik5=R.raw.waliabatasa;
        int musik6=R.raw.maherzain;

        musicModelList=new ArrayList<>();
        musicModelList.add(new MusicModel(1,R.drawable.tompi,"Ramadhan Datang","Tompi","3.20", musik1));
        musicModelList.add(new MusicModel(2,R.drawable.ungu,"Selamat Lebaran","Ungu","3.00", musik2));
        musicModelList.add(new MusicModel(3,R.drawable.seventeen,"Ramadhan Yang Indah","Seventeen","3.10", musik3));
        musicModelList.add(new MusicModel(4,R.drawable.maherzain,"InsyaAllah","Maher Zain","3.15", musik6));
        musicModelList.add(new MusicModel(5,R.drawable.wali,"Abatasa","Wali","2.98", musik5));
        musicModelList.add(new MusicModel(6,R.drawable.hadadalwi,"Jalan Cinta","Hadad Alwi","3.60", musik4));
        musicModelList.add(new MusicModel(7,R.drawable.opick,"Eta Terangkanlah","Opick","2.80", musik2));
        musicModelList.add(new MusicModel(8,R.drawable.nisasabyan,"Hmmm","Nissa Sabyan","3.22", musik1));





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

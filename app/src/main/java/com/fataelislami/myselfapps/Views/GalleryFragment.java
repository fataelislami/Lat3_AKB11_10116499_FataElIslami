package com.fataelislami.myselfapps.Views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fataelislami.myselfapps.Models.GalleryModel;
import com.fataelislami.myselfapps.Presenter.FriendListAdapter;
import com.fataelislami.myselfapps.Presenter.GalleryAdapter;
import com.fataelislami.myselfapps.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GalleryFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    @BindView(R.id.rvGallery)
    RecyclerView rvGallery;
    List<GalleryModel> galleryModelList;
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
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
        View viewFragment=inflater.inflate(R.layout.fragment_gallery, container, false);
        ButterKnife.bind(this,viewFragment);
        //Proses RV
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        initData();
        rvGallery.setLayoutManager(gridLayoutManager);
        rvGallery.setHasFixedSize(true);
        GalleryAdapter galleryAdapter=new GalleryAdapter(getContext(),galleryModelList);
        rvGallery.setAdapter(galleryAdapter);
        //Proses RV
        return viewFragment;
    }

    private void initData() {
        galleryModelList=new ArrayList<>();
        galleryModelList.add(new GalleryModel(R.drawable.gl,"Ini Contoh 1"));
        galleryModelList.add(new GalleryModel(R.drawable.gl2,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl3,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl4,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl5,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl6,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl7,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl8,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl9,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl10,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl11,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl12,"Ini Contoh 2"));
        galleryModelList.add(new GalleryModel(R.drawable.gl13,"Ini Contoh 2"));







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

package com.fataelislami.myselfapps.Presenter;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latihan 3 UTS
 * Tanggal : 30 April 2019
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Toast;

import com.fataelislami.myselfapps.Views.SubMusicVideoFragment.TabMusicFragment;
import com.fataelislami.myselfapps.Views.SubMusicVideoFragment.TabVideoFragment;

public class MusicVideoPagerAdapter extends FragmentStatePagerAdapter {
    public MusicVideoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                TabMusicFragment tabMusicFragment=new TabMusicFragment();
                return tabMusicFragment;
            case 1:
                TabVideoFragment tabVideoFragment =new TabVideoFragment();
                return tabVideoFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int i){
        switch (i){
            case 0:
                return "Music";
            case 1:
                return "Video";
        }
        return null;
    }
}

package com.fataelislami.myselfapps.Presenter;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.fataelislami.myselfapps.Views.SubMusicVideoFragment.TabMusicFragment;
import com.fataelislami.myselfapps.Views.SubMusicVideoFragment.TabVideoFragment;
import com.fataelislami.myselfapps.Views.SubOnBoard.OnBoard1;
import com.fataelislami.myselfapps.Views.SubOnBoard.OnBoard2;
import com.fataelislami.myselfapps.Views.SubOnBoard.OnBoard3;

public class OnBoardActivityAdapter extends FragmentStatePagerAdapter {
    public OnBoardActivityAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                OnBoard1 onBoard1=new OnBoard1();
                return onBoard1;
            case 1:
                OnBoard2 onBoard2=new OnBoard2();
                return onBoard2;
            case 2:
                OnBoard3 onBoard3=new OnBoard3();
                return onBoard3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int i){
        switch (i){
            case 0:
                return "onboard1";
            case 1:
                return "onboard2";
            case 2:
                return "onboard3";
        }
        return null;
    }
}

package com.fataelislami.myselfapps.Views;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.fataelislami.myselfapps.Presenter.MusicVideoPagerAdapter;
import com.fataelislami.myselfapps.Presenter.OnBoardActivityAdapter;
import com.fataelislami.myselfapps.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OnBoardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        ViewPager viewPager=(ViewPager) findViewById(R.id.pagerOnBoard);
        OnBoardActivityAdapter onBoardActivityAdapter=new OnBoardActivityAdapter(getSupportFragmentManager());
        viewPager.setAdapter(onBoardActivityAdapter);
//        TabLayout tabLayout = (TabLayout) viewFragment.findViewById(R.id.tablayout);
//        tabLayout.setupWithViewPager(viewPager);
    }


}

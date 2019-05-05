package com.fataelislami.myselfapps.Views;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.fataelislami.myselfapps.R;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */
public class MainActivity extends AppCompatActivity {
    @BindView(R.id.navigation) BottomNavigationView navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
//        getSupportActionBar().hide(); // hide the title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        navigation.setOnNavigationItemSelectedListener(monNavigationItemSelectedListener);
        loadfragment(new HomeFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener monNavigationItemSelectedListener
            =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.navigation_homepage:
                        loadfragment(new HomeFragment());
                        return true;
                    case R.id.navigation_daily:
                        loadfragment(new DailyFragment());
                        return true;
                    case R.id.navigation_gallery:
                        loadfragment(new GalleryFragment());
                        return true;
                    case R.id.navigation_music_video:
                        loadfragment(new MusicVideoFragment());
                        return true;
                    case R.id.navigation_profile:
                        loadfragment(new ProfileFragment());
                        return true;
                }
                return false;


        }
    };

    void loadfragment(Fragment fragment){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.mainFrame,fragment);
        ft.commit();

    }
}

package com.fataelislami.myselfapps.Views;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fataelislami.myselfapps.R;

public class SplashScreenActivity extends AppCompatActivity {
    private int loadTime=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent i=new Intent(getApplication(), OnBoardActivity.class);
                startActivity(i);
                finish();

            }
        },loadTime);
    }
}

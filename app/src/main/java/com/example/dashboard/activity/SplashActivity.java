package com.example.dashboard.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.example.dashboard.R;

public class SplashActivity extends Activity {
    private static final int SPLASH_TIME = 3 * 1000;//set waktu 3 detik
    ProgressBar prg;

    @SuppressLint({"NewApi", "Range"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        prg = (ProgressBar)findViewById(R.id.progressBar1);//tampilan progressBar
        prg.setAlpha(SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        },SPLASH_TIME);

    }
}

package com.example.dashboard.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.dashboard.R;

public class MainActivity extends AppCompatActivity {

    private Button btnScrolTabs;
    MediaPlayer mp;
    private Toolbar toolbar;
    ImageView whatisanimal, exercise, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        whatisanimal = findViewById(R.id.btn_whatisanimals);
        exercise = findViewById(R.id.btn_exercise);
        info = findViewById(R.id.btn_information);
        btnScrolTabs = findViewById(R.layout.activity_scrollable_tabs);

        btnScrolTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,));
            }
        });


        whatisanimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, menusatu.class));
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol What is Animal", Toast.LENGTH_SHORT).show();
            }
        });

        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol Information", Toast.LENGTH_SHORT).show();
            }
        });
    }



    //get id tombol & event tombol

       /*btnvtb = (Button) findViewById(R.id.btnvertebrates);
        btnvtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol Vertebrates", Toast.LENGTH_SHORT).show();
            }
        });

        btninvtb = (Button) findViewById(R.id.btninvertebrate);
        btninvtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol Invertebrates", Toast.LENGTH_SHORT).show();
            }
        });*/

       /* btnsetting = (Button) findViewById(R.id.btnsetting);
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol Setting", Toast.LENGTH_SHORT).show();
            }
        });*/


    public void playSound(View v) {
        mp = MediaPlayer.create(this, R.raw.click);
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mp.start();
            }
        });
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.release();
            }
        });
    }


    //untuk exit
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //jika user memencet "yes" maka bisa langsung keluar
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //jika user memencet "no" maka akan kembali ke aplikasi
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}

   /* public boolean onCreateOptionsMenu(Menu menu){
        //inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/


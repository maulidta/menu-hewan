package com.example.dashboard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnwia,btnvtb,btninvtb,btnsetting,btninformation, play;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.btn_whatisanimals);


        //get id tombol & event tombol
        btnwia = (Button) findViewById(R.id.btn_whatisanimals);
        btnwia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Anda menekan Tombol What is Animals",Toast.LENGTH_SHORT).show();
                openwiaActivity();
            }
        });
        
        btnvtb = (Button) findViewById(R.id.btnvertebrates);
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
        });

        btnsetting = (Button) findViewById(R.id.btnsetting);
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol Setting", Toast.LENGTH_SHORT).show();
            }
        });

        btninformation = (Button) findViewById(R.id.btninformation);
        btninformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol Information", Toast.LENGTH_SHORT).show();
                openinfoActivity();
            }
        });
    }
    public void playSound(View v){
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

    private void openinfoActivity(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    private void openwiaActivity() {
        Intent intent = new Intent(this, menusatu.class);
        startActivity(intent);
    }

    //untuk exit
    public void onBackPressed(){
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

   /* public boolean onCreateOptionsMenu(Menu menu){
        //inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
}

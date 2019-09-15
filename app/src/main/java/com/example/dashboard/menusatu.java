package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class menusatu extends AppCompatActivity {
    int oldValue;
    private Button changeButtonText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusatu);

        changeButtonText = (Button)findViewById(R.id.changetextbtn);

        changeButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeButtonText.setText("Second Text");
            }
        });


        changeTextViewValueRandomlyOnButtonClick();
        changeTextOnce();
    }
    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"Animals are living things.\n" +
                "        Like plants, animals need food and waterto tlive. Unlike plants, which make their own food,\n" +
                "        animals feed themselves by eating plants or other animals", "Hewan adalah mahluk hidup. \" +\n" +
                "                        \"Seperti tumbuhan, hewan membutuhkan makanan dan air untuk hidup, \" +\n" +
                "                        \"Hewan memberi makan dirinya sendiri dengan memakan tumbuhan atau hewan yang lain" };

        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButton = (Button) findViewById(R.id.changetextbtn);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * manyDifferentStrings.length);
                if (random == oldValue) {
                    random = (int) (Math.random() * manyDifferentStrings.length);
                }
                changingText.setText(manyDifferentStrings[random]);
                oldValue = random;
            }
        });
    }

    public void changeTextOnce(){
        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButton = (Button) findViewById(R.id.changetextbtn);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changingText.setText("Hewan adalah mahluk hidup. " +
                        "Seperti tumbuhan, hewan membutuhkan makanan dan air untuk hidup, " +
                        "Hewan memberi makan dirinya sendiri dengan memakan tumbuhan atau hewan yang lain");
            }
        });
    }

}

package com.example.dashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menusatu extends AppCompatActivity {
    int oldValue;
    private Button btnTextInd, btnTextEng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusatu);

        btnTextInd = (Button)findViewById(R.id.changetextbtnInd);
        btnTextEng = (Button)findViewById(R.id.changetextbtnEng);

        btnTextInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnTextInd.setText("Second Text");
            }
        });


        changeTextViewValueRandomlyOnButtonClick();
        changeTextKeInd();
        changeTextKeEng();
    }
    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"Animals are living things.\n" +
                "        Like plants, animals need food and waterto tlive. Unlike plants, which make their own food,\n" +
                "        animals feed themselves by eating plants or other animals"};

        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButtonToInd = (Button) findViewById(R.id.changetextbtnEng);

        changeTextButtonToInd.setOnClickListener(new View.OnClickListener() {
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

    public void changeTextKeInd(){
        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButton = (Button) findViewById(R.id.changetextbtnInd);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changingText.setText("Hewan adalah mahluk hidup. " +
                        "Seperti tumbuhan, hewan membutuhkan makanan dan air untuk hidup, " +
                        "Hewan memberi makan dirinya sendiri dengan memakan tumbuhan atau hewan yang lain");
            }
        });
    }

    public void changeTextKeEng(){
        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButton = (Button) findViewById(R.id.changetextbtnEng);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changingText.setText("Animals are living things.Like plants, animals need food and waterto tlive. Unlike plants, which make their own food, animals feed themselves by eating plants or other animals");
            }
        });
    }

}

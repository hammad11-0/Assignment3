package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Exam extends AppCompatActivity {

    TextView t1;
        String n;
        Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        String[] num={"أ","ہ","ح","ع","غ","ق","ش","ی","ج","ض","ل","ن","ر","ت","د","ط","ظ","ذ","ث","ص","س","ز","م","ن", "ف","ب","م","و","باَ","بوُ","بىِ","ک"};

        String[] alqiyah= { "أ","ہ","ح","ع","غ","خ"};
        String[] lahatiyah = {"ق","ک"};
        String[] shajariyah_haafiyah={"ش","ی","ج","ض"};
        String[] tarfiyah ={"ل","ن","ر",};
        String[] nit_eeyah= {"ت","د","ط"};
        String[] lisaveyah = {"ظ","ذ","ث","ص","س","ز"};
        String[] ghunna = {"م","ن", "ف","ب","م","و","باَ","بوُ","بىِ"};


  t1=findViewById(R.id.textView2);

        b1=findViewById(R.id.HALQIYAH);
        b2=findViewById(R.id.button8);
        b3=findViewById(R.id.button9);
        b4=findViewById(R.id.button10);
        b5=findViewById(R.id.button11);
        b6=findViewById(R.id.button12);
        b7=findViewById(R.id.button13);


        Random rand = new Random();

     int a= rand.nextInt(32);

    n=num[a];
    int id=1;
  t1.setText(n);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 6; i++) {
                    if (alqiyah[i].equals(n)) {
                        b1.setBackgroundColor(Color.GREEN);
                        break;
                    } else {
                        b1.setBackgroundColor(Color.RED);
                    }
                  }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 2; i++) {
                    if (lahatiyah[i].equals(n)) {
                        b2.setBackgroundColor(Color.GREEN);
                        break;
                    } else {
                        b2.setBackgroundColor(Color.RED);
                    }
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 4; i++) {
                    if (shajariyah_haafiyah[i].equals(n)) {
                        b3.setBackgroundColor(Color.GREEN);
                        break;
                    } else {
                        b3.setBackgroundColor(Color.RED);
                    }
                }
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 3; i++) {
                    if (tarfiyah[i].equals(n)) {
                        b4.setBackgroundColor(Color.GREEN);
                        break;
                    } else {
                        b4.setBackgroundColor(Color.RED);
                    }
                }
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 3; i++) {
                    if (nit_eeyah[i].equals(n)) {
                        b5.setBackgroundColor(Color.GREEN);
                        break;
                    } else {
                        b5.setBackgroundColor(Color.RED);
                    }
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 6; i++) {
                    if (lisaveyah[i].equals(n)) {
                        b6.setBackgroundColor(Color.GREEN);
                        break;
                    } else {
                        b6.setBackgroundColor(Color.RED);
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 9; i++) {
                    if (ghunna[i].equals(n)) {
                        b7.setBackgroundColor(Color.GREEN);
                        break;
                    } else {
                        b7.setBackgroundColor(Color.RED);
                    }
                }
            }
        });
    }
}







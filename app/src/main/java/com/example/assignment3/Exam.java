package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Exam extends AppCompatActivity {

    TextView t1;
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


  t1=findViewById(R.id.textView20);
  t1.setText(num[1]);
    }
}
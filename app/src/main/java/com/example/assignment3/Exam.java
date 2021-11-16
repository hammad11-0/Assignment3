package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Exam extends AppCompatActivity {

    TextView t1,t2,t3;
        String n;
        Button b1,b2,b3,b4,b5,b6,b7,next,b8;

    int s=0;
    int mcq=1;

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
        t2=findViewById(R.id.Score1);
        t3=findViewById(R.id.textView21);


        b1=findViewById(R.id.HALQIYAH);
        b2=findViewById(R.id.button8);
        b3=findViewById(R.id.button9);
        b4=findViewById(R.id.button10);
        b5=findViewById(R.id.button11);
        b6=findViewById(R.id.button12);
        b7=findViewById(R.id.button13);
        b8=findViewById(R.id.end);
        next=findViewById(R.id.next);


        Random rand = new Random();
        Random rand2 = new Random();

     int a= rand.nextInt(32);


        String t=String.valueOf(s);
        t2.setText(t);
        String m=String.valueOf(mcq);
        t3.setText(m);

    n=num[a];
  t1.setText(n);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                for (int i = 0; i < 6; i++) {
                    if (alqiyah[i].equals(n)) {
                        b1.setBackgroundColor(Color.GREEN);
                        s++;

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
                        s++;
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
                        s++;
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
                        s++;
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
                        s++;
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
                      s++;
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
                       s++;
                        break;
                    } else {
                        b7.setBackgroundColor(Color.RED);
                    }
                }
            }
        });



        next.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                b1.setBackgroundColor (R.color.colordefault);
                b2.setBackgroundColor(R.color.colordefault);
                b3.setBackgroundColor(R.color.colordefault);
                b4.setBackgroundColor(R.color.colordefault);
                b5.setBackgroundColor(R.color.colordefault);
                b6.setBackgroundColor(R.color.colordefault);
                b7.setBackgroundColor(R.color.colordefault);


                int b= rand.nextInt(32);
                n=num[b];
                t1.setText(n);

                String t=String.valueOf(s);
                t2.setText(t);

                mcq++;
                String l=String.valueOf(mcq);
                t3.setText(l);
            }
        });

 b8.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent intent;

         intent = new Intent(Exam.this, end.class);
         String b=String.valueOf(s);
         intent.putExtra("score",s );
         startActivity(intent);
     }
 });

    }


}







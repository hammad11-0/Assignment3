package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    String url="https://github.com/hammad11-0/Assignment3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                openWebPage(url);
        }
    });

       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


                Intent intent;

                        intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);

            }
        });



    }

    public View.OnClickListener openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new
                Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
        return null;
    }
}
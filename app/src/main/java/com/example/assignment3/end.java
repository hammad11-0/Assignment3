package com.example.assignment3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class end extends AppCompatActivity {
    TextView t1;
    Button b,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        t1=findViewById(R.id.score);
        b=findViewById(R.id.share);
        b2=findViewById(R.id.quit);


        Intent intent = getIntent();
        String str = intent.getStringExtra("score");
        t1.setText(str);
        String n="Quiz Score is";

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");

                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT,n);
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT,str);

                    startActivity(Intent.createChooser(sharingIntent, "Share using"));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                System.exit(1);
            }
        });

    }
}
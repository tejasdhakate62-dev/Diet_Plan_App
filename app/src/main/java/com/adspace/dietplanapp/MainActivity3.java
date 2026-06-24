package com.adspace.dietplanapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

          Button  BR = findViewById(R.id.BR);
          Button BR2 = findViewById(R.id.BR2);

            BR.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);


            });

            BR2.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent);
            });


         }
    }


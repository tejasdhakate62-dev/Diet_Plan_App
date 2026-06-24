package com.adspace.dietplanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button BMW1 = findViewById(R.id.BMW1);
        Button BMW2 = findViewById(R.id.BMW2);
        Button BMW3 = findViewById(R.id.BMW3);
        Button BMW4 = findViewById(R.id.BMW4);
        Button BMW5 = findViewById(R.id.BMW5);
        Button BMW6 = findViewById(R.id.BMW6);
        Button BMW7 = findViewById(R.id.BMW7);


        BMW1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, DAYY1.class);
            startActivity(intent);

        });

        BMW2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, DAYY2.class);
            startActivity(intent);
        });

        BMW3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, DAYY3.class);
            startActivity(intent);
        });

        BMW4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, DAYY4.class);
            startActivity(intent);
        });

        BMW5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, DAYY5.class);
            startActivity(intent);
        });

        BMW6.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, DAY6.class);
            startActivity(intent);
        });

        BMW7.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, DAY7.class);
            startActivity(intent);
        });
    }
}
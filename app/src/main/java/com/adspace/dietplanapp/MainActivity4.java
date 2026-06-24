package com.adspace.dietplanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button BM1 = findViewById(R.id.BM1);
        Button BM2 = findViewById(R.id.BM2);
        Button BM3 = findViewById(R.id.BM3);
        Button BM4 = findViewById(R.id.BM4);
        Button BM5 = findViewById(R.id.BM5);
        Button BM6 = findViewById(R.id.BM6);
        Button BM7 = findViewById(R.id.BM7);


        BM1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, DAY1.class);
            startActivity(intent);

        });

        BM2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, DAY2.class);
            startActivity(intent);
        });

        BM3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, DAY3.class);
            startActivity(intent);
        });

        BM4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, DAY4.class);
            startActivity(intent);
        });

        BM5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, DAY5.class);
            startActivity(intent);
        });

        BM6.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, DAY6.class);
            startActivity(intent);
        });
    }
}
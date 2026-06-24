package com.adspace.dietplanapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Log2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log2);

        Button bsw2 = findViewById(R.id.bsw2);

        bsw2.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick (View v) {

                openLogin1();
            }

        });
    }

    private void openLogin1() {
        Intent intent = new Intent(this, MainActivity3.class );
        startActivity(intent);
    }
}
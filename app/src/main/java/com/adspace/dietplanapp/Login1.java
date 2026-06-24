package com.adspace.dietplanapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Login1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        Button bt1 = findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick (View v) {

                openLogin1();
            }

        });
    }

    private void openLogin1() {
        Intent intent = new Intent(this, Log2.class );
        startActivity(intent);
    }
}
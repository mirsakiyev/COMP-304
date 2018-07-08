package com.example.aslanmr.aslanmirsakiyev_comp304_assignment4;

/*
 * Assignment 4 - Developing an Android Shopping App
 * 9 of July, 2018
 * Aslan Mirsakiyev
 * #300850326
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // When user click Registration Btn it takes user to Registration Activity
        registerBtn= findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }
        });
    }
}

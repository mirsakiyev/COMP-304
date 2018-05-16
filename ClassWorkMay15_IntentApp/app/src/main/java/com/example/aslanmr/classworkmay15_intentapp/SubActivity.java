package com.example.aslanmr.classworkmay15_intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent i=getIntent();

        String message=i.getStringExtra("MyMessage");

        TextView textView=(TextView) findViewById(R.id.textview);
        //textView.setText(R.string.textview);
        textView.setText(message);
    }
}

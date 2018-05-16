package com.example.aslanmr.classworkmay15_intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Send_Message(View v)
    {
        if (v.getId()==R.id.button)
        {
            Intent intent=new Intent(MainActivity.this, SubActivity.class);
            intent.putExtra("MyMessage","This is from main activity");
            startActivity(intent);
        }
    }
}

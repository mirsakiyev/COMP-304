package com.example.aslanmr.aslanmirsakiyev_comp304_assignment4;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    TextView loginCred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        loginCred=findViewById(R.id.userLoginTextView);
        displayInfo();

    }

    public void displayInfo(){
        SharedPreferences sharePref=getSharedPreferences("loginInfo", Context.MODE_PRIVATE );
        String uName=sharePref.getString("userName","");
        loginCred.setText("Welcome "+uName);
    }
}

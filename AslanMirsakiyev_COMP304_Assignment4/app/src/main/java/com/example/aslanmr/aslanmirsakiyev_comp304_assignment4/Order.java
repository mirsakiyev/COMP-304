package com.example.aslanmr.aslanmirsakiyev_comp304_assignment4;

/*
 * Assignment 4 - Developing an Android Shopping App
 * 9 of July, 2018
 * Aslan Mirsakiyev
 * #300850326
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    TextView username, password, fName, lName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        username=findViewById(R.id.order_username);
        password=findViewById(R.id.order_pwd);
        fName=findViewById(R.id.order_fName);
        lName=findViewById(R.id.order_lName);

        showUserCredentials();

    }

    public void showUserCredentials(){
        SharedPreferences sharePref=getSharedPreferences("loginInfo", Context.MODE_PRIVATE );
        String usernameString=sharePref.getString("userName","");
        String passwordString=sharePref.getString("password","");
        String fNameString=sharePref.getString("fName","");
        String lNameString=sharePref.getString("lName","");

        username.setText(usernameString);
        password.setText(passwordString);
        fName.setText(fNameString);
        lName.setText(lNameString);



    }
}

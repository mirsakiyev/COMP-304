package com.example.aslanmr.aslanmirsakiyev_comp304_assignment4;

/*
 * Assignment 4 - Developing an Android Shopping App
 * 9 of July, 2018
 * Aslan Mirsakiyev
 * #300850326
 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DBHelper shoppingDB;
    EditText usernameInput;
    Button registerBtn;
    Button btnLogin;

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



        btnLogin=findViewById(R.id.loginBtn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveLoginInfo(v);
                startActivity(new Intent(MainActivity.this,Order.class));

            }
        });
    }

    public void loginValidity()
    {
        SharedPreferences sha=getSharedPreferences("loginInfo", Context.MODE_PRIVATE );
    }

    public void saveLoginInfo(View view)
    {
        SharedPreferences sharePref=getSharedPreferences("loginInfo", Context.MODE_PRIVATE );
        SharedPreferences.Editor editor =sharePref.edit();
        usernameInput=findViewById(R.id.usernameEditText);
        editor.putString("userName",usernameInput.getText().toString());
        //editor.putString()
        editor.apply();
        Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show();

    }

}

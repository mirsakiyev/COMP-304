package com.example.aslanmr.aslanmirsakiyev_comp304_assignment4;

/*
 * Assignment 4 - Developing an Android Shopping App
 * 9 of July, 2018
 * Aslan Mirsakiyev
 * #300850326
 */

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    int id;
    DBHelper shoppingDB;
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        try {
            shoppingDB = new DBHelper(getApplicationContext());
            //db.createDatabase(getApplicationContext());
            shoppingDB.dbInit("Customer", "CREATE TABLE Customer (id INTEGER PRIMARY KEY ," +
                    "username TEXT ," +
                    "password TEXT,  " +
                    "fName TEXT, " +
                    "lName TEXT, " +
                    "address TEXT, " +
                    "postalcode TEXT);");

        }catch(Exception e)
        {
            Log.d("Error: ", e.getMessage()+"");
        }

        register=findViewById(R.id.newregBtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String txtName,txtPassword, txtFirstName, txtLastName,txtAddress,txtPostalCode;

                int txtCustomerId=Integer.parseInt(((EditText)findViewById(R.id.editCustomerID)).getText().toString());
                txtName=((EditText)findViewById(R.id.editUsername)).getText().toString();
                txtPassword=((EditText)findViewById(R.id.editPassword)).getText().toString();
                txtFirstName=((EditText)findViewById(R.id.editFName)).getText().toString();
                txtLastName=((EditText)findViewById(R.id.editLName)).getText().toString();
                txtAddress=((EditText)findViewById(R.id.editAddress)).getText().toString();
                txtPostalCode=((EditText)findViewById(R.id.editPostalCode)).getText().toString();

                DBHelper db = new DBHelper(getApplicationContext());
                ContentValues values = new ContentValues();

                // Insert Values
                values.put("id",txtCustomerId);
                values.put("username",txtName);
                values.put("password",txtPassword);
                values.put("fName",txtFirstName);
                values.put("lName",txtLastName);
                values.put("address",txtAddress);
                values.put("postalcode",txtPostalCode);

                String message="You have successfully registered!!!";

                try {
                    db.addRow(values);
                    Log.d("success"," You have successfully registered!!!");
                    Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

                    // Display user credentials
                    Customer customer = shoppingDB.getCustomerById(Integer.parseInt(((EditText)findViewById(R.id.editCustomerID)).getText().toString()), "id");
                    ((TextView)findViewById(R.id.resultTextView)).setText(customer.username.toString()+" "+customer.password.toString());

                }
                catch (Exception e)
                {
                    Log.d("Error: ",e.getMessage());
                }

            }
        });
    }
}

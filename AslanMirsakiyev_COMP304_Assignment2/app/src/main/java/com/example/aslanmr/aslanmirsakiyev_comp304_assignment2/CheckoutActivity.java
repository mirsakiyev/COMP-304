package com.example.aslanmr.aslanmirsakiyev_comp304_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }

    public void placeOrderBtn_Click(View v)
    {
        if (v.getId()==R.id.placeOrderBtn)
        {
            Intent intent=new Intent(CheckoutActivity.this, SummaryActivity.class);

            startActivity(intent);
        }
    }
}

package com.example.aslanmr.aslanmirsakiyev_comp304_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

    }

    public void goBackBtn_Click(View v)
    {
        if (v.getId()==R.id.goBackBtn)
        {
            Intent intent=new Intent(CheckoutActivity.this, BrandsActivity.class);
            startActivity(intent);
        }
    }

    public void placeOrderBtn_Click(View v)
    {
        if (v.getId()==R.id.placeOrderBtn)
        {

            Bundle bundle=getIntent().getExtras();
            String appleProduct_1=bundle.getString("appleProduct1");
            String appleProduct_2=bundle.getString("appleProduct2");
            String appleProduct_3=bundle.getString("appleProduct3");


            Intent apple_1=new Intent(CheckoutActivity.this, SummaryActivity.class);
            apple_1.putExtra("appleProduct1",appleProduct_1);
            startActivity(apple_1);


            Intent apple_2=new Intent(CheckoutActivity.this, SummaryActivity.class);
            apple_1.putExtra("appleProduct1",appleProduct_2);
            startActivity(apple_2);

            Intent apple_3=new Intent(CheckoutActivity.this, SummaryActivity.class);
            apple_1.putExtra("appleProduct1",appleProduct_3);
            startActivity(apple_3);



            Intent intent=new Intent(CheckoutActivity.this, SummaryActivity.class);

            startActivity(intent);
        }

    }
}

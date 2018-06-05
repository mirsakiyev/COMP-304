package com.example.aslanmr.aslanmirsakiyev_comp304_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        //Couldnt implement summary
        /*
        Bundle bundle=getIntent().getExtras();
        String appleProduct_1=bundle.getString("appleProduct1");
        String appleProduct_2=bundle.getString("appleProduct2");
        String appleProduct_3=bundle.getString("appleProduct3");

        TextView txt1=findViewById(R.id.AppleProduct_1);
        txt1.setText(appleProduct_1.toString());

        TextView txt2=findViewById(R.id.AppleProduct_2);
        txt1.setText(appleProduct_2.toString());

        TextView txt3=findViewById(R.id.AppleProduct_3);
        txt1.setText(appleProduct_3.toString());
        */
    }
}

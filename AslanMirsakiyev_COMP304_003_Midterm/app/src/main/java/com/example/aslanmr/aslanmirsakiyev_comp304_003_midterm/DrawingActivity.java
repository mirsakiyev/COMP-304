package com.example.aslanmr.aslanmirsakiyev_comp304_003_midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrawingActivity extends AppCompatActivity {


    String selectedOs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

        selectedOs=getIntent().getStringExtra("SelectedOS");

        TextView market=findViewById(R.id.marketTxt);
        market.setText(selectedOs);

    }
}

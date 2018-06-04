package com.example.aslanmr.aslanmirsakiyev_comp304_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class BrandsActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brands);

        textView=findViewById(R.id.categoryTextView);

        String TempHolder=getIntent().getStringExtra("ListViewClickValue");

        textView.setText(TempHolder);

    }
}

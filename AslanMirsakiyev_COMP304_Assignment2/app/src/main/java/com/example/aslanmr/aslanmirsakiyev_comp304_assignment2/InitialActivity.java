package com.example.aslanmr.aslanmirsakiyev_comp304_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
    }

    public void shopBtn_Click(View v)
    {
        if (v.getId()==R.id.shopBtn)
        {
            Intent intent=new Intent(InitialActivity.this, CategoriesActivity.class);

            startActivity(intent);
        }
    }
}

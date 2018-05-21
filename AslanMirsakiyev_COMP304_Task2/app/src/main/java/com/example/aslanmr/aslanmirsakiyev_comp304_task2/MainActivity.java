package com.example.aslanmr.aslanmirsakiyev_comp304_task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Send_Message(View v)
    {
        //Create String objects and values from strings.xml
        String name=            getString(R.string.nameStr);
        String qualification=   getString(R.string.qualificationStr);
        String dreamJob=        getString(R.string.dreamjobStr);
        String specField=       getString(R.string.specfieldStr);

        if (v.getId()==R.id.sendBtn)
        {
            Intent intent=new Intent(MainActivity.this, SubActivity.class);

            intent.putExtra("intentName",name);
            intent.putExtra("intentQualification",qualification);
            intent.putExtra("intentDreamJob",dreamJob);
            intent.putExtra("intentSpecField",specField);

            startActivity(intent);

        }
    }
}

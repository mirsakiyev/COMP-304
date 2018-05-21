package com.example.aslanmr.aslanmirsakiyev_comp304_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText myN;
    EditText myH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myN=(EditText) findViewById(R.id.nameTxt);
        myH=(EditText) findViewById(R.id.hobbyTxt);
    }


    //Send Message method takes to SubActivity on Click
    public void Send_Message(View v)
    {

        if (v.getId()==R.id.sendBtn)
        {
            //Strings which will contain text from TextBoxs
            String myName=myN.getText().toString();
            String myHobby=myH.getText().toString();

            //Initialize Intent and set putExtra for both parameters
            Intent intent=new Intent(MainActivity.this,SubActivity.class);
            intent.putExtra("myName",myName);
            intent.putExtra("myHobby",myHobby);

            startActivity(intent);
        }
    }
}

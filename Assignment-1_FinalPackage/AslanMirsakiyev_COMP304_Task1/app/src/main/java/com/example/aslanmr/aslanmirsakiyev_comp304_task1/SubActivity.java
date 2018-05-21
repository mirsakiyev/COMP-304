package com.example.aslanmr.aslanmirsakiyev_comp304_task1;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //Initialize Bundle
        Bundle bundle=getIntent().getExtras();

        //Create strings to contain text values from myName and my Hobby
        String myName=bundle.getString("myName");
        String myHobby=bundle.getString("myHobby");

        TextView myNameTextView=findViewById(R.id.nameTextView_Sub);
        TextView myHobbyTextView=findViewById(R.id.hobbyTextView_Sub);

        //Set text values to TextViews(myName, myHobby)
        myNameTextView.setText("Name is "+myName);
        myHobbyTextView.setText("Hobby is "+myHobby);
    }
}

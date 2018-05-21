package com.example.aslanmr.aslanmirsakiyev_comp304_task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //Initialize Bundle to get extras from intent
        Bundle bundle=getIntent().getExtras();

        //Create strings and set values from intent
        String name=                bundle.getString("intentName");
        String qualification=       bundle.getString("intentQualification");
        String dreamJob=            bundle.getString("intentDreamJob");
        String specField=           bundle.getString("intentSpecField");

        //Create TextView objects for every filed
        TextView showName=          findViewById(R.id.nameTextView);
        TextView showQualification= findViewById(R.id.qualificationTextView);
        TextView showDreamJob=      findViewById(R.id.dreamjobTextView);
        TextView showSpecField=     findViewById(R.id.specfieldTextView);

        //Set text to TextView objects from strings
        showName.setText            ("Name: "+name);
        showQualification.setText   ("Qualification: "+qualification);
        showDreamJob.setText        ("Dream Job: "+dreamJob);
        showSpecField.setText       ("Specialized Field: "+specField);

    }
}

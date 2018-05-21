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

        //Create TextView objects for every filed
        TextView showName=          findViewById(R.id.nameTextView);
        TextView showQualification= findViewById(R.id.qualificationTextView);
        TextView showDreamJob=      findViewById(R.id.dreamjobTextView);
        TextView showSpecField=     findViewById(R.id.specfiledTextView);

        //Set Text to TextView objects from strings.xml
        showName.setText            (R.string.nameStr);
        showQualification.setText   (R.string.qualificationStr);
        showDreamJob.setText        (R.string.dreamjobStr);
        showSpecField.setText       (R.string.specfieldStr);

    }
}

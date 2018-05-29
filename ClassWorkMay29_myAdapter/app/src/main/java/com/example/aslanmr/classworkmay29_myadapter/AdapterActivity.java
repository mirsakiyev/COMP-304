package com.example.aslanmr.classworkmay29_myadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        //String[] flavours={"vanilla","strawberry",""};

        //get array from strings.xml
        String[] flavours=getResources().getStringArray(R.array.Flavours);

        //initialize adapter
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,flavours);

        AutoCompleteTextView text= findViewById(R.id.autoCompleteTextView);
        ListView list=findViewById(R.id.list);
        Spinner spin=findViewById(R.id.spinner);


        //set adapter for auto complete text view
        text.setAdapter(adapter);
        text.setThreshold(2);

        //set adapter for list view
        list.setAdapter(adapter);

        //set adapter for spinner
        spin.setAdapter(adapter);

    }
}


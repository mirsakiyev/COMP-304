package com.example.aslanmr.aslanmirsakiyev_comp304_003_midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // Initialization
    //final Spinner spinner=null;
    ArrayAdapter<CharSequence> adapter;
    Intent intent;
    Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Spinner spinner =findViewById(R.id.osSpinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter = ArrayAdapter.createFromResource(this,
                R.array.operatingSystem, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        // Event handling

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                final String selectedOs = spinner.getSelectedItem().toString();
                Button btn=findViewById(R.id.goBtn);
                btn.setText("Go to "+selectedOs+" graph");

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }



    public void goBtn_Click(View v)
    {
        Spinner spinner2=findViewById(R.id.osSpinner);
        final String getOs = spinner2.getSelectedItem().toString();

        intent=new Intent(this, DrawingActivity.class);
        intent.putExtra("SelectedOS",getOs);
        startActivity(intent);

    }
}

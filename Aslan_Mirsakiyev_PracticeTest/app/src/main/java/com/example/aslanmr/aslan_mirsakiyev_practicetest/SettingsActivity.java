package com.example.aslanmr.aslan_mirsakiyev_practicetest;
/*
 * Aslan Mirsakiyev
 * Practice Test 1
 * June 15, 2018
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; 
import android.widget.AdapterView;
 import android.widget.ListView;

public class SettingsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        final ListView lvSettings=(ListView)findViewById(R.id.listView); 
        //handle the item click event 

        lvSettings.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=null;
                String selectedSettings=(String)lvSettings.getItemAtPosition(position);

                switch (position)
                {
                    case 0:
                        intent=new Intent(SettingsActivity.this, StorageActivity.class);
                        intent.putExtra("selectedSettings",selectedSettings);
                        startActivity(intent);
                        break;
                }


            }
        });
    }
}

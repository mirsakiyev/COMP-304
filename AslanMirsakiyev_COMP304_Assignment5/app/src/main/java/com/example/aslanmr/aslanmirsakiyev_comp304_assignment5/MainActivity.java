package com.example.aslanmr.aslanmirsakiyev_comp304_assignment5;

/*
 * Assignment 5
 * Aslan Mirsakiyev
 * 20 of July 2018
 */

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] brands;
    ListView listView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = getListView();


        brands = getResources().getStringArray(R.array.brands);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, brands);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                displayNextActivity(position);
            }
        });
    }

    private void displayNextActivity(int index) {
        intent = new Intent(this, ShowroomActivity.class);
        intent.putExtra("brand", listView.getItemAtPosition(index).toString());
        startActivity(intent);
    }
}

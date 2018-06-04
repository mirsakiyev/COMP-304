package com.example.aslanmr.aslanmirsakiyev_comp304_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoriesActivity extends AppCompatActivity {


    ListView listView;

    //initialize an array with category items
    String[] categoriesItems=new String[]{
                                            "Phones",
                                            "Laptops",
                                            "Smart Watches",
                                            "TVs"
                                            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        listView=findViewById(R.id.categoriesListView);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, categoriesItems);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String TempListView=categoriesItems[position].toString();

                Intent intent=new Intent(CategoriesActivity.this, BrandsActivity.class);

                intent.putExtra("ListViewClickValue", TempListView);

                startActivity(intent);
            }
        });
    }
}

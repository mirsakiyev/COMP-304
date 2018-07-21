package com.example.aslanmr.aslanmirsakiyev_comp304_assignment5;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowroomActivity extends ListActivity {

    String[] brands;
    ListView listView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);

        listView = getListView();


        String brand = getIntent().getStringExtra("brand");
        switch (brand) {


            case "Mercedes":
                brands = getResources().getStringArray(R.array.mercedes_showrooms);

                ArrayAdapter<String> adapterMercedes = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, brands);
                listView.setAdapter(adapterMercedes);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position){
                            case 0:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Mercedes_Location1");
                                startActivity(intent);
                                break;

                            case 1:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Mercedes_Location2");
                                startActivity(intent);
                                break;

                            case 2:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Mercedes_Location3");
                                startActivity(intent);
                                break;

                        }
                    }
                });
                break;




            case "BMW":
                brands = getResources().getStringArray(R.array.bmw_showrooms);

                ArrayAdapter<String> adapterBMW = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, brands);
                listView.setAdapter(adapterBMW);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position){
                            case 0:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","BMW_Location1");
                                startActivity(intent);
                                break;

                            case 1:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","BMW_Location2");
                                startActivity(intent);
                                break;

                            case 2:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","BMW_Location3");
                                startActivity(intent);
                                break;

                        }
                    }
                });
                break;
            case "Honda":
                brands = getResources().getStringArray(R.array.honda_showrooms);

                ArrayAdapter<String> adapterHonda = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, brands);
                listView.setAdapter(adapterHonda);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position){
                            case 0:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Honda_Location1");
                                startActivity(intent);
                                break;

                            case 1:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Honda_Location2");
                                startActivity(intent);
                                break;

                            case 2:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Honda_Location3");
                                startActivity(intent);
                                break;

                        }
                    }
                });
                break;





            case "Lexus":
                brands = getResources().getStringArray(R.array.lexus_showrooms);

                ArrayAdapter<String> adapterLexus = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, brands);
                listView.setAdapter(adapterLexus);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position){
                            case 0:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Lexus_Location1");
                                startActivity(intent);
                                break;

                            case 1:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Lexus_Location2");
                                startActivity(intent);
                                break;

                            case 2:
                                intent = new Intent(ShowroomActivity.this, MapsActivity.class);
                                intent.putExtra("name","Lexus_Location3");
                                startActivity(intent);
                                break;

                        }
                    }
                });

                break;
        }
    }
}

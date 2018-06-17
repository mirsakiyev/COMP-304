package com.example.aslanmr.aslanmirsakiyev_comp304_assignment3;

/*
 * Aslan Mirsakiyev
 * June 17, 2018
 * Assignment 3 - Dashboard
 */

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DashboardActivity extends ListActivity {

    String[] tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ListView listTasks=getListView();
        listTasks.setChoiceMode(ListView.CHOICE_MODE_NONE);
        listTasks.setTextFilterEnabled(true);

        tasks=getResources().getStringArray(R.array.tasks);

        //Bind array to ListView
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tasks));
    }

    // Method that takes user to a chosen task
    public void onListItemClick(ListView parent, View v, int position, long id)
    {
        Intent intent=null;
        switch (position) {
            case 0:
                intent=new Intent(this,DrawingActivity_Task1.class);
                break;

            case 1:
                intent=new Intent(this, FramedAnimationActivity_Task2.class);
                break;

            case 2:
                intent=new Intent(this, TweenedAnimationActivity_Task3.class);
                break;
        }
        startActivity(intent);
    }
}

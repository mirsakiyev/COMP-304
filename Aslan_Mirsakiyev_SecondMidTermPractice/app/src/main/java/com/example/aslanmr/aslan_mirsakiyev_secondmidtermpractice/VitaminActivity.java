package com.example.aslanmr.aslan_mirsakiyev_secondmidtermpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class VitaminActivity extends AppCompatActivity {

    // initialize intent
    private Intent intent;

    // initialize int array for checkedStates
    private int[] checkedStates=new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin);
    }

    public void onCheckboxClicked(View view)
    {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();


        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.chkVitaminA:
                if (checked)
                    checkedStates[0]=1;
                else checkedStates[0]=0;
                break;

            case R.id.chkVitaminB:
                if (checked)
                    checkedStates[1]=2;
                else checkedStates[1]=0;
                break;

            case R.id.chkVitaminC:
                if (checked)
                    checkedStates[2]=3;
                else checkedStates[2]=0;
                break;

            case R.id.chkVitaminD:
                if (checked)
                    checkedStates[3]=4;
                else checkedStates[3]=0;
                break;

                default:
                    break;
        }
    }

    // handling image button
    public void showChartActivity(View v)
    {
        //put selected items in Extras
        intent = new Intent(this, ChartActivity.class);
        intent.putExtra("checkedStates",checkedStates);//
        //
        startActivity(intent);
    }
}

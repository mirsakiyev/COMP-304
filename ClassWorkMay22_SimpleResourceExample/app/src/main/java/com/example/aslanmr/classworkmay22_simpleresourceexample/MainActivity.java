package com.example.aslanmr.classworkmay22_simpleresourceexample;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myString = getResources().getString(R.string.display);
        int myColor = getResources().getColor(R.color.prettyTextColor);
        float myDimen = getResources().getDimension(R.dimen.textPointSize);
        ColorDrawable myDraw = (ColorDrawable)getResources().getDrawable(R.drawable.redDrawable);
        ImageView imgView = findViewById(R.id.imageView);

        imgView.setImageDrawable(myDraw);
        //String[] flavors = getResources().getStringArray(R.array.flavours);

        TextView tv = findViewById(R.id.txtView);
        tv.setTextSize(myDimen);
        tv.setTextColor(myColor);
        tv.setText(myString);

    }
}

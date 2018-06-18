package com.example.aslanmr.aslanmirsakiyev_comp304_assignment3;

/*
 * Aslan Mirsakiyev
 * June 17, 2018
 * Assignment 3 - Framed Animation - Task 2
 */

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FramedAnimationActivity_Task2 extends AppCompatActivity {

    AnimationDrawable mframeAnimation=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framed_animation__task2);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        final Button btnStart=findViewById(R.id.task2_btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimation();
            }
        });

        final Button btnStop=findViewById(R.id.task2_btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAnimation();
            }
        });
    }

    private void startAnimation()
    {
        
    }

    private void stopAnimation()
    {
        mframeAnimation.stop();
        mframeAnimation.setVisible(false, false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case android.R.id.home:
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

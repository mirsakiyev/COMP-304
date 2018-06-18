package com.example.aslanmr.aslanmirsakiyev_comp304_assignment3;

/*
 * Aslan Mirsakiyev
 * June 18, 2018
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
        ImageView img=findViewById(R.id.task2_imgAnimation);

        BitmapDrawable frame1=(BitmapDrawable) getResources().getDrawable(R.drawable.sven_1);
        BitmapDrawable frame2=(BitmapDrawable) getResources().getDrawable(R.drawable.sven_2);
        BitmapDrawable frame3=(BitmapDrawable) getResources().getDrawable(R.drawable.sven_3);
        BitmapDrawable frame4=(BitmapDrawable) getResources().getDrawable(R.drawable.sven_4);
        BitmapDrawable frame5=(BitmapDrawable) getResources().getDrawable(R.drawable.sven_5);

        // get the background which has been compiled to an AnimDraw object
        int duration=250;
        mframeAnimation=new AnimationDrawable();
        mframeAnimation.setOneShot(false); //loop forever
        mframeAnimation.addFrame(frame1, duration);
        mframeAnimation.addFrame(frame2, duration);
        mframeAnimation.addFrame(frame3, duration);
        mframeAnimation.addFrame(frame4, duration);
        mframeAnimation.addFrame(frame5, duration);

        img.setBackground(mframeAnimation);

        mframeAnimation.setVisible(true,true);
        mframeAnimation.start();
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

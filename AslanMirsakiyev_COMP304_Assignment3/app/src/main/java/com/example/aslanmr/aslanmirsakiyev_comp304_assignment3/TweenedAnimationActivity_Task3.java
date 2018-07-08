package com.example.aslanmr.aslanmirsakiyev_comp304_assignment3;

/*
 * Aslan Mirsakiyev
 * June 18, 2018
 * Assignment 3 - Tweened Animation - Task 3
 */

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class TweenedAnimationActivity_Task3 extends AppCompatActivity {

    // initialize ImageView for moon and earth and Animation
    ImageView imgMoon;
    ImageView imgEarth;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweened_animation__task3);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);


        // Earth - static
        imgEarth=findViewById(R.id.task3_imgEarth);
        imgEarth.setImageResource(R.drawable.earth);
        imgEarth.setVisibility(View.VISIBLE);

        //Moon - in motion 
        imgMoon=findViewById(R.id.task3_imgMoon);
        imgMoon.setImageResource(R.drawable.moon);
        imgMoon.setVisibility(View.VISIBLE);


        // event handlers

        Button btnStart=findViewById(R.id.task3_btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimation();
                earthSpinAroundItself();
            }
        });


        Button btnStop=findViewById(R.id.task3_btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAnimation();
            }
        });
    }

    private void earthSpinAroundItself()
    {
        anim= AnimationUtils.loadAnimation(this, R.anim.earth_spins_around_itself);
        imgEarth.startAnimation(anim);
    }

    private void startAnimation()
    {
        anim= AnimationUtils.loadAnimation(this, R.anim.revolve);
        imgMoon.startAnimation(anim);
    }

    private void stopAnimation()
    {
        imgMoon.clearAnimation();
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

package com.example.aslanmr.aslanmirsakiyev_comp304_003_midterm;

/*
 * Aslan Mirsakiyev
 * Midterm Test
 * 22 June , 2018
 */

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrawingActivity extends AppCompatActivity {


    String selectedOs;
    ImageView imageView;
    Paint paint;
    Bitmap bitmap;
    Canvas canvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

        selectedOs=getIntent().getStringExtra("SelectedOS");

        TextView labelTxt=findViewById(R.id.marketTxt);
        labelTxt.setText("Mobile Operating System Market Share Worldwide for: "+selectedOs);


        paint=new Paint();




        imageView=findViewById(R.id.graphImgageView);

        int width=(int) getResources().getDimension(R.dimen.img_width);
        int height=(int) getResources().getDimension(R.dimen.img_height);

        bitmap=Bitmap.createBitmap(width,height, Bitmap.Config.ARGB_8888);
        canvas=new Canvas(bitmap);

        canvas.drawColor(Color.BLACK);

        imageView.setImageBitmap(bitmap);

        imageView.draw(canvas);



        // draw lines on canvas - couldnt implement this feature, due time limits
        // TODO: use values from dimens

        if (selectedOs=="Android")
        {
            canvas.drawLine(10,10,2000,10,paint);
            paint.setStrokeWidth(10);
            paint.setColor(Color.GREEN);
        }

        if (selectedOs=="iOS")
        {
            canvas.drawLine(10,10,2000,10,paint);
            paint.setStrokeWidth(10);
            paint.setColor(Color.GRAY);
        }



    }
}

package com.example.aslanmr.aslanmirsakiyev_comp304_assignment3;

/*
 * Aslan Mirsakiyev
 * June 17, 2018
 * Assignment 3 - Drawing - Task 1
 */

import android.icu.text.RelativeDateTimeFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class DrawingActivity_Task1 extends AppCompatActivity implements View.OnTouchListener {


    // initialize Paint and Bitmap
    Paint paint;
    Bitmap bitmap;
    Canvas canvas;

    // initialize ImageView for canvas and TextView for X and Y
    ImageView imgCanvas;
    TextView tvX;
    TextView tvY;

    // initialize coordinates for X and Y
    int startX=10;
    int startY=10;
    int endX=10;
    int endY=10;

    // initialize thickness and color
    int lineThickness;
    int lineColor;

    // initialize a constant delay value(ms) to draw a line
    final int DRAW_DELAY=25;

    // initialize Enum for current direction
    DirectionEnum currentDirection;

    // initialize Handler
    private  Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing__task1);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        // set spinner value
        final Spinner spnLineThickness =findViewById(R.id.task1_spnLineThickness);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.line_thickness,
                android.R.layout.simple_spinner_dropdown_item);
        spnLineThickness.setAdapter(adapter);


        // set array key images
        ImageButton imgArrowUp=findViewById(R.id.imgArrowUp);
        ImageButton imgArrowLeft=findViewById(R.id.imgArrowLeft);
        ImageButton imgArrowRight=findViewById(R.id.imgArrowRight);
        ImageButton imgArrowDown=findViewById(R.id.imgArrowDown);

        // assign arrow key img to arrow key img buttons
        imgArrowUp.setImageDrawable(getResources().getDrawable(R.drawable.ic_key_arrow_up_black_24dp));
        imgArrowLeft.setImageDrawable(getResources().getDrawable(R.drawable.ic_key_arrow_left_black_24dp));
        imgArrowRight.setImageDrawable(getResources().getDrawable(R.drawable.ic_key_arrow_right_black_24dp));
        imgArrowDown.setImageDrawable(getResources().getDrawable(R.drawable.ic_key_arrow_down_black_24dp));

        // initialize drawing objects
        paint =new Paint();

        Point size=new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int defaultWidth=size.x;
        int defaultHeigth=size.y;

        bitmap=Bitmap.createBitmap(defaultWidth,defaultHeigth, Bitmap.Config.ARGB_8888);
        canvas=new Canvas(bitmap);

        imgCanvas=findViewById(R.id.task1_imgCanvas);
        imgCanvas.setImageBitmap(bitmap);
        tvX=findViewById(R.id.task1_tvX);
        tvY=findViewById(R.id.task1_tvY);


        // event handlers


        // TODO: [FIXED] - "Method does not override method from its superclass"

        //paint.setStrokeWidth(20); // THIS IS A TEMPORARY LINE OF CODE to set thickness to 20

        spnLineThickness.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                lineThickness=Integer.parseInt(spnLineThickness.getSelectedItem().toString());
                paint.setStrokeWidth(lineThickness);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        RadioGroup rgrpLineColor=findViewById(R.id.rgrpColors);
        rgrpLineColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radColorRed:
                        lineColor=Color.RED;
                        break;

                    case R.id.radColorGreen:
                        lineColor=Color.GREEN;
                        break;

                    case R.id.radColorBlue:
                        lineColor=Color.BLUE;
                }
                paint.setColor(lineColor);
            }
        });

        Button btnClear=findViewById(R.id.task1_btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearCanvas();
            }
        });

        imgArrowUp.setOnTouchListener(this);
        imgArrowDown.setOnTouchListener(this);
        imgArrowRight.setOnTouchListener(this);
        imgArrowLeft.setOnTouchListener(this);

        // set default options
        spnLineThickness.setSelection(0);
        rgrpLineColor.check(R.id.radColorRed);
        clearCanvas();

    }

    private void clearCanvas() {
        canvas.drawColor(Color.BLACK);
    }

    private void drawLine(DirectionEnum direction, Canvas canvas) {
        imgCanvas.setFocusable(true);
        imgCanvas.requestFocus();

        switch (direction) {
            case DOWN:
                endY+=5;
                break;

            case UP:
                endY-=5;
                break;

            case RIGHT:
                endX+=5;
                break;

            case LEFT:
                endX-=5;
                break;
        }

        tvX.setText(String.format("%s %s",getResources().getString(R.string.task1_x), String.valueOf(endX)));
        tvY.setText(String.format("%s %s",getResources().getString(R.string.task1_y), String.valueOf(endY)));
        canvas.drawLine(startX, startY, endX, endY, paint);
        startX=endX;
        startY=endY;

        imgCanvas.invalidate();
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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_DPAD_DOWN:
                drawLine(DirectionEnum.DOWN, canvas);
                return true;

            case KeyEvent.KEYCODE_DPAD_UP:
                drawLine(DirectionEnum.UP, canvas);
                return true;

            case KeyEvent.KEYCODE_DPAD_RIGHT:
                drawLine(DirectionEnum.RIGHT, canvas);
                return true;

            case KeyEvent.KEYCODE_DPAD_LEFT:
                drawLine(DirectionEnum.LEFT, canvas);
                return true;
        }
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN) {
            switch (v.getId()) {
                case R.id.imgArrowUp:
                    currentDirection = DirectionEnum.UP;
                    break;

                case R.id.imgArrowDown:
                    currentDirection = DirectionEnum.DOWN;
                    break;

                case R.id.imgArrowLeft:
                    currentDirection = DirectionEnum.LEFT;
                    break;

                case R.id.imgArrowRight:
                    currentDirection = DirectionEnum.RIGHT;
                    break;
            }
            // continuously call draw action while button is held down
            if (mHandler != null) {
                return true;
            }
            mHandler = new Handler();
            mHandler.postDelayed(mDraw, DRAW_DELAY);
        }else if (event.getAction()==MotionEvent.ACTION_UP) {
            if (mHandler==null) return true;
            mHandler.removeCallbacks(mDraw);
            mHandler=null;
        }
        return false;
    }

    Runnable mDraw = new Runnable() {
        @Override
        public void run() {
            drawLine(currentDirection, canvas);
            mHandler.postDelayed(this,DRAW_DELAY);
        }
    };
}

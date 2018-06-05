package com.example.aslanmr.aslanmirsakiyev_comp304_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BrandsActivity extends AppCompatActivity {

    TextView textView;

    //initialize TextView for Apple products
    TextView AppleProduct_1;
    TextView AppleProduct_2;
    TextView AppleProduct_3;

    //initialize CheckBox for Apple products
    CheckBox AppleProduct_1_CheckBox;
    CheckBox AppleProduct_2_CheckBox;
    CheckBox AppleProduct_3_CheckBox;



    //initialize TextView for Samsung products
    TextView SamsungProduct_1;
    TextView SamsungProduct_2;
    TextView SamsungProduct_3;

    //initialize CheckBox for Samsung products
    CheckBox SamsungProduct_1_CheckBox;
    CheckBox SamsungProduct_2_CheckBox;
    CheckBox SamsungProduct_3_CheckBox;



    //initialize TextView for LG products
    TextView LgProduct_1;
    TextView LgProduct_2;
    TextView LgProduct_3;

    //initialize CheckBox for LG products
    CheckBox LgProduct_1_CheckBox;
    CheckBox LgProduct_2_CheckBox;
    CheckBox LgProduct_3_CheckBox;


    //initialize RadioButtons for Brands
    RadioButton AppleRadBtn;
    RadioButton SamsungRadBtn;
    RadioButton LgRadioBtn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brands);

        }

        public void backBtn_Click(View v)
        {
            if (v.getId()==R.id.backBtn)
            {
                Intent intent=new Intent(BrandsActivity.this, CategoriesActivity.class);

                startActivity(intent);
            }
        }

        public void checkoutBtn_Click(View v)
        {
            if (v.getId()==R.id.checkoutBtn)
            {
                Intent intent=new Intent(BrandsActivity.this, CheckoutActivity.class);

                startActivity(intent);

                AppleProduct_1_CheckBox=findViewById(R.id.apple1CheckBox);

                if (AppleProduct_1_CheckBox.isChecked())
                {
                    String appleProduct_1=AppleProduct_1.getText().toString();
                    Intent apple_1=new Intent(BrandsActivity.this, CheckoutActivity.class);

                    apple_1.putExtra("appleProduct1",appleProduct_1);
                    startActivity(apple_1);
                }


                if (AppleProduct_2_CheckBox.isChecked())
                {
                    String appleProduct_2=AppleProduct_2.getText().toString();
                    Intent apple_2=new Intent(BrandsActivity.this, CheckoutActivity.class);

                    apple_2.putExtra("appleProduct2",appleProduct_2);
                    startActivity(apple_2);
                }

                if (AppleProduct_3_CheckBox.isChecked())
                {
                    String appleProduct_3=AppleProduct_3.getText().toString();
                    Intent apple_3=new Intent(BrandsActivity.this, CheckoutActivity.class);

                    apple_3.putExtra("appleProduct3",appleProduct_3);
                    startActivity(apple_3);
                }

            }
        }

    public void showBtn_Click(View v)
    {

        String TempHolder=getIntent().getStringExtra("ListViewClickValue");

        if (v.getId()==R.id.showBtn)
        {
            String stringPhones="Phones";
            String stringLaptops="Laptops";
            String stringWatches="Smart Watches";
            String stringTVs="TVs";

            AppleRadBtn=findViewById(R.id.appleRadBtn);
            SamsungRadBtn=findViewById(R.id.samsungRadBtn);
            LgRadioBtn=findViewById(R.id.lgRadBtn);


            // ************************************************************************************************
            // ************************************************************************************************
            if (AppleRadBtn.isChecked())
            {

                //Check if user selected Phones from categories
                if (TempHolder.equals(stringPhones))
                {
                    // **************************************************************
                    // Apple Phones Section
                    AppleProduct_1=findViewById(R.id.apple1TextView);
                    AppleProduct_1.setText("iPhone X");
                    AppleProduct_1.setVisibility(View.VISIBLE);
                    AppleProduct_1_CheckBox=findViewById(R.id.apple1CheckBox);
                    AppleProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_2=findViewById(R.id.apple2TextView);
                    AppleProduct_2.setText("iPhone 8");
                    AppleProduct_2.setVisibility(View.VISIBLE);
                    AppleProduct_2_CheckBox=findViewById(R.id.apple2CheckBox);
                    AppleProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_3=findViewById(R.id.apple3TextView);
                    AppleProduct_3.setText("iPhone 7");
                    AppleProduct_3.setVisibility(View.VISIBLE);
                    AppleProduct_3_CheckBox=findViewById(R.id.apple3CheckBox);
                    AppleProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }


                //Check if user selected Laptops from categories
                if (TempHolder.equals(stringLaptops))
                {
                    // **************************************************************
                    // Apple Laptops Section
                    AppleProduct_1=findViewById(R.id.apple1TextView);
                    AppleProduct_1.setText("MacBook Pro");
                    AppleProduct_1.setVisibility(View.VISIBLE);
                    AppleProduct_1_CheckBox=findViewById(R.id.apple1CheckBox);
                    AppleProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_2=findViewById(R.id.apple2TextView);
                    AppleProduct_2.setText("MacBook Air");
                    AppleProduct_2.setVisibility(View.VISIBLE);
                    AppleProduct_2_CheckBox=findViewById(R.id.apple2CheckBox);
                    AppleProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_3=findViewById(R.id.apple3TextView);
                    AppleProduct_3.setText("iMac");
                    AppleProduct_3.setVisibility(View.VISIBLE);
                    AppleProduct_3_CheckBox=findViewById(R.id.apple3CheckBox);
                    AppleProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }

                //Check if user selected SmartWatches from categories
                if (TempHolder.equals(stringWatches))
                {
                    // **************************************************************
                    // Apple SmartWatches Section
                    AppleProduct_1=findViewById(R.id.apple1TextView);
                    AppleProduct_1.setText("Apple Watch Series 3");
                    AppleProduct_1.setVisibility(View.VISIBLE);
                    AppleProduct_1_CheckBox=findViewById(R.id.apple1CheckBox);
                    AppleProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_2=findViewById(R.id.apple2TextView);
                    AppleProduct_2.setText("Apple Watch Series 2");
                    AppleProduct_2.setVisibility(View.VISIBLE);
                    AppleProduct_2_CheckBox=findViewById(R.id.apple2CheckBox);
                    AppleProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_3=findViewById(R.id.apple3TextView);
                    AppleProduct_3.setText("Apple Watch Series 1");
                    AppleProduct_3.setVisibility(View.VISIBLE);
                    AppleProduct_3_CheckBox=findViewById(R.id.apple3CheckBox);
                    AppleProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************

                }


                //Check if user selected TVs from categories
                if (TempHolder.equals(stringTVs))
                {
                    // **************************************************************
                    // Apple TV Section
                    AppleProduct_1=findViewById(R.id.apple1TextView);
                    AppleProduct_1.setText("Apple TV");
                    AppleProduct_1.setVisibility(View.VISIBLE);
                    AppleProduct_1_CheckBox=findViewById(R.id.apple1CheckBox);
                    AppleProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_2=findViewById(R.id.apple2TextView);
                    AppleProduct_2.setText("Apple TV 4K");
                    AppleProduct_2.setVisibility(View.VISIBLE);
                    AppleProduct_2_CheckBox=findViewById(R.id.apple2CheckBox);
                    AppleProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    AppleProduct_3=findViewById(R.id.apple3TextView);
                    AppleProduct_3.setText("Apple TV edition");
                    AppleProduct_3.setVisibility(View.VISIBLE);
                    AppleProduct_3_CheckBox=findViewById(R.id.apple3CheckBox);
                    AppleProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************

                }
            }

            // ************************************************************************************************
            // ************************************************************************************************
            if (SamsungRadBtn.isChecked())
            {
                if (TempHolder.equals(stringPhones))
                {
                    // **************************************************************
                    //Samsung Phones Section
                    SamsungProduct_1=findViewById(R.id.samsung1TextView);
                    SamsungProduct_1.setText("Samsung S9");
                    SamsungProduct_1.setVisibility(View.VISIBLE);
                    SamsungProduct_1_CheckBox=findViewById(R.id.samsung1CheckBox);
                    SamsungProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_2=findViewById(R.id.samsung2TextView);
                    SamsungProduct_2.setText("Samsung S8");
                    SamsungProduct_2.setVisibility(View.VISIBLE);
                    SamsungProduct_2_CheckBox=findViewById(R.id.samsung2CheckBox);
                    SamsungProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_3=findViewById(R.id.samsung3TextView);
                    SamsungProduct_3.setText("Samsung S7");
                    SamsungProduct_3.setVisibility(View.VISIBLE);
                    SamsungProduct_3_CheckBox=findViewById(R.id.samsung3CheckBox);
                    SamsungProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }

                //Check if user selected Laptops from categories
                if (TempHolder.equals(stringLaptops))
                {
                    // **************************************************************
                    //Samsung Laptops Section
                    SamsungProduct_1=findViewById(R.id.samsung1TextView);
                    SamsungProduct_1.setText("Notebook 9");
                    SamsungProduct_1.setVisibility(View.VISIBLE);
                    SamsungProduct_1_CheckBox=findViewById(R.id.samsung1CheckBox);
                    SamsungProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_2=findViewById(R.id.samsung2TextView);
                    SamsungProduct_2.setText("Notebook 7");
                    SamsungProduct_2.setVisibility(View.VISIBLE);
                    SamsungProduct_2_CheckBox=findViewById(R.id.samsung2CheckBox);
                    SamsungProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_3=findViewById(R.id.samsung3TextView);
                    SamsungProduct_3.setText("Notebook Odyssey");
                    SamsungProduct_3.setVisibility(View.VISIBLE);
                    SamsungProduct_3_CheckBox=findViewById(R.id.samsung3CheckBox);
                    SamsungProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }

                //Check if user selected SmartWatches from categories
                if (TempHolder.equals(stringWatches))
                {
                    // **************************************************************
                    //Samsung SmartWatches Section
                    SamsungProduct_1=findViewById(R.id.samsung1TextView);
                    SamsungProduct_1.setText("Samsung Gear S3");
                    SamsungProduct_1.setVisibility(View.VISIBLE);
                    SamsungProduct_1_CheckBox=findViewById(R.id.samsung1CheckBox);
                    SamsungProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_2=findViewById(R.id.samsung2TextView);
                    SamsungProduct_2.setText("Samsung Gear Sport");
                    SamsungProduct_2.setVisibility(View.VISIBLE);
                    SamsungProduct_2_CheckBox=findViewById(R.id.samsung2CheckBox);
                    SamsungProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_3=findViewById(R.id.samsung3TextView);
                    SamsungProduct_3.setText("Samsung Gear Classic");
                    SamsungProduct_3.setVisibility(View.VISIBLE);
                    SamsungProduct_3_CheckBox=findViewById(R.id.samsung3CheckBox);
                    SamsungProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }

                if (TempHolder.equals(stringTVs))
                {
                    // **************************************************************
                    //Samsung TV Section
                    SamsungProduct_1=findViewById(R.id.samsung1TextView);
                    SamsungProduct_1.setText("Samsung Q7C");
                    SamsungProduct_1.setVisibility(View.VISIBLE);
                    SamsungProduct_1_CheckBox=findViewById(R.id.samsung1CheckBox);
                    SamsungProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_2=findViewById(R.id.samsung2TextView);
                    SamsungProduct_2.setText("Samsung Q9F 4K");
                    SamsungProduct_2.setVisibility(View.VISIBLE);
                    SamsungProduct_2_CheckBox=findViewById(R.id.samsung2CheckBox);
                    SamsungProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    SamsungProduct_3=findViewById(R.id.samsung3TextView);
                    SamsungProduct_3.setText("Samsung UHD");
                    SamsungProduct_3.setVisibility(View.VISIBLE);
                    SamsungProduct_3_CheckBox=findViewById(R.id.samsung3CheckBox);
                    SamsungProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }
            }
            // ************************************************************************************************
            // ************************************************************************************************



            // ************************************************************************************************
            // ************************************************************************************************
            if (LgRadioBtn.isChecked())
            {
                if (TempHolder.equals(stringPhones))
                {
                    // **************************************************************
                    //LG Phones Section
                    LgProduct_1=findViewById(R.id.lg1TextView);
                    LgProduct_1.setText("LG G7");
                    LgProduct_1.setVisibility(View.VISIBLE);
                    LgProduct_1_CheckBox=findViewById(R.id.lg1CheckBox);
                    LgProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_2=findViewById(R.id.lg2TextView);
                    LgProduct_2.setText("LG V30");
                    LgProduct_2.setVisibility(View.VISIBLE);
                    LgProduct_2_CheckBox=findViewById(R.id.lg2CheckBox);
                    LgProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_3=findViewById(R.id.lg3TextView);
                    LgProduct_3.setText("LGH873");
                    LgProduct_3.setVisibility(View.VISIBLE);
                    LgProduct_3_CheckBox=findViewById(R.id.lg3CheckBox);
                    LgProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }

                if (TempHolder.equals(stringLaptops))
                {
                    // **************************************************************
                    //LG Laptops Section
                    LgProduct_1=findViewById(R.id.lg1TextView);
                    LgProduct_1.setText("LG gram 15");
                    LgProduct_1.setVisibility(View.VISIBLE);
                    LgProduct_1_CheckBox=findViewById(R.id.lg1CheckBox);
                    LgProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_2=findViewById(R.id.lg2TextView);
                    LgProduct_2.setText("LG gram 14");
                    LgProduct_2.setVisibility(View.VISIBLE);
                    LgProduct_2_CheckBox=findViewById(R.id.lg2CheckBox);
                    LgProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_3=findViewById(R.id.lg3TextView);
                    LgProduct_3.setText("LG gram 13");
                    LgProduct_3.setVisibility(View.VISIBLE);
                    LgProduct_3_CheckBox=findViewById(R.id.lg3CheckBox);
                    LgProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }

                if (TempHolder.equals(stringWatches))
                {
                    // **************************************************************
                    //LG SmartWatches Section
                    LgProduct_1=findViewById(R.id.lg1TextView);
                    LgProduct_1.setText("LG watch Sport");
                    LgProduct_1.setVisibility(View.VISIBLE);
                    LgProduct_1_CheckBox=findViewById(R.id.lg1CheckBox);
                    LgProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_2=findViewById(R.id.lg2TextView);
                    LgProduct_2.setText("LG watch Style");
                    LgProduct_2.setVisibility(View.VISIBLE);
                    LgProduct_2_CheckBox=findViewById(R.id.lg2CheckBox);
                    LgProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_3=findViewById(R.id.lg3TextView);
                    LgProduct_3.setText("LG watch Urban");
                    LgProduct_3.setVisibility(View.VISIBLE);
                    LgProduct_3_CheckBox=findViewById(R.id.lg3CheckBox);
                    LgProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }

                if (TempHolder.equals(stringTVs))
                {
                    // **************************************************************
                    //LG TV Section
                    LgProduct_1=findViewById(R.id.lg1TextView);
                    LgProduct_1.setText("LG OLED TV");
                    LgProduct_1.setVisibility(View.VISIBLE);
                    LgProduct_1_CheckBox=findViewById(R.id.lg1CheckBox);
                    LgProduct_1_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_2=findViewById(R.id.lg2TextView);
                    LgProduct_2.setText("LG OLED AI");
                    LgProduct_2.setVisibility(View.VISIBLE);
                    LgProduct_2_CheckBox=findViewById(R.id.lg2CheckBox);
                    LgProduct_2_CheckBox.setVisibility(View.VISIBLE);

                    LgProduct_3=findViewById(R.id.lg3TextView);
                    LgProduct_3.setText("LG J2B HD");
                    LgProduct_3.setVisibility(View.VISIBLE);
                    LgProduct_3_CheckBox=findViewById(R.id.lg3CheckBox);
                    LgProduct_3_CheckBox.setVisibility(View.VISIBLE);
                    // **************************************************************
                }
            }

            else
            {

            }

        }
    }
}

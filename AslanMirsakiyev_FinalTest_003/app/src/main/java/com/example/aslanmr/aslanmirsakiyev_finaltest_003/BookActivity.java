package com.example.aslanmr.aslanmirsakiyev_finaltest_003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BookActivity extends AppCompatActivity {

    // Table Books
    private final static String TABLE_NAME = "Books";

    private static final String tableCreatorString =
            "CREATE TABLE "+ TABLE_NAME + " (bookISBN integer primary key, bookName text,authorName text,price real);";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);




        


    }
}

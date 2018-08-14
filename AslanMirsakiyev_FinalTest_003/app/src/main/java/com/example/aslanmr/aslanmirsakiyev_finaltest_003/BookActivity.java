package com.example.aslanmr.aslanmirsakiyev_finaltest_003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity {

    // Initialize BookManager
    private BookManager bookManager;

    // Initialize Buttons objects
    private Button newBooks, showBookDetails, buyBookBtn;

    // Initialize TextView objects
    private TextView bookName, authorName, priceName;

    // Initialize table name
    private final static String TABLE_NAME = "Books";

    private static final String tableCreatorString =
            "CREATE TABLE "+ TABLE_NAME + " (bookISBN integer primary key, bookName text,authorName text, price real);";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);


        newBooks=findViewById(R.id.newBooksBtn);
        showBookDetails=findViewById(R.id.showBookDetailsBtn);
        buyBookBtn=findViewById(R.id.buyBookBtn);
        
        bookName=findViewById(R.id.bookNameTextView);
        authorName=findViewById(R.id.authorNameTextView);
        priceName=findViewById(R.id.priceNameTextView);


        // Initialize the table using dbInitialize method of BookManager
        try {
            bookManager = new BookManager(this);
            //create the table
            bookManager.dbInitialize(TABLE_NAME, tableCreatorString);
        }
        catch(Exception exception)
        {
            Toast.makeText(BookActivity.this, exception.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("Error Message: ",exception.getMessage());
        }






    }
}

package com.example.aslanmr.aslanmirsakiyev_finaltest_003;

/* Final Test
 * Aug 14, 2018
 * Aslan Mirsakiyev
 * #300850326
 * Submitted to: Vinay Vaithilingam
 */



import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity {

    // Initialize BookManager
    private BookManager bookManager;

    // Initialize Buttons objects
    private Button newBooksBtn, showBookDetailsBtn, buyBookBtn;

    // Initialize TextView objects
    private TextView bookNameTxt, authorNameTxt, priceNameTxt;

    // Initialize TextView objects
    private Spinner bookISBNspn;

    // Initialize table name
    private final static String TABLE_NAME = "Books";

    private static final String tableCreatorString =
            "CREATE TABLE "+ TABLE_NAME + " (bookISBN integer primary key, bookName text,authorName text, price real);";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);


        newBooksBtn=findViewById(R.id.newBooksBtn);
        showBookDetailsBtn=findViewById(R.id.showBookDetailsBtn);
        buyBookBtn=findViewById(R.id.buyBookBtn);

        bookNameTxt=findViewById(R.id.bookNameTextView);
        authorNameTxt=findViewById(R.id.authorNameTextView);
        priceNameTxt=findViewById(R.id.priceNameTextView);

        bookISBNspn=findViewById(R.id.spinnerISBN);


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


        // Button event handlers
        newBooksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddNewBook(v);
            }
        });

        showBookDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowBook(v);
            }
        });

        buyBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookCityLink(v);
            }
        });
    }



    //--------------------------------------------------------------------------------------------------------------
    // Methods
    //--------------------------------------------------------------------------------------------------------------

    // This AddNewBook methods populates(hardcoded) Books table with values the values when newBooksBtn is clicked
    public void AddNewBook(View v)
    {
        // Row 1 ---------------------------------------
        String newISBN_Entry_1="9780134";
        String bookName_Entry_1="Unknown Place";
        String authorName_Entry_1="Michael Richards";
        double price_Entry_1=39.99;

        // Row 2 ---------------------------------------
        String newISBN_Entry_2="9881151";
        String bookName_Entry_2="Skate or Die";
        String authorName_Entry_2="Eric Koston";
        double price_Entry_2=59.99;

        // Row 3 ---------------------------------------
        String newISBN_Entry_3="9439032";
        String bookName_Entry_3="Winter is Coming";
        String authorName_Entry_3="Robert Barateon";
        double price_Entry_3=59.99;


        ContentValues contentValues = new ContentValues();

        contentValues.put("bookISBN",newISBN_Entry_1);
        contentValues.put("bookName",bookName_Entry_1);
        contentValues.put("authorName",authorName_Entry_1);
        contentValues.put("price",price_Entry_1);

        contentValues.put("bookISBN",newISBN_Entry_2);
        contentValues.put("bookName",bookName_Entry_2);
        contentValues.put("authorName",authorName_Entry_2);
        contentValues.put("price",price_Entry_2);

        contentValues.put("bookISBN",newISBN_Entry_3);
        contentValues.put("bookName",bookName_Entry_3);
        contentValues.put("authorName",authorName_Entry_3);
        contentValues.put("price",price_Entry_3);

        try
        {
            bookManager.addRecord(contentValues);
        }
        catch(Exception exception)
        {
            Toast.makeText(BookActivity.this,
                    exception.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("Error Message: ",exception.getMessage());
        }

    }


    public void ShowBook(View v)
    {
        // Couldnt implement this method due time frames
    }


    // Link to book city website method
    public void BookCityLink(View v)
    {
        Uri uri = Uri.parse("http://www.bookcity.ca");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}

package com.example.aslanmr.aslanmirsakiyev_finaltest_003;

public class Book {


    // Private instance variables
    private int bookISBN;
    private double Price;
    private String bookName, authorName;



    // bookISBN
    public int getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(int bookISBN) {
        this.bookISBN = bookISBN;
    }


    // Price
    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }


    // Book Name
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }



    // Author Name
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    // Constructor that takes 4 arguments
    public Book(int bookISBN, double Price, String bookName, String authorName) {
        this.bookISBN = bookISBN;
        this.Price = Price;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Default constructor
    public Book()
    {

    }
}

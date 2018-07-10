package com.example.aslanmr.aslanmirsakiyev_comp304_assignment4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Date;

public class DBHelper extends SQLiteOpenHelper {

    private static final String TAG = "DBHelper";
    public static final String DATABASE_NAME="ShoppingDB";

    private static final int DATABASE_VERSION = 1;
    public static String tableName;
    private static String tableCreatorString;


    public DBHelper(Context context) {
        super(context, DATABASE_NAME,null,  DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tableCreatorString);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+tableName);
        onCreate(db);
    }


    public void dbInit(String tableName, String tableCreatorString)
    {
        this.tableName=tableName;
        this.tableCreatorString=tableCreatorString;
    }
    public boolean addRow(ContentValues values)throws Exception{
        SQLiteDatabase db=this.getWritableDatabase();
        long nr=db.insert(tableName,null,values);
        db.close();
        return nr>-1;
    }
    public Customer getCustomerById(Integer id, String fieldName)throws Exception{
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from "+tableName+" where "+fieldName+"='"+id+"'",null);
        Customer customer=new Customer();
        if (cursor.moveToFirst()){
            cursor.moveToFirst();
            customer.setId(cursor.getInt(0));
            customer.setUsername(cursor.getString(1));
            customer.setPassword(cursor.getString(2));
            cursor.close();
        }else {customer=null;}
        db.close();
        return customer;
    }
}

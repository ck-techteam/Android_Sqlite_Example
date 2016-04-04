package com.codekhadi.sqlite_example;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;

/**
 * Created by admin on 31-03-2016.
 */
public class Databasehandler extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "demo";
    private static String DATABASE_VERSION = "1";
    private static String TABLE_Name = "demo_name";


    private static String USER_NAME = "USER_NAME";


    public Databasehandler(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_Name +
                "(" + USER_NAME + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void insertName(String name) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USER_NAME, name);
        db.insert(TABLE_Name, null, values);
    }

    public ArrayList<String> getAllNames() {
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<String> mylist = new ArrayList<>();
        Cursor cursor = db.query(TABLE_Name, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            mylist.add(cursor.getString(0));
        }
        return mylist;
    }
}

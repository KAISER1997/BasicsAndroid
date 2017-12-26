package com.example.harlequin.krypton;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by harlequin on 23/12/17.
 */
//DATABASE

public class Dbheper extends SQLiteOpenHelper {
    static final String DATABASE_NAME="waitlist.db";
    static final int DATABASE_VERSION=1;
    public Dbheper (Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);


    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQR_CRE_TABL="CREATE TABLE "+ contract.TABLE_NAME +" ("+contract._ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+contract.AUTHOR+" TEXT ,"+contract.BOOK_NAME+" TEXT"+" );";
        sqLiteDatabase.execSQL(SQR_CRE_TABL);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
   onCreate(sqLiteDatabase);
    }
}

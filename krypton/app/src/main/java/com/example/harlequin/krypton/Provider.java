package com.example.harlequin.krypton;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by harlequin on 26/12/17.
 */
//CONTENT PROVIDER
public class Provider extends ContentProvider {
    public static final int TASK=100;
    public static final int TASK_ID=101;
    public static final UriMatcher SuMatcher=buildUriMatcher();

    public static UriMatcher buildUriMatcher()
    {
       UriMatcher urop=new UriMatcher(UriMatcher.NO_MATCH);
        urop.addURI(contract.AUTHORITY,contract.PATH_TASKS,TASK);
        urop.addURI(contract.AUTHORITY,contract.PATH_TASKS+"/#",TASK_ID);
        return urop;


    }
















    Dbheper task1;



    @Override
    public boolean onCreate() {
        task1=new Dbheper(getContext());
        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {

        final SQLiteDatabase dbz=task1.getWritableDatabase();
        int match=SuMatcher.match(uri);
        Uri returnUri=null;
        switch(match)
        {
            case TASK:
                long id=dbz.insert(contract.TABLE_NAME,null,contentValues);
                returnUri= ContentUris.withAppendedId(contract.CONTENT_URI,id);


        }
        getContext().getContentResolver().notifyChange(uri,null);
        return returnUri;





    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}

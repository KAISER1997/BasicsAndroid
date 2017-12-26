package com.example.harlequin.krypton;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by harlequin on 23/12/17.
 */

public class contract implements BaseColumns{
   public static   int e=0;
    public static final String TABLE_NAME="waitlist";
    public static final String BOOK_NAME="bname";
    public static final String AUTHOR="author";
    public static final String AUTHORITY="com.example.harlequin.krypton";
    public static final Uri BASE_URI=Uri.parse("content://"+AUTHORITY);
    public static final String PATH_TASKS="waitlist";
    public static final Uri CONTENT_URI=BASE_URI.buildUpon().appendPath(PATH_TASKS).build();









}

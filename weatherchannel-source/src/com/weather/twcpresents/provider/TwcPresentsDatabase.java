// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.twcpresents.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TwcPresentsDatabase extends SQLiteOpenHelper
{
    static interface Tables
    {

        public static final String TWC_PRESENTS_ITEMS = "twc_presents_items";
    }


    private static final String DATABASE_NAME = "twcpresents.db";
    private static final int DATABASE_VERSION = 1;
    private Context context;

    public TwcPresentsDatabase(Context context1)
    {
        super(context1, "twcpresents.db", null, 1);
        context = context1;
    }

    private void createTable(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append(" (").append("_id").append(" INTEGER PRIMARY KEY AUTOINCREMENT,").append("featTitle").append(" TEXT NOT NULL,").append("featTime").append(" TEXT NOT NULL,").append("featDescript").append(" TEXT NOT NULL,").append("featImage").append(" TEXT NOT NULL,").append("url").append(" TEXT NOT NULL,").append("updated").append(" INTEGER NOT NULL)").toString());
    }

    public static void deleteDatabase(Context context1)
    {
        context1.deleteDatabase("twcpresents.db");
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        createTable(sqlitedatabase, "twc_presents_items");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        deleteDatabase(context);
    }
}

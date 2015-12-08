// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NewsDatabase extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "articles.db";
    private static final int DATABASE_VERSION = 4;
    static final String TOP_STORIES = "top_stories";

    public NewsDatabase(Context context)
    {
        super(context, "articles.db", null, 4);
    }

    private void createTable(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append(" (").append("_id").append(" INTEGER PRIMARY KEY AUTOINCREMENT,").append("article_id").append(" TEXT NOT NULL,").append("article_url").append(" TEXT NOT NULL,").append("article_title").append(" TEXT NOT NULL,").append("article_publishdate").append(" TEXT NOT NULL,").append("article_image_small_url").append(" TEXT NOT NULL,").append("article_json").append(" TEXT, ").append("updated").append(" INTEGER NOT NULL, ").append("UNIQUE (").append("article_id").append(") ON CONFLICT REPLACE)").toString());
    }

    public static void deleteDatabase(Context context)
    {
        context.deleteDatabase("articles.db");
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        createTable(sqlitedatabase, "top_stories");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("drop table if exists top_stories");
        onCreate(sqlitedatabase);
    }
}

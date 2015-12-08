// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.kochava.android.util.Logging;

// Referenced classes of package com.kochava.android.tracker:
//            DbAdapter

private static class  extends SQLiteOpenHelper
{

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL,created_at INTEGER NOT NULL);");
        Logging.Log("DATABASE_CREATE_2 : CREATE TABLE keys (id STRING NOT NULL PRIMARY KEY, data STRING NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE keys (id STRING NOT NULL PRIMARY KEY, data STRING NOT NULL);");
        Logging.Log("DATABASE_CREATE_2 : Done");
        sqlitedatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logging.Log((new StringBuilder()).append("Upgrading database from version ").append(i).append(" to ").append(j).toString());
        sqlitedatabase.execSQL("DROP TABLE events");
        sqlitedatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL,created_at INTEGER NOT NULL);");
        sqlitedatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);");
    }

    (Context context)
    {
        super(context, "KochavaFeatureTracker", null, 2);
    }
}

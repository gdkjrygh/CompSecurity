// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.f;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class d extends SQLiteOpenHelper
{

    public d(Context context)
    {
        super(context, "usage.db", null, 1);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS usage_monitor (pkg_name TEXT PRIMARY KEY, usage_time LONG, open_count INTEGER DEFAULT '0', last_modified LONG, b_1 TEXT, b_2 TEXT, b_3 TEXT);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }
}

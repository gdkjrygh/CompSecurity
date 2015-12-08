// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.suggest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class b extends SQLiteOpenHelper
{

    public b(Context context)
    {
        super(context, "history.db", null, 512);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE suggestions (_id INTEGER PRIMARY KEY,display1 TEXT UNIQUE ON CONFLICT REPLACE");
        stringbuilder.append(",display2 TEXT");
        stringbuilder.append(",query TEXT,date LONG);");
        sqlitedatabase.execSQL(stringbuilder.toString());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        throw new UnsupportedOperationException();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.walmartlabs.anivia:
//            AniviaContentProvider, AniviaLog

private class this._cls0 extends SQLiteOpenHelper
{

    private static final String DBNAME = "aniviadb";
    public static final String EVENTS_TABLE = "events";
    private static final String SQL_CREATE_EVENTS = "CREATE TABLE events ( _ID INTEGER PRIMARY KEY AUTOINCREMENT,  EVENT TEXT )";
    private static final int VERSION = 1;
    final AniviaContentProvider this$0;

    public SQLiteDatabase getReadableDatabase()
    {
        SQLiteDatabase sqlitedatabase = super.getReadableDatabase();
        return sqlitedatabase;
        Object obj;
        obj;
        AniviaLog.e(AniviaContentProvider.access$000(), "failed to get readable db", ((Throwable) (obj)));
_L2:
        return null;
        obj;
        AniviaLog.e(AniviaContentProvider.access$000(), "failed to get readable db", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public SQLiteDatabase getWritableDatabase()
    {
        SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
        return sqlitedatabase;
        Object obj;
        obj;
        AniviaLog.e(AniviaContentProvider.access$000(), "failed to get writable db", ((Throwable) (obj)));
_L2:
        return null;
        obj;
        AniviaLog.e(AniviaContentProvider.access$000(), "failed to get writable db", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE events ( _ID INTEGER PRIMARY KEY AUTOINCREMENT,  EVENT TEXT )");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    public A(Context context)
    {
        this$0 = AniviaContentProvider.this;
        super(context, "aniviadb", null, 1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.google.analytics.tracking.android:
//            PersistentAnalyticsStore, Log, FutureApis

class this._cls0 extends SQLiteOpenHelper
{

    private boolean badDatabase;
    final PersistentAnalyticsStore this$0;

    private boolean tablePresent(String s, SQLiteDatabase sqlitedatabase)
    {
        SQLiteDatabase sqlitedatabase1;
        SQLiteDatabase sqlitedatabase2;
        sqlitedatabase2 = null;
        sqlitedatabase1 = null;
        sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
            "name"
        }, "name=?", new String[] {
            s
        }, null, null, null);
        sqlitedatabase1 = sqlitedatabase;
        sqlitedatabase2 = sqlitedatabase;
        boolean flag = sqlitedatabase.moveToFirst();
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return flag;
        sqlitedatabase;
        sqlitedatabase2 = sqlitedatabase1;
        Log.w((new StringBuilder()).append("error querying for table ").append(s).toString());
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        return false;
        s;
        if (sqlitedatabase2 != null)
        {
            sqlitedatabase2.close();
        }
        throw s;
    }

    public SQLiteDatabase getWritableDatabase()
    {
        if (badDatabase)
        {
            throw new SQLiteException("Database creation failed");
        } else
        {
            return super.getWritableDatabase();
        }
    }

    boolean isBadDatabase()
    {
        return badDatabase;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        FutureApis.setOwnerOnlyReadWrite(sqlitedatabase.getPath());
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        try
        {
            if (!tablePresent("hits2", sqlitedatabase))
            {
                sqlitedatabase.execSQL(PersistentAnalyticsStore.access$000());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            Log.w("Error on database open");
        }
        badDatabase = true;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    (Context context, String s)
    {
        this$0 = PersistentAnalyticsStore.this;
        super(context, s, null, 1);
    }
}

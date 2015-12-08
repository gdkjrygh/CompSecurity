// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

// Referenced classes of package com.google.android.apps.analytics:
//            PersistentEventStore

static class databaseVersion extends SQLiteOpenHelper
{

    private final int databaseVersion;

    private void createECommerceTables(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS transaction_events;");
        sqlitedatabase.execSQL(PersistentEventStore.access$400());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS item_events;");
        sqlitedatabase.execSQL(PersistentEventStore.access$500());
    }

    void createCustomVariableTables(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_variables;");
        sqlitedatabase.execSQL(PersistentEventStore.access$200());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_var_cache;");
        sqlitedatabase.execSQL(PersistentEventStore.access$300());
        for (int i = 1; i <= 5; i++)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("event_id", Integer.valueOf(0));
            contentvalues.put("cv_index", Integer.valueOf(i));
            contentvalues.put("cv_name", "");
            contentvalues.put("cv_scope", Integer.valueOf(3));
            contentvalues.put("cv_value", "");
            sqlitedatabase.insert("custom_var_cache", "event_id", contentvalues);
        }

    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS events;");
        sqlitedatabase.execSQL(PersistentEventStore.access$000());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS session;");
        sqlitedatabase.execSQL(PersistentEventStore.access$100());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS install_referrer;");
        sqlitedatabase.execSQL("CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);");
        if (databaseVersion > 1)
        {
            createCustomVariableTables(sqlitedatabase);
        }
        if (databaseVersion > 2)
        {
            createECommerceTables(sqlitedatabase);
        }
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("Downgrading database version from ").append(i).append(" to ").append(j).append(" not recommended.").toString());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i < 2 && j > 1)
        {
            createCustomVariableTables(sqlitedatabase);
        }
        if (i < 3 && j > 2)
        {
            createECommerceTables(sqlitedatabase);
        }
    }

    public (Context context)
    {
        this(context, "google_analytics.db", 3);
    }

    public <init>(Context context, String s)
    {
        this(context, s, 3);
    }

    <init>(Context context, String s, int i)
    {
        super(context, s, null, i);
        databaseVersion = i;
    }
}

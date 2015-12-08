// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.analytics:
//            PersistentHitStore, Referrer

class <init> extends SQLiteOpenHelper
{

    private final int databaseVersion;
    private final PersistentHitStore store;

    private void createECommerceTables(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS transaction_events;");
        sqlitedatabase.execSQL(PersistentHitStore.access$400());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS item_events;");
        sqlitedatabase.execSQL(PersistentHitStore.access$500());
    }

    private void createHitTable(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS hits;");
        sqlitedatabase.execSQL(PersistentHitStore.access$600());
    }

    private void createReferrerTable(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS referrer;");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
    }

    private void fixReferrerTable(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("referrer", null, null, null, null, null, null);
        String as[] = cursor.getColumnNames();
        int i;
        int j;
        boolean flag;
        i = 0;
        flag = false;
        j = 0;
_L18:
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        if (!as[i].equals("referrer_index")) goto _L4; else goto _L3
_L3:
        int k = 1;
          goto _L5
_L4:
        k = j;
        if (as[i].equals("referrer_visit"))
        {
            flag = true;
            k = j;
        }
          goto _L5
_L19:
        if (!cursor.moveToFirst()) goto _L7; else goto _L6
_L6:
        Object obj;
        long l;
        i = cursor.getColumnIndex("referrer_visit");
        j = cursor.getColumnIndex("referrer_index");
        obj = cursor.getString(cursor.getColumnIndex("referrer"));
        l = cursor.getLong(cursor.getColumnIndex("timestamp_referrer"));
        if (i != -1) goto _L9; else goto _L8
_L8:
        i = 1;
          goto _L10
_L11:
        obj = new Referrer(((String) (obj)), l, i, j);
_L17:
        sqlitedatabase.beginTransaction();
        createReferrerTable(sqlitedatabase);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("referrer", ((Referrer) (obj)).getReferrerString());
        contentvalues.put("timestamp_referrer", Long.valueOf(((Referrer) (obj)).getTimeStamp()));
        contentvalues.put("referrer_visit", Integer.valueOf(((Referrer) (obj)).getVisit()));
        contentvalues.put("referrer_index", Integer.valueOf(((Referrer) (obj)).getIndex()));
        sqlitedatabase.insert("referrer", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
_L20:
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase.inTransaction())
        {
            PersistentHitStore.access$900(sqlitedatabase);
        }
_L13:
        return;
_L9:
        i = cursor.getInt(i);
          goto _L10
_L22:
        j = cursor.getInt(j);
          goto _L11
        obj;
        cursor = null;
_L16:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (cursor != null)
        {
            cursor.close();
        }
        if (!sqlitedatabase.inTransaction()) goto _L13; else goto _L12
_L12:
        PersistentHitStore.access$900(sqlitedatabase);
        return;
        obj;
        cursor = null;
_L15:
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase.inTransaction())
        {
            PersistentHitStore.access$900(sqlitedatabase);
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L15; else goto _L14
_L14:
        obj;
          goto _L16
_L7:
        obj = null;
          goto _L17
_L5:
        i++;
        j = k;
          goto _L18
_L2:
        if (j != 0 && flag) goto _L20; else goto _L19
_L10:
        if (j != -1) goto _L22; else goto _L21
_L21:
        j = 1;
          goto _L11
    }

    private void migrateEventsToHits(SQLiteDatabase sqlitedatabase, int i)
    {
        store.loadExistingSession(sqlitedatabase);
        PersistentHitStore.access$702(store, store.getVisitorVarBuffer(sqlitedatabase));
        Event aevent[] = store.peekEvents(1000, sqlitedatabase, i);
        for (i = 0; i < aevent.length; i++)
        {
            PersistentHitStore.access$800(store, aevent[i], sqlitedatabase, false);
        }

        sqlitedatabase.execSQL("DELETE from events;");
        sqlitedatabase.execSQL("DELETE from item_events;");
        sqlitedatabase.execSQL("DELETE from transaction_events;");
        sqlitedatabase.execSQL("DELETE from custom_variables;");
    }

    private void migratePreV4Referrer(SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        Cursor cursor = sqlitedatabase.query("install_referrer", new String[] {
            "referrer"
        }, null, null, null, null, null);
        obj = cursor;
        String s;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_272;
        }
        s = ((Cursor) (obj)).getString(0);
        cursor = sqlitedatabase.query("session", null, null, null, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        long l = cursor.getLong(0);
_L8:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("referrer", s);
        contentvalues.put("timestamp_referrer", Long.valueOf(l));
        contentvalues.put("referrer_visit", Integer.valueOf(1));
        contentvalues.put("referrer_index", Integer.valueOf(1));
        sqlitedatabase.insert("referrer", null, contentvalues);
_L9:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return;
        Object obj1;
        obj1;
        cursor = null;
        sqlitedatabase = ((SQLiteDatabase) (obj));
        obj = obj1;
_L7:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return;
        sqlitedatabase;
        cursor = null;
        obj = null;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        cursor = null;
        continue; /* Loop/switch isn't completed */
        sqlitedatabase;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj = sqlitedatabase;
        sqlitedatabase = ((SQLiteDatabase) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        cursor = null;
        sqlitedatabase = ((SQLiteDatabase) (obj));
        obj = obj1;
          goto _L7
        obj1;
        sqlitedatabase = ((SQLiteDatabase) (obj));
        obj = obj1;
          goto _L7
_L2:
        l = 0L;
          goto _L8
        cursor = null;
          goto _L9
    }

    void createCustomVariableTables(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_variables;");
        sqlitedatabase.execSQL(PersistentHitStore.access$200());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_var_cache;");
        sqlitedatabase.execSQL(PersistentHitStore.access$300());
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
        sqlitedatabase.execSQL(PersistentHitStore.access$000());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS install_referrer;");
        sqlitedatabase.execSQL("CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS session;");
        sqlitedatabase.execSQL(PersistentHitStore.access$100());
        if (databaseVersion > 1)
        {
            createCustomVariableTables(sqlitedatabase);
        }
        if (databaseVersion > 2)
        {
            createECommerceTables(sqlitedatabase);
        }
        if (databaseVersion > 3)
        {
            createHitTable(sqlitedatabase);
            createReferrerTable(sqlitedatabase);
        }
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        HashSet hashset;
        Object obj;
        Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("Downgrading database version from ").append(i).append(" to ").append(j).append(" not recommended.").toString());
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
        sqlitedatabase.execSQL(PersistentHitStore.access$600());
        sqlitedatabase.execSQL(PersistentHitStore.access$300());
        sqlitedatabase.execSQL(PersistentHitStore.access$100());
        hashset = new HashSet();
        obj = sqlitedatabase.query("custom_var_cache", null, null, null, null, null, null, null);
        while (((Cursor) (obj)).moveToNext()) 
        {
            hashset.add(Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_index"))));
        }
        break MISSING_BLOCK_LABEL_271;
        SQLiteException sqliteexception1;
        sqliteexception1;
        Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("Error on downgrade: ").append(sqliteexception1.toString()).toString());
        ((Cursor) (obj)).close();
_L1:
        i = 1;
        while (i <= 5) 
        {
            try
            {
                if (!hashset.contains(Integer.valueOf(i)))
                {
                    obj = new ContentValues();
                    ((ContentValues) (obj)).put("event_id", Integer.valueOf(0));
                    ((ContentValues) (obj)).put("cv_index", Integer.valueOf(i));
                    ((ContentValues) (obj)).put("cv_name", "");
                    ((ContentValues) (obj)).put("cv_scope", Integer.valueOf(3));
                    ((ContentValues) (obj)).put("cv_value", "");
                    sqlitedatabase.insert("custom_var_cache", "event_id", ((ContentValues) (obj)));
                }
            }
            catch (SQLiteException sqliteexception)
            {
                Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("Error inserting custom variable on downgrade: ").append(sqliteexception.toString()).toString());
            }
            i++;
        }
        break MISSING_BLOCK_LABEL_326;
        ((Cursor) (obj)).close();
          goto _L1
        sqlitedatabase;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        if (sqlitedatabase.isReadOnly())
        {
            Log.w("GoogleAnalyticsTracker", "Warning: Need to update database, but it's read only.");
            return;
        } else
        {
            fixReferrerTable(sqlitedatabase);
            return;
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i > j)
        {
            onDowngrade(sqlitedatabase, i, j);
        } else
        {
            if (i < 2 && j > 1)
            {
                createCustomVariableTables(sqlitedatabase);
            }
            if (i < 3 && j > 2)
            {
                createECommerceTables(sqlitedatabase);
            }
            if (i < 4 && j > 3)
            {
                createHitTable(sqlitedatabase);
                createReferrerTable(sqlitedatabase);
                migrateEventsToHits(sqlitedatabase, i);
                migratePreV4Referrer(sqlitedatabase);
                return;
            }
        }
    }

    public I(Context context, PersistentHitStore persistenthitstore)
    {
        this(context, "google_analytics.db", 5, persistenthitstore);
    }

    <init>(Context context, String s, int i, PersistentHitStore persistenthitstore)
    {
        super(context, s, null, i);
        databaseVersion = i;
        store = persistenthitstore;
    }

    public store(Context context, String s, PersistentHitStore persistenthitstore)
    {
        this(context, s, 5, persistenthitstore);
    }
}

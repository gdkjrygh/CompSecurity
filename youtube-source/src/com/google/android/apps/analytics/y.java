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

// Referenced classes of package com.google.android.apps.analytics:
//            x, ab

final class y extends SQLiteOpenHelper
{

    private final int a;
    private final x b;

    y(Context context, String s, int i, x x1)
    {
        super(context, s, null, i);
        a = i;
        b = x1;
    }

    private static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_variables;");
        sqlitedatabase.execSQL(x.g());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_var_cache;");
        sqlitedatabase.execSQL(x.h());
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

        sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_var_visitor_cache;");
        sqlitedatabase.execSQL(x.f());
    }

    private static boolean a(String s, SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
            "name"
        }, "name=?", new String[] {
            s
        }, null, null, null);
        boolean flag = sqlitedatabase.moveToFirst();
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return flag;
        sqlitedatabase;
        sqlitedatabase = null;
_L4:
        Log.w("GoogleAnalyticsTracker", (new StringBuilder("error querying for table ")).append(s).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return false;
        s;
        sqlitedatabase = obj;
_L2:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
        SQLiteException sqliteexception;
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS transaction_events;");
        sqlitedatabase.execSQL(x.i());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS item_events;");
        sqlitedatabase.execSQL(x.j());
    }

    private static void c(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS hits;");
        sqlitedatabase.execSQL(x.k());
    }

    private static void d(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS referrer;");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
    }

    private static void e(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("custom_var_cache", null, "cv_scope= ?", new String[] {
            Integer.toString(1)
        }, null, null, null);
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            int i = cursor.getInt(cursor.getColumnIndex("cv_index"));
            String s = cursor.getString(cursor.getColumnIndex("cv_name"));
            String s1 = cursor.getString(cursor.getColumnIndex("cv_value"));
            if (i > 0 && i <= 50)
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("cv_index", Integer.valueOf(i));
                contentvalues.put("cv_name", s);
                contentvalues.put("cv_value", s1);
                sqlitedatabase.insert("custom_var_visitor_cache", null, contentvalues);
            }
        } while (true);
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS events;");
        sqlitedatabase.execSQL(x.d());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS install_referrer;");
        sqlitedatabase.execSQL("CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS session;");
        sqlitedatabase.execSQL(x.e());
        if (a > 1)
        {
            a(sqlitedatabase);
        }
        if (a > 2)
        {
            b(sqlitedatabase);
        }
        if (a > 3)
        {
            c(sqlitedatabase);
            d(sqlitedatabase);
        }
    }

    public final void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Log.w("GoogleAnalyticsTracker", (new StringBuilder("Downgrading database version from ")).append(i).append(" to ").append(j).append(" not recommended.").toString());
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
        sqlitedatabase.execSQL(x.k());
        sqlitedatabase.execSQL(x.f());
        sqlitedatabase.execSQL(x.e());
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        if (!sqlitedatabase.isReadOnly()) goto _L2; else goto _L1
_L1:
        Log.w("GoogleAnalyticsTracker", "Warning: Need to update database, but it's read only.");
_L14:
        return;
_L2:
        Cursor cursor = sqlitedatabase.query("referrer", null, null, null, null, null, null);
        String as[] = cursor.getColumnNames();
        int i;
        int j;
        boolean flag;
        i = 0;
        flag = false;
        j = 0;
_L21:
        if (i >= as.length) goto _L4; else goto _L3
_L3:
        if (!as[i].equals("referrer_index")) goto _L6; else goto _L5
_L5:
        int k = 1;
          goto _L7
_L6:
        k = j;
        if (as[i].equals("referrer_visit"))
        {
            flag = true;
            k = j;
        }
          goto _L7
_L22:
        if (!cursor.moveToFirst()) goto _L9; else goto _L8
_L8:
        Object obj;
        long l;
        i = cursor.getColumnIndex("referrer_visit");
        j = cursor.getColumnIndex("referrer_index");
        obj = cursor.getString(cursor.getColumnIndex("referrer"));
        l = cursor.getLong(cursor.getColumnIndex("timestamp_referrer"));
        if (i != -1) goto _L11; else goto _L10
_L10:
        i = 1;
          goto _L12
_L15:
        obj = new ab(((String) (obj)), l, i, j);
_L20:
        sqlitedatabase.beginTransaction();
        d(sqlitedatabase);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("referrer", ((ab) (obj)).a());
        contentvalues.put("timestamp_referrer", Long.valueOf(((ab) (obj)).b()));
        contentvalues.put("referrer_visit", Integer.valueOf(((ab) (obj)).c()));
        contentvalues.put("referrer_index", Integer.valueOf(((ab) (obj)).d()));
        sqlitedatabase.insert("referrer", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
_L23:
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase.inTransaction())
        {
            x.c(sqlitedatabase);
        }
_L16:
        if (a(x.f(), sqlitedatabase)) goto _L14; else goto _L13
_L13:
        sqlitedatabase.execSQL(x.f());
        return;
_L11:
        i = cursor.getInt(i);
          goto _L12
_L25:
        j = cursor.getInt(j);
          goto _L15
        obj;
        cursor = null;
_L19:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase.inTransaction())
        {
            x.c(sqlitedatabase);
        }
          goto _L16
        obj;
        cursor = null;
_L18:
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase.inTransaction())
        {
            x.c(sqlitedatabase);
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L18; else goto _L17
_L17:
        obj;
          goto _L19
_L9:
        obj = null;
          goto _L20
_L7:
        i++;
        j = k;
          goto _L21
_L4:
        if (j != 0 && flag) goto _L23; else goto _L22
_L12:
        if (j != -1) goto _L25; else goto _L24
_L24:
        j = 1;
          goto _L15
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i <= j) goto _L2; else goto _L1
_L1:
        onDowngrade(sqlitedatabase, i, j);
_L7:
        return;
_L2:
        if (i < 2 && j > 1)
        {
            a(sqlitedatabase);
        }
        if (i < 3 && j > 2)
        {
            b(sqlitedatabase);
        }
        if (i >= 4 || j <= 3) goto _L4; else goto _L3
_L3:
        Object obj;
        c(sqlitedatabase);
        d(sqlitedatabase);
        b.b(sqlitedatabase);
        x x1 = b;
        obj = b;
        x.a(x1, x.a(sqlitedatabase));
        i ai[] = b.a(1000, sqlitedatabase, i);
        for (int k = 0; k < ai.length; k++)
        {
            x.a(b, ai[k], sqlitedatabase, false);
        }

        sqlitedatabase.execSQL("DELETE from events;");
        sqlitedatabase.execSQL("DELETE from item_events;");
        sqlitedatabase.execSQL("DELETE from transaction_events;");
        sqlitedatabase.execSQL("DELETE from custom_variables;");
        obj = null;
        Cursor cursor = sqlitedatabase.query("install_referrer", new String[] {
            "referrer"
        }, null, null, null, null, null);
        obj = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_482;
        }
        obj = cursor;
        String s = cursor.getString(0);
        obj = cursor;
        Cursor cursor1 = sqlitedatabase.query("session", null, null, null, null, null, null);
        obj = cursor1;
        if (!((Cursor) (obj)).moveToFirst()) goto _L6; else goto _L5
_L5:
        long l = ((Cursor) (obj)).getLong(0);
_L11:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("referrer", s);
        contentvalues.put("timestamp_referrer", Long.valueOf(l));
        contentvalues.put("referrer_visit", Integer.valueOf(1));
        contentvalues.put("referrer_index", Integer.valueOf(1));
        sqlitedatabase.insert("referrer", null, contentvalues);
_L12:
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L4:
        if (i < 6 && j > 5)
        {
            sqlitedatabase.execSQL(x.f());
            e(sqlitedatabase);
            return;
        }
          goto _L7
        SQLiteException sqliteexception;
        sqliteexception;
        obj = null;
        cursor = null;
_L10:
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
          goto _L4
        sqlitedatabase;
        Object obj1 = null;
        cursor = ((Cursor) (obj));
        obj = obj1;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        continue; /* Loop/switch isn't completed */
        sqlitedatabase;
        if (true) goto _L9; else goto _L8
_L8:
        obj1;
        obj = null;
          goto _L10
        obj1;
          goto _L10
_L6:
        l = 0L;
          goto _L11
        obj = null;
          goto _L12
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.kochava.android.util.Base64Coder;
import com.kochava.android.util.Logging;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DbAdapter
{
    private static class DatabaseHelper extends SQLiteOpenHelper
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

        DatabaseHelper(Context context)
        {
            super(context, "KochavaFeatureTracker", null, 2);
        }
    }


    private static final String DATABASE_CREATE = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL,created_at INTEGER NOT NULL);";
    private static final String DATABASE_CREATE_2 = "CREATE TABLE keys (id STRING NOT NULL PRIMARY KEY, data STRING NOT NULL);";
    private static final String DATABASE_INDEX = "CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);";
    private static final String DATABASE_NAME = "KochavaFeatureTracker";
    private static final String DATABASE_TABLE = "events";
    private static final String DATABASE_TABLE_2 = "keys";
    private static final int DATABASE_VERSION = 2;
    public static final String KEY_CREATED_AT = "created_at";
    public static final String KEY_DATA = "data";
    private static final String LOGTAG = "KochavaDbAdapter";
    private DatabaseHelper kDb;

    public DbAdapter(Context context)
    {
        kDb = new DatabaseHelper(context);
    }

    public int addEvent(JSONObject jsonobject, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Logging.Log("addEvent");
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        Object obj;
        Object obj1;
        int j;
        obj1 = null;
        obj = null;
        j = -1;
        jsonobject2 = obj;
        jsonobject1 = obj1;
        SQLiteDatabase sqlitedatabase = kDb.getWritableDatabase();
        jsonobject2 = obj;
        jsonobject1 = obj1;
        ContentValues contentvalues = new ContentValues();
        jsonobject2 = obj;
        jsonobject1 = obj1;
        contentvalues.put("data", jsonobject.toString());
        if (!flag) goto _L2; else goto _L1
_L1:
        jsonobject2 = obj;
        jsonobject1 = obj1;
        contentvalues.put("created_at", Integer.valueOf(0));
_L3:
        jsonobject2 = obj;
        jsonobject1 = obj1;
        sqlitedatabase.insert("events", null, contentvalues);
        jsonobject2 = obj;
        jsonobject1 = obj1;
        jsonobject = sqlitedatabase.rawQuery("SELECT * FROM events", null);
        jsonobject2 = jsonobject;
        jsonobject1 = jsonobject;
        int i = jsonobject.getCount();
        j = i;
        kDb.close();
        i = j;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        jsonobject.close();
        i = j;
_L5:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        jsonobject2 = obj;
        jsonobject1 = obj1;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
          goto _L3
        jsonobject;
        jsonobject1 = jsonobject2;
        Logging.LogError((new StringBuilder()).append("addEvent ").append(jsonobject).toString());
        kDb.close();
        i = j;
        if (jsonobject2 == null) goto _L5; else goto _L4
_L4:
        jsonobject2.close();
        i = j;
          goto _L5
        jsonobject;
        this;
        JVM INSTR monitorexit ;
        throw jsonobject;
        jsonobject;
        kDb.close();
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        jsonobject1.close();
        throw jsonobject;
          goto _L3
    }

    public void cleanupEvents(long l)
    {
        this;
        JVM INSTR monitorenter ;
        Logging.Log("cleanupEvent");
        kDb.getWritableDatabase().delete("events", (new StringBuilder()).append("created_at <= ").append(l).toString(), null);
        kDb.close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Logging.LogError((new StringBuilder()).append("cleanupEvents").append(obj).toString());
        kDb.close();
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        kDb.close();
        throw obj;
    }

    public String generateDataString()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj2;
        Object obj3;
        Cursor cursor;
        Object obj4;
        Object obj5;
        Object obj6;
        obj4 = null;
        cursor = null;
        obj6 = null;
        obj5 = null;
        obj2 = null;
        obj3 = null;
        obj = obj2;
        Cursor cursor1 = kDb.getReadableDatabase().rawQuery("SELECT * FROM events ORDER BY created_at ASC", null);
        cursor = cursor1;
        obj = obj2;
        obj4 = cursor1;
        JSONArray jsonarray = new JSONArray();
_L7:
        obj2 = obj3;
        cursor = cursor1;
        obj = obj3;
        obj4 = cursor1;
        if (!cursor1.moveToNext()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        obj = obj3;
        obj4 = cursor1;
        if (!cursor1.getString(cursor1.getColumnIndex("created_at")).equals("0"))
        {
            break MISSING_BLOCK_LABEL_445;
        }
        cursor = cursor1;
        obj = obj3;
        obj4 = cursor1;
        obj2 = cursor1.getString(cursor1.getColumnIndex("created_at"));
        cursor = cursor1;
        obj = obj2;
        obj4 = cursor1;
        jsonarray.put(new JSONObject(cursor1.getString(cursor1.getColumnIndex("data"))));
_L3:
        cursor = cursor1;
        obj = obj2;
        obj4 = cursor1;
        Logging.Log("generateDataString called, Grabbing only initial from database");
_L2:
        obj3 = obj5;
        cursor = cursor1;
        obj = obj2;
        obj4 = cursor1;
        if (jsonarray.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        cursor = cursor1;
        obj = obj2;
        obj4 = cursor1;
        Logging.Log((new StringBuilder()).append("[JSON DATA VER 4] : ").append(jsonarray.toString()).toString());
        cursor = cursor1;
        obj = obj2;
        obj4 = cursor1;
        obj3 = Base64Coder.encodeString(jsonarray.toString());
        kDb.close();
        obj4 = obj3;
        obj5 = obj2;
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        cursor1.close();
        obj5 = obj2;
        obj4 = obj3;
_L5:
        if (obj5 == null || obj4 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (new StringBuilder()).append(((String) (obj5))).append("=").append(((String) (obj4))).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        obj3;
        cursor = cursor1;
        obj = obj2;
        obj4 = cursor1;
        Logging.LogError((new StringBuilder()).append("generateDataString called, an error occured when creating initial json object: ").append(((JSONException) (obj3)).toString()).toString());
          goto _L3
        SQLiteException sqliteexception;
        sqliteexception;
        obj4 = cursor;
        Logging.LogError((new StringBuilder()).append("generateDataString").append(sqliteexception).toString());
        kDb.close();
        obj4 = obj6;
        obj5 = obj;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        obj4 = obj6;
        obj5 = obj;
          goto _L5
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        cursor = cursor1;
        obj = obj3;
        sqliteexception = ((SQLiteException) (obj3));
        obj4 = cursor1;
        if (!cursor1.isLast())
        {
            break MISSING_BLOCK_LABEL_494;
        }
        cursor = cursor1;
        obj = obj3;
        obj4 = cursor1;
        sqliteexception = cursor1.getString(cursor1.getColumnIndex("created_at"));
        cursor = cursor1;
        obj = sqliteexception;
        obj4 = cursor1;
        jsonarray.put(new JSONObject(cursor1.getString(cursor1.getColumnIndex("data"))));
        obj3 = sqliteexception;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        obj3 = sqliteexception;
        if (true) goto _L7; else goto _L6
_L6:
        break MISSING_BLOCK_LABEL_567;
        obj1;
        kDb.close();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_564;
        }
        ((Cursor) (obj4)).close();
        throw obj1;
        return null;
    }

    public String getApplicationData(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (s.trim().length() != 0)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        return "";
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        s = kDb.getReadableDatabase().rawQuery((new StringBuilder()).append("SELECT * FROM keys WHERE id='").append(s).append("'").toString(), null);
        s1 = s;
        s2 = s;
        if (!s.moveToNext())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        s1 = s;
        s2 = s;
        String s3 = s.getString(s.getColumnIndex("data"));
        kDb.close();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        s.close();
        this;
        JVM INSTR monitorexit ;
        return s3;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        kDb.close();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        s.close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return null;
        s;
        s2 = s1;
        Logging.LogError((new StringBuilder()).append("generateDataString").append(s).toString());
        kDb.close();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1.close();
          goto _L2
        s;
        kDb.close();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        s2.close();
        throw s;
    }

    public void insertApplicationData(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (s.trim().length() != 0)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        SQLiteDatabase sqlitedatabase = kDb.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", s);
        contentvalues.put("data", s1);
        sqlitedatabase.insert("keys", null, contentvalues);
        kDb.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        throw new NullPointerException();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        Logging.LogError((new StringBuilder()).append("addEvent").append(s).toString());
        kDb.close();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NullPointerException();
        s;
        kDb.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        throw new NullPointerException();
        throw s;
    }

    public void updateApplicationData(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (s.trim().length() != 0)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        SQLiteDatabase sqlitedatabase = kDb.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("data", s1);
        sqlitedatabase.update("keys", contentvalues, (new StringBuilder()).append("id='").append(s).append("'").toString(), null);
        kDb.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        throw new NullPointerException();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        Logging.LogError((new StringBuilder()).append("addEvent").append(s).toString());
        kDb.close();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NullPointerException();
        s;
        kDb.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        throw new NullPointerException();
        throw s;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.DataManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class EventDataManager extends DataManager
{

    private static final String DATABASE_NAME = "ua_analytics.db";
    private static final int DATABASE_VERSION = 1;

    public EventDataManager()
    {
        super(UAirship.getApplicationContext(), "ua_analytics.db", 1);
    }

    private static String repeat(String s, int i, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 0; j < i; j++)
        {
            stringbuilder.append(s);
            if (j + 1 != i)
            {
                stringbuilder.append(s1);
            }
        }

        return stringbuilder.toString();
    }

    protected void bindValuesToSqlLiteStatment(SQLiteStatement sqlitestatement, ContentValues contentvalues)
    {
        bind(sqlitestatement, 1, contentvalues.getAsString("type"));
        bind(sqlitestatement, 2, contentvalues.getAsString("event_id"));
        bind(sqlitestatement, 3, contentvalues.getAsString("data"));
        bind(sqlitestatement, 4, contentvalues.getAsInteger("time").intValue());
        bind(sqlitestatement, 5, contentvalues.getAsString("session_id"));
        bind(sqlitestatement, 6, contentvalues.getAsInteger("event_size").intValue());
    }

    public boolean deleteEvent(String s)
    {
        return delete("events", "event_id = ?", new String[] {
            s
        }) > 0;
    }

    public boolean deleteEventType(String s)
    {
        return delete("events", "type = ?", new String[] {
            s
        }) > 0;
    }

    public boolean deleteEvents(Set set)
    {
        if (set == null || set.size() == 0)
        {
            Logger.verbose("Nothing to delete. Returning.");
            return false;
        }
        int i = set.size();
        String s = repeat("?", i, ", ");
        return delete("events", (new StringBuilder()).append("event_id IN ( ").append(s).append(" )").toString(), (String[])set.toArray(new String[i])) > 0;
    }

    public boolean deleteSession(String s)
    {
        int i = delete("events", "session_id = ?", new String[] {
            s
        });
        if (i > 0)
        {
            Logger.info((new StringBuilder()).append("Deleted ").append(i).append(" rows with session id ").append(s).toString());
            return true;
        } else
        {
            return false;
        }
    }

    public int getDatabaseSize()
    {
        Integer integer = null;
        Cursor cursor = query("events", new String[] {
            "SUM(event_size) as _size"
        }, null, null, null, null);
        if (cursor == null)
        {
            Logger.error("Unable to query database");
            return -1;
        }
        if (cursor.moveToFirst())
        {
            integer = Integer.valueOf(cursor.getInt(0));
            cursor.close();
        }
        int i;
        if (integer == null)
        {
            i = -1;
        } else
        {
            i = integer.intValue();
        }
        return i;
    }

    public int getEventCount()
    {
        Integer integer = null;
        Cursor cursor = query("events", new String[] {
            "COUNT(*) as _cnt"
        }, null, null, null, null);
        if (cursor == null)
        {
            Logger.error("Unable to query database");
            return -1;
        }
        if (cursor.moveToFirst())
        {
            integer = Integer.valueOf(cursor.getInt(0));
        }
        cursor.close();
        int i;
        if (integer == null)
        {
            i = -1;
        } else
        {
            i = integer.intValue();
        }
        return i;
    }

    public Map getEvents(int i)
    {
        HashMap hashmap = new HashMap(i);
        Object obj = (new StringBuilder()).append("0, ").append(i).toString();
        obj = query("events", new String[] {
            "event_id", "data"
        }, null, null, "_id ASC", ((String) (obj)));
        if (obj == null)
        {
            return hashmap;
        }
        ((Cursor) (obj)).moveToFirst();
        for (; !((Cursor) (obj)).isAfterLast(); ((Cursor) (obj)).moveToNext())
        {
            hashmap.put(((Cursor) (obj)).getString(0), ((Cursor) (obj)).getString(1));
        }

        ((Cursor) (obj)).close();
        return hashmap;
    }

    protected SQLiteStatement getInsertStatement(String s, SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.compileStatement(buildInsertStatement(s, new String[] {
            "type", "event_id", "data", "time", "session_id", "event_size"
        }));
    }

    public String getOldestSessionId()
    {
        Cursor cursor = query("events", new String[] {
            "session_id"
        }, null, null, "_id ASC", "0, 1");
        if (cursor == null)
        {
            Logger.error("Unable to query database");
            return null;
        }
        String s = null;
        if (cursor.moveToFirst())
        {
            s = cursor.getString(0);
        }
        cursor.close();
        return s;
    }

    public long insertEvent(String s, String s1, String s2, String s3, String s4)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("type", s);
        contentvalues.put("event_id", s2);
        contentvalues.put("data", s1);
        contentvalues.put("time", s4);
        contentvalues.put("session_id", s3);
        contentvalues.put("event_size", Integer.valueOf(s1.length()));
        return insert("events", contentvalues);
    }

    protected void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS events (_id INTEGER PRIMARY KEY AUTOINCREMENT,type TEXT,event_id TEXT,time INTEGER,data TEXT,session_id TEXT,event_size INTEGER);");
    }

    protected void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sqlitedatabase);
    }

    protected void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logger.info((new StringBuilder()).append("Upgrading analytics database from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sqlitedatabase);
    }

    // Unreferenced inner class com/urbanairship/analytics/EventDataManager$Events
    /* block-local class not found */
    class Events {}

}

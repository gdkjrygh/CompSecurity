// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPConfig

class MPDbAdapter
{
    private static class MPDatabaseHelper extends SQLiteOpenHelper
    {

        private final MPConfig mConfig;
        private final File mDatabaseFile;

        public boolean belowMemThreshold()
        {
            return !mDatabaseFile.exists() || Math.max(mDatabaseFile.getUsableSpace(), mConfig.getMinimumDatabaseLimit()) >= mDatabaseFile.length();
        }

        public void deleteDatabase()
        {
            close();
            mDatabaseFile.delete();
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
            }
            sqlitedatabase.execSQL(MPDbAdapter.CREATE_EVENTS_TABLE);
            sqlitedatabase.execSQL(MPDbAdapter.CREATE_PEOPLE_TABLE);
            sqlitedatabase.execSQL(MPDbAdapter.EVENTS_TIME_INDEX);
            sqlitedatabase.execSQL(MPDbAdapter.PEOPLE_TIME_INDEX);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
            }
            sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(Table.EVENTS.getName()).toString());
            sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(Table.PEOPLE.getName()).toString());
            sqlitedatabase.execSQL(MPDbAdapter.CREATE_EVENTS_TABLE);
            sqlitedatabase.execSQL(MPDbAdapter.CREATE_PEOPLE_TABLE);
            sqlitedatabase.execSQL(MPDbAdapter.EVENTS_TIME_INDEX);
            sqlitedatabase.execSQL(MPDbAdapter.PEOPLE_TIME_INDEX);
        }

        MPDatabaseHelper(Context context, String s)
        {
            super(context, s, null, 4);
            mDatabaseFile = context.getDatabasePath(s);
            mConfig = MPConfig.getInstance(context);
        }
    }

    public static final class Table extends Enum
    {

        private static final Table ENUM$VALUES[];
        public static final Table EVENTS;
        public static final Table PEOPLE;
        private final String mTableName;

        public static Table valueOf(String s)
        {
            return (Table)Enum.valueOf(com/mixpanel/android/mpmetrics/MPDbAdapter$Table, s);
        }

        public static Table[] values()
        {
            Table atable[] = ENUM$VALUES;
            int i = atable.length;
            Table atable1[] = new Table[i];
            System.arraycopy(atable, 0, atable1, 0, i);
            return atable1;
        }

        public String getName()
        {
            return mTableName;
        }

        static 
        {
            EVENTS = new Table("EVENTS", 0, "events");
            PEOPLE = new Table("PEOPLE", 1, "people");
            ENUM$VALUES = (new Table[] {
                EVENTS, PEOPLE
            });
        }

        private Table(String s, int i, String s1)
        {
            super(s, i);
            mTableName = s1;
        }
    }


    private static final String CREATE_EVENTS_TABLE;
    private static final String CREATE_PEOPLE_TABLE;
    private static final String DATABASE_NAME = "mixpanel";
    private static final int DATABASE_VERSION = 4;
    public static final int DB_OUT_OF_MEMORY_ERROR = -2;
    public static final int DB_UNDEFINED_CODE = -3;
    public static final int DB_UPDATE_ERROR = -1;
    private static final String EVENTS_TIME_INDEX;
    public static final String KEY_CREATED_AT = "created_at";
    public static final String KEY_DATA = "data";
    private static final String LOGTAG = "MixpanelAPI.Database";
    private static final String PEOPLE_TIME_INDEX;
    private final MPDatabaseHelper mDb;

    public MPDbAdapter(Context context)
    {
        this(context, "mixpanel");
    }

    public MPDbAdapter(Context context, String s)
    {
        mDb = new MPDatabaseHelper(context, s);
    }

    public int addJSON(JSONObject jsonobject, Table table)
    {
        JSONObject jsonobject1;
        Object obj;
        Object obj1;
        String s;
        if (!belowMemThreshold())
        {
            Log.e("MixpanelAPI.Database", "There is not enough space left on the device to store Mixpanel data, so data was discarded");
            return -2;
        }
        s = table.getName();
        obj1 = null;
        obj = null;
        jsonobject1 = obj;
        table = obj1;
        SQLiteDatabase sqlitedatabase = mDb.getWritableDatabase();
        jsonobject1 = obj;
        table = obj1;
        ContentValues contentvalues = new ContentValues();
        jsonobject1 = obj;
        table = obj1;
        contentvalues.put("data", jsonobject.toString());
        jsonobject1 = obj;
        table = obj1;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        jsonobject1 = obj;
        table = obj1;
        sqlitedatabase.insert(s, null, contentvalues);
        jsonobject1 = obj;
        table = obj1;
        jsonobject = sqlitedatabase.rawQuery((new StringBuilder("SELECT COUNT(*) FROM ")).append(s).toString(), null);
        jsonobject1 = jsonobject;
        table = jsonobject;
        jsonobject.moveToFirst();
        jsonobject1 = jsonobject;
        table = jsonobject;
        int i = jsonobject.getInt(0);
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        mDb.close();
        return i;
        jsonobject;
        table = jsonobject1;
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not add Mixpanel data to table ")).append(s).append(". Re-initializing database.").toString(), jsonobject);
        jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        table = jsonobject1;
        jsonobject1.close();
        jsonobject = null;
        table = jsonobject;
        mDb.deleteDatabase();
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        mDb.close();
        return -1;
        jsonobject;
        if (table != null)
        {
            table.close();
        }
        mDb.close();
        throw jsonobject;
    }

    protected boolean belowMemThreshold()
    {
        return mDb.belowMemThreshold();
    }

    public void cleanupEvents(long l, Table table)
    {
        table = table.getName();
        mDb.getWritableDatabase().delete(table, (new StringBuilder("created_at <= ")).append(l).toString(), null);
        mDb.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not clean timed-out Mixpanel records from ")).append(table).append(". Re-initializing database.").toString(), sqliteexception);
        mDb.deleteDatabase();
        mDb.close();
        return;
        table;
        mDb.close();
        throw table;
    }

    public void cleanupEvents(String s, Table table)
    {
        table = table.getName();
        mDb.getWritableDatabase().delete(table, (new StringBuilder("_id <= ")).append(s).toString(), null);
        mDb.close();
        return;
        s;
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not clean sent Mixpanel records from ")).append(table).append(". Re-initializing database.").toString(), s);
        mDb.deleteDatabase();
        mDb.close();
        return;
        s;
        mDb.close();
        throw s;
    }

    public void deleteDB()
    {
        mDb.deleteDatabase();
    }

    public String[] generateDataString(Table table)
    {
        Object obj;
        String s;
        String s1;
        String s2;
        Object obj4;
        obj4 = null;
        obj = null;
        Object obj3 = null;
        s1 = null;
        s = null;
        s2 = table.getName();
        table = obj3;
        Cursor cursor = mDb.getReadableDatabase().rawQuery((new StringBuilder("SELECT * FROM ")).append(s2).append(" ORDER BY ").append("created_at").append(" ASC LIMIT 50").toString(), null);
        table = cursor;
        obj = cursor;
        JSONArray jsonarray = new JSONArray();
_L6:
        table = cursor;
        obj = cursor;
        if (cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        table = cursor;
        obj = cursor;
        if (jsonarray.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        table = cursor;
        obj = cursor;
        s1 = jsonarray.toString();
        mDb.close();
        obj = s1;
        s2 = s;
        if (cursor != null)
        {
            cursor.close();
            s2 = s;
            obj = s1;
        }
_L4:
        table = obj4;
        if (s2 != null)
        {
            table = obj4;
            if (obj != null)
            {
                table = new String[2];
                table[0] = s2;
                table[1] = obj;
            }
        }
        return table;
_L2:
        table = cursor;
        obj = cursor;
        if (!cursor.isLast())
        {
            break MISSING_BLOCK_LABEL_226;
        }
        table = cursor;
        obj = cursor;
        s = cursor.getString(cursor.getColumnIndex("_id"));
        table = cursor;
        obj = cursor;
        jsonarray.put(new JSONObject(cursor.getString(cursor.getColumnIndex("data"))));
        continue; /* Loop/switch isn't completed */
        table;
        continue; /* Loop/switch isn't completed */
        SQLiteException sqliteexception;
        sqliteexception;
        obj = table;
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not pull records for Mixpanel out of database ")).append(s2).append(". Waiting to send.").toString(), sqliteexception);
        Object obj1 = null;
        Object obj2 = null;
        mDb.close();
        obj = obj2;
        s2 = obj1;
        if (table != null)
        {
            table.close();
            obj = obj2;
            s2 = obj1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        table;
        mDb.close();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw table;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        CREATE_EVENTS_TABLE = (new StringBuilder("CREATE TABLE ")).append(Table.EVENTS.getName()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        CREATE_PEOPLE_TABLE = (new StringBuilder("CREATE TABLE ")).append(Table.PEOPLE.getName()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        EVENTS_TIME_INDEX = (new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ")).append(Table.EVENTS.getName()).append(" (").append("created_at").append(");").toString();
        PEOPLE_TIME_INDEX = (new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ")).append(Table.PEOPLE.getName()).append(" (").append("created_at").append(");").toString();
    }




}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.anivia:
//            AniviaLog

class AniviaContentProvider
{
    private class DatabaseHelper extends SQLiteOpenHelper
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
            AniviaLog.e(AniviaContentProvider.TAG, "failed to get readable db", ((Throwable) (obj)));
_L2:
            return null;
            obj;
            AniviaLog.e(AniviaContentProvider.TAG, "failed to get readable db", ((Throwable) (obj)));
            if (true) goto _L2; else goto _L1
_L1:
        }

        public SQLiteDatabase getWritableDatabase()
        {
            SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
            return sqlitedatabase;
            Object obj;
            obj;
            AniviaLog.e(AniviaContentProvider.TAG, "failed to get writable db", ((Throwable) (obj)));
_L2:
            return null;
            obj;
            AniviaLog.e(AniviaContentProvider.TAG, "failed to get writable db", ((Throwable) (obj)));
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

        public DatabaseHelper(Context context)
        {
            this$0 = AniviaContentProvider.this;
            super(context, "aniviadb", null, 1);
        }
    }

    static class Events
        implements BaseColumns
    {

        static final String EVENT = "event";

        Events()
        {
        }
    }


    private static final String TAG = com/walmartlabs/anivia/AniviaContentProvider.getSimpleName();
    private final Context mContext;
    private final DatabaseHelper mDbHelper;
    private boolean mIsDestroyed;

    public AniviaContentProvider(Context context)
    {
        mContext = context;
        mDbHelper = new DatabaseHelper(mContext);
    }

    public void bulkInsert(ArrayList arraylist)
    {
        this;
        JVM INSTR monitorenter ;
        if (mIsDestroyed) goto _L2; else goto _L1
_L1:
        SQLiteDatabase sqlitedatabase = mDbHelper.getWritableDatabase();
        if (sqlitedatabase == null) goto _L2; else goto _L3
_L3:
        sqlitedatabase.beginTransaction();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); sqlitedatabase.insert("events", null, (ContentValues)arraylist.next())) { }
          goto _L4
        arraylist;
        AniviaLog.e(TAG, "failed to insert values", arraylist);
        sqlitedatabase.endTransaction();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
          goto _L2
        arraylist;
        throw arraylist;
        arraylist;
        sqlitedatabase.endTransaction();
        throw arraylist;
    }

    public int delete(String s, String as[])
    {
        this;
        JVM INSTR monitorenter ;
        if (mIsDestroyed) goto _L2; else goto _L1
_L1:
        SQLiteDatabase sqlitedatabase = mDbHelper.getWritableDatabase();
        if (sqlitedatabase == null) goto _L2; else goto _L3
_L3:
        int i = sqlitedatabase.delete("events", s, as);
_L5:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = -1;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIsDestroyed;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mDbHelper.close();
        mIsDestroyed = true;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        AniviaLog.e(TAG, "failed to close db", ((Throwable) (obj)));
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public long insert(ContentValues contentvalues)
    {
        this;
        JVM INSTR monitorenter ;
        if (mIsDestroyed) goto _L2; else goto _L1
_L1:
        SQLiteDatabase sqlitedatabase = mDbHelper.getWritableDatabase();
        if (sqlitedatabase == null) goto _L2; else goto _L3
_L3:
        long l = sqlitedatabase.insert("events", null, contentvalues);
_L5:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = -1L;
        if (true) goto _L5; else goto _L4
_L4:
        contentvalues;
        throw contentvalues;
    }

    public Cursor query(String as[], String s, String as1[], String s1)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        Cursor cursor = obj;
        SQLiteDatabase sqlitedatabase;
        if (mIsDestroyed)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        sqlitedatabase = mDbHelper.getReadableDatabase();
        cursor = obj;
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        cursor = sqlitedatabase.query("events", as, s, as1, null, null, s1);
        this;
        JVM INSTR monitorexit ;
        return cursor;
        as;
        throw as;
    }


}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import com.urbanairship.Logger;
import java.util.ArrayList;
import java.util.List;

public abstract class DataManager
{

    private static final int MAX_ATTEMPTS = 3;
    private SQLiteOpenHelper openHelper;

    public DataManager(Context context, String s, int i)
    {
        openHelper = new _cls1(context, s, null, i, s);
    }

    private boolean tryExecuteStatement(SQLiteStatement sqlitestatement, ContentValues contentvalues)
    {
        int i = 0;
_L2:
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitestatement.clearBindings();
        bindValuesToSqlLiteStatment(sqlitestatement, contentvalues);
        sqlitestatement.execute();
        return true;
        Exception exception;
        exception;
        Logger.error("Unable to insert into database", exception);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

    protected void bind(SQLiteStatement sqlitestatement, int i, int j)
    {
        sqlitestatement.bindLong(i, j);
    }

    protected void bind(SQLiteStatement sqlitestatement, int i, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            sqlitestatement.bindNull(i);
            return;
        }
        long l;
        if (boolean1.booleanValue())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        sqlitestatement.bindLong(i, l);
    }

    protected void bind(SQLiteStatement sqlitestatement, int i, Boolean boolean1, Boolean boolean2)
    {
        if (boolean1 == null)
        {
            bind(sqlitestatement, i, boolean2);
            return;
        } else
        {
            bind(sqlitestatement, i, boolean1);
            return;
        }
    }

    protected void bind(SQLiteStatement sqlitestatement, int i, String s)
    {
        if (s == null)
        {
            sqlitestatement.bindNull(i);
            return;
        } else
        {
            sqlitestatement.bindString(i, s);
            return;
        }
    }

    protected void bind(SQLiteStatement sqlitestatement, int i, String s, String s1)
    {
        if (s == null)
        {
            bind(sqlitestatement, i, s1);
            return;
        } else
        {
            bind(sqlitestatement, i, s);
            return;
        }
    }

    protected abstract void bindValuesToSqlLiteStatment(SQLiteStatement sqlitestatement, ContentValues contentvalues);

    protected transient String buildInsertStatement(String s, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("INSERT INTO ");
        stringbuilder.append(s);
        stringbuilder.append(" (");
        StringBuilder stringbuilder1 = new StringBuilder(128);
        stringbuilder1.append("VALUES (");
        int i = 0;
        while (i < as.length) 
        {
            stringbuilder.append("'");
            stringbuilder.append(as[i]);
            stringbuilder.append("'");
            stringbuilder1.append("?");
            if (i == as.length - 1)
            {
                s = ") ";
            } else
            {
                s = ", ";
            }
            stringbuilder.append(s);
            if (i == as.length - 1)
            {
                s = ");";
            } else
            {
                s = ", ";
            }
            stringbuilder1.append(s);
            i++;
        }
        stringbuilder.append(stringbuilder1);
        return stringbuilder.toString();
    }

    public List bulkInsert(String s, ContentValues acontentvalues[])
    {
        SQLiteDatabase sqlitedatabase;
        ArrayList arraylist;
        int i;
        sqlitedatabase = getWritableDatabase();
        arraylist = new ArrayList();
        if (sqlitedatabase == null)
        {
            return arraylist;
        }
        sqlitedatabase.beginTransaction();
        s = getInsertStatement(s, sqlitedatabase);
        i = 0;
_L2:
        if (i < acontentvalues.length)
        {
            if (tryExecuteStatement(s, acontentvalues[i]))
            {
                arraylist.add(acontentvalues[i]);
            }
            break MISSING_BLOCK_LABEL_111;
        }
        if (!arraylist.isEmpty())
        {
            sqlitedatabase.setTransactionSuccessful();
        }
        sqlitedatabase.endTransaction();
        return arraylist;
        s;
        Logger.error("Unable to insert into database", s);
        sqlitedatabase.endTransaction();
        return arraylist;
        s;
        sqlitedatabase.endTransaction();
        throw s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void close()
    {
        try
        {
            openHelper.close();
            return;
        }
        catch (Exception exception)
        {
            Logger.error("Failed to close the database.", exception);
        }
    }

    public int delete(String s, String s1, String as[])
    {
        String s2;
        s2 = s1;
        if (s1 == null)
        {
            s2 = "1";
        }
        s1 = getWritableDatabase();
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int i = 0;
_L4:
        if (i >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j = s1.delete(s, s2, as);
        return j;
        Exception exception;
        exception;
        Logger.error("Unable to delete item from a database", exception);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected abstract SQLiteStatement getInsertStatement(String s, SQLiteDatabase sqlitedatabase);

    protected SQLiteDatabase getReadableDatabase()
    {
        int i = 0;
_L2:
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        SQLiteDatabase sqlitedatabase = openHelper.getReadableDatabase();
        return sqlitedatabase;
        SQLiteException sqliteexception;
        sqliteexception;
        SystemClock.sleep(100L);
        Logger.error("Error opening readable database. Retrying...");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    protected SQLiteDatabase getWritableDatabase()
    {
        int i = 0;
_L2:
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        SQLiteDatabase sqlitedatabase = openHelper.getWritableDatabase();
        return sqlitedatabase;
        SQLiteException sqliteexception;
        sqliteexception;
        SystemClock.sleep(100L);
        Logger.error("Error opening writable database. Retrying...");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public long insert(String s, ContentValues contentvalues)
    {
        int i = 0;
_L2:
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        long l = getWritableDatabase().replaceOrThrow(s, null, contentvalues);
        return l;
        Exception exception;
        exception;
        Logger.error("Unable to insert into database", exception);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return -1L;
    }

    protected abstract void onCreate(SQLiteDatabase sqlitedatabase);

    protected void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        throw new SQLiteException("Unable to downgrade database");
    }

    protected void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logger.verbose("onUpgrade not implemented yet.");
    }

    public Cursor query(String s, String as[], String s1, String as1[], String s2)
    {
        return query(s, as, s1, as1, s2, null);
    }

    public Cursor query(String s, String as[], String s1, String as1[], String s2, String s3)
    {
        SQLiteDatabase sqlitedatabase;
        int i;
        sqlitedatabase = getReadableDatabase();
        if (sqlitedatabase == null)
        {
            return null;
        }
        i = 0;
_L2:
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        Cursor cursor = sqlitedatabase.query(s, as, s1, as1, null, null, s2, s3);
        return cursor;
        SQLException sqlexception;
        sqlexception;
        Logger.error("Query Failed", sqlexception);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public int update(String s, ContentValues contentvalues, String s1, String as[])
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int i = 0;
_L4:
        if (i >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j = sqlitedatabase.update(s, contentvalues, s1, as);
        return j;
        SQLException sqlexception;
        sqlexception;
        Logger.error("Update Failed", sqlexception);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    /* member class not found */
    class _cls1 {}

}

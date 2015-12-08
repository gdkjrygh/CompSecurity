// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;
import com.jiubang.commerce.utils.j;
import java.lang.reflect.Method;

public class DataBaseHelper extends SQLiteOpenHelper
{

    public static final String AUTOINCREMENT = "AUTOINCREMENT";
    public static final String DATABASE_NAME = "ad_sdk.db";
    private static final int DB_VERSION_CODE = 6;
    private static final int DB_VERSION_ONE = 1;
    public static final String DEFAULT = "DEFAULT";
    public static final String FOR_EACH_ROW = "FOR EACH ROW";
    public static final String IF_NOT_EXISTS = "IF NOT EXISTS";
    public static final String INNER_JOIN = "INNER JOIN";
    public static final String INSERT_INTO = "INSERT INTO";
    public static final String INSERT_OR_REPLACE_INTO = "INSERT OR REPLACE INTO";
    public static final String NOT_NULL = "NOT NULL";
    public static final String PRIMARY_KEY = "PRIMARY KEY";
    public static final String TYPE_INTEGER = "INTEGER";
    public static final String TYPE_NUMERIC = "NUMERIC";
    public static final String TYPE_TEXT = "TEXT";
    public static final String UNIQUE = "UNIQUE";
    public static final String VALUES = "VALUES";
    private static DataBaseHelper sInstance = null;
    private Context mContext;
    private SQLiteQueryBuilder mSqlQB;
    private boolean mUpdateResult;

    private DataBaseHelper(Context context)
    {
        super(context, "ad_sdk.db", null, 6);
        mSqlQB = null;
        mUpdateResult = true;
        mContext = context;
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("DataBaseHelper(").append(context).append(")").toString());
        }
        try
        {
            mSqlQB = new SQLiteQueryBuilder();
        }
        catch (Exception exception)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("DataBaseHelper(Exception:");
            if (exception != null)
            {
                context = exception.getMessage();
            } else
            {
                context = "";
            }
            j.b("Ad_SDK", stringbuilder.append(context).toString(), exception);
            return;
        }
        context = getWritableDatabase();
_L2:
        if (mUpdateResult)
        {
            break; /* Loop/switch isn't completed */
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        context.close();
        mContext.deleteDatabase("ad_sdk.db");
        getWritableDatabase();
        return;
        context;
        context.printStackTrace();
        context = getReadableDatabase();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void doUpgrade(SQLiteDatabase sqlitedatabase, int i, int k)
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("doUpgrade(").append(i).append(",").append(k).append(")").toString());
        }
        if (i >= 1 && i <= k && k <= 6)
        {
            RuntimeException runtimeexception = null;
            while (i < k) 
            {
                String s = (new StringBuilder()).append("onUpgradeDB").append(i).append("To").append(i + 1).toString();
                try
                {
                    mUpdateResult = ((Boolean)getClass().getMethod(s, new Class[] {
                        android/database/sqlite/SQLiteDatabase
                    }).invoke(this, new Object[] {
                        sqlitedatabase
                    })).booleanValue();
                }
                catch (Throwable throwable)
                {
                    throwable = new RuntimeException(throwable);
                }
                if (!mUpdateResult || runtimeexception != null)
                {
                    if (runtimeexception != null)
                    {
                        throw runtimeexception;
                    } else
                    {
                        throw new RuntimeException((new StringBuilder()).append("update database has exception in ").append(s).toString());
                    }
                }
                i++;
            }
        }
    }

    public static DataBaseHelper getInstance(Context context)
    {
        init(context);
        return sInstance;
    }

    private static void init(Context context)
    {
        com/jiubang/commerce/database/DataBaseHelper;
        JVM INSTR monitorenter ;
        if (sInstance != null) goto _L2; else goto _L1
_L1:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        context = context.getApplicationContext();
_L3:
        sInstance = new DataBaseHelper(context);
_L2:
        com/jiubang/commerce/database/DataBaseHelper;
        JVM INSTR monitorexit ;
        return;
        context;
        com/jiubang/commerce/database/DataBaseHelper;
        JVM INSTR monitorexit ;
        throw context;
        context = null;
          goto _L3
    }

    private boolean isExistTable(SQLiteDatabase sqlitedatabase, String s)
    {
        s = (new StringBuilder()).append("type='table' and name='").append(s).append("'").toString();
        s = sqlitedatabase.query("sqlite_master", null, s, null, null, null, null);
        if (s == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase = s;
        int i = s.getCount();
        if (i <= 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L12:
        if (s != null)
        {
            s.close();
        }
        return flag;
        Exception exception;
        exception;
        s = null;
_L10:
        sqlitedatabase = s;
        StringBuilder stringbuilder = (new StringBuilder()).append("isExistTable(Exception:");
        if (exception == null) goto _L5; else goto _L4
_L4:
        sqlitedatabase = s;
        String s1 = exception.getMessage();
_L7:
        sqlitedatabase = s;
        j.b("Ad_SDK", stringbuilder.append(s1).append(")").toString(), exception);
        if (s != null)
        {
            s.close();
            return false;
        } else
        {
            return false;
        }
_L5:
        s1 = "";
        if (true) goto _L7; else goto _L6
_L6:
        s;
        sqlitedatabase = null;
_L9:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw s;
        s;
        if (true) goto _L9; else goto _L8
_L8:
        exception;
        if (true) goto _L10; else goto _L2
_L2:
        flag = false;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public int delete(String s, String s1, String as[])
    {
        int i;
        try
        {
            i = getWritableDatabase().delete(s, s1, as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            s1 = (new StringBuilder()).append("Exception when delete in ").append(s).append(", ").append(s1).append(",");
            if (as != null)
            {
                s = as.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", s1.append(s).toString());
            return 0;
        }
        return i;
    }

    public long insert(String s, ContentValues contentvalues)
    {
        long l;
        try
        {
            l = getWritableDatabase().insert(s, null, contentvalues);
        }
        catch (Exception exception)
        {
            contentvalues = (new StringBuilder()).append("Exception when insert in ").append(s).append(",");
            if (exception != null)
            {
                s = exception.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", contentvalues.append(s).toString());
            return 0L;
        }
        return l;
    }

    public void insertOrReplace(String s, String s1, String s2)
    {
        SQLiteDatabase sqlitedatabase;
        StringBuffer stringbuffer;
        try
        {
            sqlitedatabase = getWritableDatabase();
            stringbuffer = new StringBuffer();
            stringbuffer.append((new StringBuilder()).append("INSERT OR REPLACE INTO ").append(s).append(" ").toString());
            stringbuffer.append((new StringBuilder()).append("VALUES ").append(s1).append(" ").toString());
        }
        catch (Exception exception)
        {
            s1 = (new StringBuilder()).append("IllegalStateException when insertOrReplace in ").append(s).append(", ").append(s2).append(",");
            if (exception != null)
            {
                s = exception.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", s1.append(s).toString());
            return;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        stringbuffer.append((new StringBuilder()).append("where ").append(s2).append(" ").toString());
        sqlitedatabase.execSQL(stringbuffer.toString());
        return;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        j.a("Ad_SDK", "DatabaseHelper onCreate");
        sqlitedatabase.beginTransaction();
        if (j.a)
        {
            j.a("Ad_SDK", "\u521B\u5EFA\u6570\u636E\u5E93");
            j.a("Ad_SDK", "CREATE TABLE AD_URL:CREATE TABLE IF NOT EXISTS AD_URL (packageName TEXT, redirectUrl TEXT, adUrl TEXT, updateTime NUMERIC)");
        }
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS AD_URL (packageName TEXT, redirectUrl TEXT, adUrl TEXT, updateTime NUMERIC)");
        if (j.a)
        {
            j.a("Ad_SDK", "CREATE TABLE InstalledPkg:CREATE TABLE IF NOT EXISTS InstalledPkg (packageName TEXT NOT NULL UNIQUE DEFAULT(-1), updateTime NUMERIC)");
        }
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS InstalledPkg (packageName TEXT NOT NULL UNIQUE DEFAULT(-1), updateTime NUMERIC)");
        doUpgrade(sqlitedatabase, 1, 6);
        if (j.a)
        {
            j.a("Ad_SDK", "\u521B\u5EFA\u6570\u636E\u5E93\u5B8C\u6BD5");
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Object obj;
        obj;
        j.d("Ad_SDK", (new StringBuilder()).append("DatabaseHelper onCreate Error::->").append(((Exception) (obj)).getMessage()).toString());
        sqlitedatabase.endTransaction();
        return;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int k)
    {
        if (j.a)
        {
            Log.i("Ad_SDK", (new StringBuilder()).append("onDowngrade(oldVersion=").append(i).append(", newVersion=").append(k).append(")").toString());
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int k)
    {
        doUpgrade(sqlitedatabase, i, k);
    }

    public boolean onUpgradeDB1To2(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        if (!isExistTable(sqlitedatabase, "WAIT_ACTIVATION_APP"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS WAIT_ACTIVATION_APP (packageName TEXT, installTime TEXT)");
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Exception exception1;
        exception1;
        StringBuilder stringbuilder = (new StringBuilder()).append("onUpgradeDB1To2(Exception:");
        if (exception1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        String s = exception1.getMessage();
_L1:
        j.b("Ad_SDK", stringbuilder.append(s).append(")").toString(), exception1);
        sqlitedatabase.endTransaction();
        return false;
        s = "";
          goto _L1
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public boolean onUpgradeDB2To3(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        if (!isExistTable(sqlitedatabase, "AdvertFilter"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS AdvertFilter (packageName TEXT, moduleId TEXT, advertPos TEXT, showCount INTEGER, saveTime NUMERIC)");
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Exception exception1;
        exception1;
        StringBuilder stringbuilder = (new StringBuilder()).append("onUpgradeDB2To3(Exception:");
        if (exception1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        String s = exception1.getMessage();
_L1:
        j.b("Ad_SDK", stringbuilder.append(s).append(")").toString(), exception1);
        sqlitedatabase.endTransaction();
        return false;
        s = "";
          goto _L1
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public boolean onUpgradeDB3To4(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        if (!isExistTable(sqlitedatabase, "AD_CONFIG_INFO"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS AD_CONFIG_INFO (configKey TEXT, configValue TEXT, updateTime NUMERIC)");
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Exception exception1;
        exception1;
        StringBuilder stringbuilder = (new StringBuilder()).append("onUpgradeDB3To4(Exception:");
        if (exception1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        String s = exception1.getMessage();
_L1:
        j.b("Ad_SDK", stringbuilder.append(s).append(")").toString(), exception1);
        sqlitedatabase.endTransaction();
        return false;
        s = "";
          goto _L1
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public boolean onUpgradeDB4To5(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        if (!isExistTable(sqlitedatabase, "InstalledPkg"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS InstalledPkg (packageName TEXT NOT NULL UNIQUE DEFAULT(-1), updateTime NUMERIC)");
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Exception exception1;
        exception1;
        StringBuilder stringbuilder = (new StringBuilder()).append("onUpgradeDB4To5(Exception:");
        if (exception1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        String s = exception1.getMessage();
_L1:
        j.b("Ad_SDK", stringbuilder.append(s).append(")").toString(), exception1);
        sqlitedatabase.endTransaction();
        return false;
        s = "";
          goto _L1
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public boolean onUpgradeDB5To6(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        if (!isExistTable(sqlitedatabase, "AdShowClick"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS AdShowClick (vmid INTEGER DEFAULT(-1), opt TEXT , updateTime NUMERIC)");
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Exception exception1;
        exception1;
        StringBuilder stringbuilder = (new StringBuilder()).append("onUpgradeDB5To6(Exception:");
        if (exception1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        String s = exception1.getMessage();
_L1:
        j.b("Ad_SDK", stringbuilder.append(s).append(")").toString(), exception1);
        sqlitedatabase.endTransaction();
        return false;
        s = "";
          goto _L1
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public Cursor query(String s, String as[], String s1, String as1[], String s2, String s3, String s4)
    {
        try
        {
            as = getReadableDatabase().query(s, as, s1, as1, s2, s3, s4);
        }
        // Misplaced declaration of an exception variable
        catch (String as1[])
        {
            as = (new StringBuilder()).append("SQLException when query in ").append(s).append(", ").append(s1).append(",");
            if (as1 != null)
            {
                s = as1.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", as.append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as1[])
        {
            as = (new StringBuilder()).append("IllegalStateException when query in ").append(s).append(", ").append(s1).append(",");
            if (as1 != null)
            {
                s = as1.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", as.append(s).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as1[])
        {
            as = (new StringBuilder()).append("IllegalStateException when query in ").append(s).append(", ").append(s1).append(",");
            if (as1 != null)
            {
                s = as1.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", as.append(s).toString());
            return null;
        }
        return as;
    }

    public Cursor queryCrossTables(String s, String as[], String s1, String as1[], String s2)
    {
        SQLiteQueryBuilder sqlitequerybuilder = mSqlQB;
        sqlitequerybuilder;
        JVM INSTR monitorenter ;
        mSqlQB.setTables(s);
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        as = mSqlQB.query(sqlitedatabase, as, s1, as1, null, null, s2);
        s = as;
_L3:
        sqlitequerybuilder;
        JVM INSTR monitorexit ;
        return s;
        as1;
        as = (new StringBuilder()).append("SQLException when query in ").append(s).append(", ").append(s1).append(",");
        if (as1 == null) goto _L2; else goto _L1
_L1:
        s = as1.getMessage();
_L4:
        j.d("Ad_SDK", as.append(s).toString());
        s = null;
          goto _L3
        as1;
        as = (new StringBuilder()).append("IllegalStateException when query in ").append(s).append(", ").append(s1).append(",");
        if (as1 == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        s = as1.getMessage();
_L5:
        j.d("Ad_SDK", as.append(s).toString());
        s = null;
          goto _L3
        s;
        sqlitequerybuilder;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        s = "error";
          goto _L4
        s = "error";
          goto _L5
    }

    public long replace(String s, ContentValues contentvalues)
    {
        long l;
        try
        {
            l = getWritableDatabase().replace(s, null, contentvalues);
        }
        catch (Exception exception)
        {
            contentvalues = (new StringBuilder()).append("Exception when replace in ").append(s).append(",");
            if (exception != null)
            {
                s = exception.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", contentvalues.append(s).toString());
            return 0L;
        }
        return l;
    }

    public int update(String s, ContentValues contentvalues, String s1, String as[])
    {
        int i;
        try
        {
            i = getWritableDatabase().update(s, contentvalues, s1, as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            contentvalues = (new StringBuilder()).append("Exception when update in ").append(s).append(", ").append(s1).append(",");
            if (as != null)
            {
                s = as.getMessage();
            } else
            {
                s = "error";
            }
            j.d("Ad_SDK", contentvalues.append(s).toString());
            return 0;
        }
        return i;
    }

}

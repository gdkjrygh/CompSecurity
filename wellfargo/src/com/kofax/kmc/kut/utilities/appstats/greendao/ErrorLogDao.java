// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import a.a.a.d.e;
import a.a.a.d.h;
import a.a.a.g;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            ErrorLog, DaoSession, EnvironmentDao, Environment

public class ErrorLogDao extends a
{

    public static final String TABLENAME = "ErrorLog";
    private DaoSession a;
    private e b;
    private String c;

    public ErrorLogDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public ErrorLogDao(a.a.a.c.a a1, DaoSession daosession)
    {
        super(a1, daosession);
        a = daosession;
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "IF NOT EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ErrorLog' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'EnvironmentID' TEXT,").append("'ErrorTime' INTEGER,").append("'ErrorCode' INTEGER,").append("'Description' TEXT,").append("'Recommendation' TEXT,").append("'SessionKey' TEXT);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ErrorLog'").toString());
    }

    public List _queryEnvironment_ErrorLogList(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a.a.a.d.g g1 = queryBuilder();
            g1.a(Properties.EnvironmentID.a(null), new h[0]);
            b = g1.a();
        }
        this;
        JVM INSTR monitorexit ;
        e e1 = b.b();
        e1.a(0, s);
        return e1.c();
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void attachEntity(ErrorLog errorlog)
    {
        super.attachEntity(errorlog);
        errorlog.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((ErrorLog)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ErrorLog errorlog)
    {
        sqlitestatement.clearBindings();
        Object obj = errorlog.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = errorlog.getEnvironmentID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = errorlog.getErrorTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Long) (obj)).longValue());
        }
        obj = errorlog.getErrorCode();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Integer) (obj)).intValue());
        }
        obj = errorlog.getDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = errorlog.getRecommendation();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        errorlog = errorlog.getSessionKey();
        if (errorlog != null)
        {
            sqlitestatement.bindString(7, errorlog);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ErrorLog)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ErrorLog)obj);
    }

    public String getKey(ErrorLog errorlog)
    {
        if (errorlog != null)
        {
            return errorlog.getID();
        } else
        {
            return null;
        }
    }

    protected String getSelectDeep()
    {
        if (c == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            a.a.a.c.e.a(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            a.a.a.c.e.a(stringbuilder, "T0", a.getEnvironmentDao().getAllColumns());
            stringbuilder.append(" FROM ErrorLog T");
            stringbuilder.append(" LEFT JOIN Environment T0 ON T.'EnvironmentID'=T0.'ID'");
            stringbuilder.append(' ');
            c = stringbuilder.toString();
        }
        return c;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public List loadAllDeepFromCursor(Cursor cursor)
    {
        ArrayList arraylist;
        int i = cursor.getCount();
        arraylist = new ArrayList(i);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (identityScope != null)
        {
            identityScope.b();
            identityScope.a(i);
        }
        boolean flag;
        do
        {
            arraylist.add(loadCurrentDeep(cursor, false));
            flag = cursor.moveToNext();
        } while (flag);
        if (identityScope != null)
        {
            identityScope.c();
        }
        return arraylist;
        cursor;
        if (identityScope != null)
        {
            identityScope.c();
        }
        throw cursor;
    }

    protected ErrorLog loadCurrentDeep(Cursor cursor, boolean flag)
    {
        ErrorLog errorlog = (ErrorLog)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        errorlog.setEnvironment((Environment)loadCurrentOther(a.getEnvironmentDao(), cursor, i));
        return errorlog;
    }

    public ErrorLog loadDeep(Long long1)
    {
        Object obj;
        Object obj1;
        obj = null;
        assertSinglePk();
        if (long1 == null)
        {
            return null;
        }
        obj1 = new StringBuilder(getSelectDeep());
        ((StringBuilder) (obj1)).append("WHERE ");
        a.a.a.c.e.b(((StringBuilder) (obj1)), "T", getPkColumns());
        obj1 = ((StringBuilder) (obj1)).toString();
        long1 = long1.toString();
        obj1 = db.rawQuery(((String) (obj1)), new String[] {
            long1
        });
        boolean flag = ((Cursor) (obj1)).moveToFirst();
        if (flag) goto _L2; else goto _L1
_L1:
        long1 = obj;
_L3:
        ((Cursor) (obj1)).close();
        return long1;
_L2:
        if (!((Cursor) (obj1)).isLast())
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected unique result, but count was ").append(((Cursor) (obj1)).getCount()).toString());
        }
        break MISSING_BLOCK_LABEL_144;
        long1;
        ((Cursor) (obj1)).close();
        throw long1;
        long1 = loadCurrentDeep(((Cursor) (obj1)), true);
          goto _L3
    }

    protected List loadDeepAllAndCloseCursor(Cursor cursor)
    {
        List list = loadAllDeepFromCursor(cursor);
        cursor.close();
        return list;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public transient List queryDeep(String s, String as[])
    {
        return loadDeepAllAndCloseCursor(db.rawQuery((new StringBuilder()).append(getSelectDeep()).append(s).toString(), as));
    }

    public ErrorLog readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        Long long1;
        Integer integer;
        String s2;
        String s3;
        if (cursor.isNull(i + 0))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 0);
        }
        if (cursor.isNull(i + 1))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 1);
        }
        if (cursor.isNull(i + 2))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 6);
        }
        return new ErrorLog(s, s1, long1, integer, s2, s3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ErrorLog errorlog, int i)
    {
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 0);
        }
        errorlog.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        errorlog.setEnvironmentID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 2));
        }
        errorlog.setErrorTime(((Long) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 3));
        }
        errorlog.setErrorCode(((Integer) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        errorlog.setDescription(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        errorlog.setRecommendation(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 6);
        }
        errorlog.setSessionKey(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ErrorLog)obj, i);
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    public String readKey(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            return null;
        } else
        {
            return cursor.getString(i + 0);
        }
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((ErrorLog)obj, l);
    }

    protected String updateKeyAfterInsert(ErrorLog errorlog, long l)
    {
        return errorlog.getID();
    }

    private class Properties
    {

        public static final g Description = new g(4, java/lang/String, "Description", false, "Description");
        public static final g EnvironmentID = new g(1, java/lang/String, "EnvironmentID", false, "EnvironmentID");
        public static final g ErrorCode = new g(3, java/lang/Integer, "ErrorCode", false, "ErrorCode");
        public static final g ErrorTime = new g(2, java/lang/Long, "ErrorTime", false, "ErrorTime");
        public static final g ID = new g(0, java/lang/String, "ID", true, "ID");
        public static final g Recommendation = new g(5, java/lang/String, "Recommendation", false, "Recommendation");
        public static final g SessionKey = new g(6, java/lang/String, "SessionKey", false, "SessionKey");


        public Properties()
        {
        }
    }

}

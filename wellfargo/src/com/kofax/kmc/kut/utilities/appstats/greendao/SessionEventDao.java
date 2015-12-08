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
//            SessionEvent, DaoSession, EnvironmentDao, Environment

public class SessionEventDao extends a
{

    public static final String TABLENAME = "SessionEvent";
    private DaoSession a;
    private e b;
    private String c;

    public SessionEventDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public SessionEventDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'SessionEvent' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'EnvironmentID' TEXT,").append("'SessionKey' TEXT,").append("'Category' TEXT,").append("'Type' TEXT,").append("'EventTime' INTEGER,").append("'Response' TEXT,").append("'DocumentID' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SessionEvent'").toString());
    }

    public List _queryEnvironment_SessionEventList(String s)
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

    protected void attachEntity(SessionEvent sessionevent)
    {
        super.attachEntity(sessionevent);
        sessionevent.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((SessionEvent)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, SessionEvent sessionevent)
    {
        sqlitestatement.clearBindings();
        Object obj = sessionevent.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = sessionevent.getEnvironmentID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = sessionevent.getSessionKey();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = sessionevent.getCategory();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = sessionevent.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = sessionevent.getEventTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Long) (obj)).longValue());
        }
        obj = sessionevent.getResponse();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        sessionevent = sessionevent.getDocumentID();
        if (sessionevent != null)
        {
            sqlitestatement.bindString(8, sessionevent);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (SessionEvent)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((SessionEvent)obj);
    }

    public String getKey(SessionEvent sessionevent)
    {
        if (sessionevent != null)
        {
            return sessionevent.getID();
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
            stringbuilder.append(" FROM SessionEvent T");
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

    protected SessionEvent loadCurrentDeep(Cursor cursor, boolean flag)
    {
        SessionEvent sessionevent = (SessionEvent)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        sessionevent.setEnvironment((Environment)loadCurrentOther(a.getEnvironmentDao(), cursor, i));
        return sessionevent;
    }

    public SessionEvent loadDeep(Long long1)
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

    public SessionEvent readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        Long long1;
        String s5;
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        return new SessionEvent(s, s1, s2, s3, s4, long1, s5, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, SessionEvent sessionevent, int i)
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
        sessionevent.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        sessionevent.setEnvironmentID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        sessionevent.setSessionKey(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        sessionevent.setCategory(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        sessionevent.setType(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 5));
        }
        sessionevent.setEventTime(((Long) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        sessionevent.setResponse(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        sessionevent.setDocumentID(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (SessionEvent)obj, i);
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
        return updateKeyAfterInsert((SessionEvent)obj, l);
    }

    protected String updateKeyAfterInsert(SessionEvent sessionevent, long l)
    {
        return sessionevent.getID();
    }

    private class Properties
    {

        public static final g Category = new g(3, java/lang/String, "Category", false, "Category");
        public static final g DocumentID = new g(7, java/lang/String, "DocumentID", false, "DocumentID");
        public static final g EnvironmentID = new g(1, java/lang/String, "EnvironmentID", false, "EnvironmentID");
        public static final g EventTime = new g(5, java/lang/Long, "EventTime", false, "EventTime");
        public static final g ID = new g(0, java/lang/String, "ID", true, "ID");
        public static final g Response = new g(6, java/lang/String, "Response", false, "Response");
        public static final g SessionKey = new g(2, java/lang/String, "SessionKey", false, "SessionKey");
        public static final g Type = new g(4, java/lang/String, "Type", false, "Type");


        public Properties()
        {
        }
    }

}

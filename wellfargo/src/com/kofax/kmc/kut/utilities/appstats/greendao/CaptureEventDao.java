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
//            CaptureEvent, DaoSession, ImageDao, InstanceDao, 
//            Image, Instance

public class CaptureEventDao extends a
{

    public static final String TABLENAME = "CaptureEvent";
    private DaoSession a;
    private e b;
    private e c;
    private String d;

    public CaptureEventDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public CaptureEventDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'CaptureEvent' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'InstanceID' TEXT,").append("'EventTime' INTEGER,").append("'EventType' INTEGER,").append("'Value' INTEGER,").append("'ImageID' TEXT,").append("'SessionKey' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'CaptureEvent'").toString());
    }

    public List _queryImage_CaptureEventList(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a.a.a.d.g g1 = queryBuilder();
            g1.a(Properties.ImageID.a(null), new h[0]);
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

    public List _queryInstance_CaptureEventList(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            a.a.a.d.g g1 = queryBuilder();
            g1.a(Properties.InstanceID.a(null), new h[0]);
            c = g1.a();
        }
        this;
        JVM INSTR monitorexit ;
        e e1 = c.b();
        e1.a(0, s);
        return e1.c();
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void attachEntity(CaptureEvent captureevent)
    {
        super.attachEntity(captureevent);
        captureevent.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((CaptureEvent)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, CaptureEvent captureevent)
    {
        sqlitestatement.clearBindings();
        Object obj = captureevent.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = captureevent.getInstanceID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = captureevent.getEventTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Long) (obj)).longValue());
        }
        obj = captureevent.getEventType();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Integer) (obj)).intValue());
        }
        obj = captureevent.getValue();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Integer) (obj)).intValue());
        }
        obj = captureevent.getImageID();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        captureevent = captureevent.getSessionKey();
        if (captureevent != null)
        {
            sqlitestatement.bindString(7, captureevent);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (CaptureEvent)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((CaptureEvent)obj);
    }

    public String getKey(CaptureEvent captureevent)
    {
        if (captureevent != null)
        {
            return captureevent.getID();
        } else
        {
            return null;
        }
    }

    protected String getSelectDeep()
    {
        if (d == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            a.a.a.c.e.a(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            a.a.a.c.e.a(stringbuilder, "T0", a.getImageDao().getAllColumns());
            stringbuilder.append(',');
            a.a.a.c.e.a(stringbuilder, "T1", a.getInstanceDao().getAllColumns());
            stringbuilder.append(" FROM CaptureEvent T");
            stringbuilder.append(" LEFT JOIN Image T0 ON T.'ImageID'=T0.'ID'");
            stringbuilder.append(" LEFT JOIN Instance T1 ON T.'InstanceID'=T1.'InstanceID'");
            stringbuilder.append(' ');
            d = stringbuilder.toString();
        }
        return d;
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

    protected CaptureEvent loadCurrentDeep(Cursor cursor, boolean flag)
    {
        CaptureEvent captureevent = (CaptureEvent)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        captureevent.setImage((Image)loadCurrentOther(a.getImageDao(), cursor, i));
        int j = a.getImageDao().getAllColumns().length;
        captureevent.setInstance((Instance)loadCurrentOther(a.getInstanceDao(), cursor, j + i));
        return captureevent;
    }

    public CaptureEvent loadDeep(Long long1)
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

    public CaptureEvent readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        Long long1;
        Integer integer;
        Integer integer1;
        String s2;
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
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 6);
        }
        return new CaptureEvent(s, s1, long1, integer, integer1, s2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, CaptureEvent captureevent, int i)
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
        captureevent.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        captureevent.setInstanceID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 2));
        }
        captureevent.setEventTime(((Long) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 3));
        }
        captureevent.setEventType(((Integer) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 4));
        }
        captureevent.setValue(((Integer) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        captureevent.setImageID(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 6);
        }
        captureevent.setSessionKey(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (CaptureEvent)obj, i);
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
        return updateKeyAfterInsert((CaptureEvent)obj, l);
    }

    protected String updateKeyAfterInsert(CaptureEvent captureevent, long l)
    {
        return captureevent.getID();
    }

    private class Properties
    {

        public static final g EventTime = new g(2, java/lang/Long, "EventTime", false, "EventTime");
        public static final g EventType = new g(3, java/lang/Integer, "EventType", false, "EventType");
        public static final g ID = new g(0, java/lang/String, "ID", true, "ID");
        public static final g ImageID = new g(5, java/lang/String, "ImageID", false, "ImageID");
        public static final g InstanceID = new g(1, java/lang/String, "InstanceID", false, "InstanceID");
        public static final g SessionKey = new g(6, java/lang/String, "SessionKey", false, "SessionKey");
        public static final g Value = new g(4, java/lang/Integer, "Value", false, "Value");


        public Properties()
        {
        }
    }

}

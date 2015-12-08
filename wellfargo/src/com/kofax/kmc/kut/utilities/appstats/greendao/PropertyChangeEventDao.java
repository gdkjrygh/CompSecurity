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
//            PropertyChangeEvent, DaoSession, InstanceDao, Instance

public class PropertyChangeEventDao extends a
{

    public static final String TABLENAME = "PropertyChangeEvent";
    private DaoSession a;
    private e b;
    private String c;

    public PropertyChangeEventDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public PropertyChangeEventDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'PropertyChangeEvent' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'InstanceID' TEXT,").append("'EventTime' INTEGER,").append("'PropertyType' INTEGER,").append("'PropertyValue' TEXT,").append("'SessionKey' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'PropertyChangeEvent'").toString());
    }

    public List _queryInstance_PropertyChangeEventList(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a.a.a.d.g g1 = queryBuilder();
            g1.a(Properties.InstanceID.a(null), new h[0]);
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

    protected void attachEntity(PropertyChangeEvent propertychangeevent)
    {
        super.attachEntity(propertychangeevent);
        propertychangeevent.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((PropertyChangeEvent)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, PropertyChangeEvent propertychangeevent)
    {
        sqlitestatement.clearBindings();
        Object obj = propertychangeevent.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = propertychangeevent.getInstanceID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = propertychangeevent.getEventTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Long) (obj)).longValue());
        }
        obj = propertychangeevent.getPropertyType();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Integer) (obj)).intValue());
        }
        obj = propertychangeevent.getPropertyValue();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        propertychangeevent = propertychangeevent.getSessionKey();
        if (propertychangeevent != null)
        {
            sqlitestatement.bindString(6, propertychangeevent);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (PropertyChangeEvent)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((PropertyChangeEvent)obj);
    }

    public String getKey(PropertyChangeEvent propertychangeevent)
    {
        if (propertychangeevent != null)
        {
            return propertychangeevent.getID();
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
            a.a.a.c.e.a(stringbuilder, "T0", a.getInstanceDao().getAllColumns());
            stringbuilder.append(" FROM PropertyChangeEvent T");
            stringbuilder.append(" LEFT JOIN Instance T0 ON T.'InstanceID'=T0.'InstanceID'");
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

    protected PropertyChangeEvent loadCurrentDeep(Cursor cursor, boolean flag)
    {
        PropertyChangeEvent propertychangeevent = (PropertyChangeEvent)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        propertychangeevent.setInstance((Instance)loadCurrentOther(a.getInstanceDao(), cursor, i));
        return propertychangeevent;
    }

    public PropertyChangeEvent loadDeep(Long long1)
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

    public PropertyChangeEvent readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        Long long1;
        Integer integer;
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 5);
        }
        return new PropertyChangeEvent(s, s1, long1, integer, s2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, PropertyChangeEvent propertychangeevent, int i)
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
        propertychangeevent.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        propertychangeevent.setInstanceID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 2));
        }
        propertychangeevent.setEventTime(((Long) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 3));
        }
        propertychangeevent.setPropertyType(((Integer) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        propertychangeevent.setPropertyValue(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 5);
        }
        propertychangeevent.setSessionKey(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (PropertyChangeEvent)obj, i);
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
        return updateKeyAfterInsert((PropertyChangeEvent)obj, l);
    }

    protected String updateKeyAfterInsert(PropertyChangeEvent propertychangeevent, long l)
    {
        return propertychangeevent.getID();
    }

    private class Properties
    {

        public static final g EventTime = new g(2, java/lang/Long, "EventTime", false, "EventTime");
        public static final g ID = new g(0, java/lang/String, "ID", true, "ID");
        public static final g InstanceID = new g(1, java/lang/String, "InstanceID", false, "InstanceID");
        public static final g PropertyType = new g(3, java/lang/Integer, "PropertyType", false, "PropertyType");
        public static final g PropertyValue = new g(4, java/lang/String, "PropertyValue", false, "PropertyValue");
        public static final g SessionKey = new g(5, java/lang/String, "SessionKey", false, "SessionKey");


        public Properties()
        {
        }
    }

}

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
//            FieldChangeEvent, DaoSession, EnvironmentDao, Environment

public class FieldChangeEventDao extends a
{

    public static final String TABLENAME = "FieldChangeEvent";
    private DaoSession a;
    private e b;
    private String c;

    public FieldChangeEventDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public FieldChangeEventDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'FieldChangeEvent' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'DocumentID' TEXT,").append("'EventTime' INTEGER,").append("'OriginalValue' TEXT,").append("'ChangedValue' TEXT,").append("'FieldName' TEXT,").append("'IsValid' INTEGER,").append("'ErrorDescription' TEXT,").append("'SessionEventID' TEXT,").append("'Confidence' REAL,").append("'FormattingFailed' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FieldChangeEvent'").toString());
    }

    public List _queryDocument_FieldChangeEventList(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a.a.a.d.g g1 = queryBuilder();
            g1.a(Properties.DocumentID.a(null), new h[0]);
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

    protected void attachEntity(FieldChangeEvent fieldchangeevent)
    {
        super.attachEntity(fieldchangeevent);
        fieldchangeevent.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((FieldChangeEvent)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, FieldChangeEvent fieldchangeevent)
    {
        sqlitestatement.clearBindings();
        Object obj = fieldchangeevent.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = fieldchangeevent.getDocumentID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = fieldchangeevent.getEventTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Long) (obj)).longValue());
        }
        obj = fieldchangeevent.getOriginalValue();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = fieldchangeevent.getChangedValue();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = fieldchangeevent.getFieldName();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = fieldchangeevent.getIsValid();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Integer) (obj)).intValue());
        }
        obj = fieldchangeevent.getErrorDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = fieldchangeevent.getSessionEventID();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = fieldchangeevent.getConfidence();
        if (obj != null)
        {
            sqlitestatement.bindDouble(10, ((Float) (obj)).floatValue());
        }
        fieldchangeevent = fieldchangeevent.getFormattingFailed();
        if (fieldchangeevent != null)
        {
            sqlitestatement.bindLong(11, fieldchangeevent.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (FieldChangeEvent)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((FieldChangeEvent)obj);
    }

    public String getKey(FieldChangeEvent fieldchangeevent)
    {
        if (fieldchangeevent != null)
        {
            return fieldchangeevent.getID();
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
            stringbuilder.append(" FROM FieldChangeEvent T");
            stringbuilder.append(" LEFT JOIN Environment T0 ON T.'DocumentID'=T0.'ID'");
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

    protected FieldChangeEvent loadCurrentDeep(Cursor cursor, boolean flag)
    {
        FieldChangeEvent fieldchangeevent = (FieldChangeEvent)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        fieldchangeevent.setEnvironment((Environment)loadCurrentOther(a.getEnvironmentDao(), cursor, i));
        return fieldchangeevent;
    }

    public FieldChangeEvent loadDeep(Long long1)
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

    public FieldChangeEvent readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        Long long1;
        String s2;
        String s3;
        String s4;
        Integer integer;
        String s5;
        String s6;
        Float float1;
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            float1 = null;
        } else
        {
            float1 = Float.valueOf(cursor.getFloat(i + 9));
        }
        if (cursor.isNull(i + 10))
        {
            cursor = obj;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 10));
        }
        return new FieldChangeEvent(s, s1, long1, s2, s3, s4, integer, s5, s6, float1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, FieldChangeEvent fieldchangeevent, int i)
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
        fieldchangeevent.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        fieldchangeevent.setDocumentID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 2));
        }
        fieldchangeevent.setEventTime(((Long) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        fieldchangeevent.setOriginalValue(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        fieldchangeevent.setChangedValue(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        fieldchangeevent.setFieldName(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 6));
        }
        fieldchangeevent.setIsValid(((Integer) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        fieldchangeevent.setErrorDescription(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        fieldchangeevent.setSessionEventID(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 9));
        }
        fieldchangeevent.setConfidence(((Float) (obj)));
        if (cursor.isNull(i + 10))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 10));
        }
        fieldchangeevent.setFormattingFailed(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (FieldChangeEvent)obj, i);
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
        return updateKeyAfterInsert((FieldChangeEvent)obj, l);
    }

    protected String updateKeyAfterInsert(FieldChangeEvent fieldchangeevent, long l)
    {
        return fieldchangeevent.getID();
    }

    private class Properties
    {

        public static final g ChangedValue = new g(4, java/lang/String, "ChangedValue", false, "ChangedValue");
        public static final g Confidence = new g(9, java/lang/Float, "Confidence", false, "Confidence");
        public static final g DocumentID = new g(1, java/lang/String, "DocumentID", false, "DocumentID");
        public static final g ErrorDescription = new g(7, java/lang/String, "ErrorDescription", false, "ErrorDescription");
        public static final g EventTime = new g(2, java/lang/Long, "EventTime", false, "EventTime");
        public static final g FieldName = new g(5, java/lang/String, "FieldName", false, "FieldName");
        public static final g FormattingFailed = new g(10, java/lang/Integer, "FormattingFailed", false, "FormattingFailed");
        public static final g ID = new g(0, java/lang/String, "ID", true, "ID");
        public static final g IsValid = new g(6, java/lang/Integer, "IsValid", false, "IsValid");
        public static final g OriginalValue = new g(3, java/lang/String, "OriginalValue", false, "OriginalValue");
        public static final g SessionEventID = new g(8, java/lang/String, "SessionEventID", false, "SessionEventID");


        public Properties()
        {
        }
    }

}

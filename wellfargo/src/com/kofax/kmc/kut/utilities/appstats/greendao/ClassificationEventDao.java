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
//            ClassificationEvent, DaoSession, ImageDao, InstanceDao, 
//            Image, Instance

public class ClassificationEventDao extends a
{

    public static final String TABLENAME = "ClassificationEvent";
    private DaoSession a;
    private e b;
    private e c;
    private String d;

    public ClassificationEventDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public ClassificationEventDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ClassificationEvent' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'InstanceID' TEXT,").append("'StartTime' INTEGER,").append("'StopTime' INTEGER,").append("'ClassificationResult' TEXT,").append("'ClassificationConfidence' REAL,").append("'ImageID' TEXT,").append("'DocumentID' TEXT,").append("'SessionKey' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ClassificationEvent'").toString());
    }

    public List _queryImage_ClassificationEventList(String s)
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

    public List _queryInstance_ClassificationEventList(String s)
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

    protected void attachEntity(ClassificationEvent classificationevent)
    {
        super.attachEntity(classificationevent);
        classificationevent.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((ClassificationEvent)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ClassificationEvent classificationevent)
    {
        sqlitestatement.clearBindings();
        Object obj = classificationevent.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = classificationevent.getInstanceID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = classificationevent.getStartTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Long) (obj)).longValue());
        }
        obj = classificationevent.getStopTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Long) (obj)).longValue());
        }
        obj = classificationevent.getClassificationResult();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = classificationevent.getClassificationConfidence();
        if (obj != null)
        {
            sqlitestatement.bindDouble(6, ((Float) (obj)).floatValue());
        }
        obj = classificationevent.getImageID();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = classificationevent.getDocumentID();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        classificationevent = classificationevent.getSessionKey();
        if (classificationevent != null)
        {
            sqlitestatement.bindString(9, classificationevent);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ClassificationEvent)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ClassificationEvent)obj);
    }

    public String getKey(ClassificationEvent classificationevent)
    {
        if (classificationevent != null)
        {
            return classificationevent.getID();
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
            stringbuilder.append(" FROM ClassificationEvent T");
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

    protected ClassificationEvent loadCurrentDeep(Cursor cursor, boolean flag)
    {
        ClassificationEvent classificationevent = (ClassificationEvent)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        classificationevent.setImage((Image)loadCurrentOther(a.getImageDao(), cursor, i));
        int j = a.getImageDao().getAllColumns().length;
        classificationevent.setInstance((Instance)loadCurrentOther(a.getInstanceDao(), cursor, j + i));
        return classificationevent;
    }

    public ClassificationEvent loadDeep(Long long1)
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

    public ClassificationEvent readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        Long long1;
        Long long2;
        String s2;
        Float float1;
        String s3;
        String s4;
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
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 3));
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
            float1 = null;
        } else
        {
            float1 = Float.valueOf(cursor.getFloat(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 8);
        }
        return new ClassificationEvent(s, s1, long1, long2, s2, float1, s3, s4, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ClassificationEvent classificationevent, int i)
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
        classificationevent.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        classificationevent.setInstanceID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 2));
        }
        classificationevent.setStartTime(((Long) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 3));
        }
        classificationevent.setStopTime(((Long) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        classificationevent.setClassificationResult(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 5));
        }
        classificationevent.setClassificationConfidence(((Float) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        classificationevent.setImageID(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        classificationevent.setDocumentID(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 8);
        }
        classificationevent.setSessionKey(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ClassificationEvent)obj, i);
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
        return updateKeyAfterInsert((ClassificationEvent)obj, l);
    }

    protected String updateKeyAfterInsert(ClassificationEvent classificationevent, long l)
    {
        return classificationevent.getID();
    }

    private class Properties
    {

        public static final g ClassificationConfidence = new g(5, java/lang/Float, "ClassificationConfidence", false, "ClassificationConfidence");
        public static final g ClassificationResult = new g(4, java/lang/String, "ClassificationResult", false, "ClassificationResult");
        public static final g DocumentID = new g(7, java/lang/String, "DocumentID", false, "DocumentID");
        public static final g ID = new g(0, java/lang/String, "ID", true, "ID");
        public static final g ImageID = new g(6, java/lang/String, "ImageID", false, "ImageID");
        public static final g InstanceID = new g(1, java/lang/String, "InstanceID", false, "InstanceID");
        public static final g SessionKey = new g(8, java/lang/String, "SessionKey", false, "SessionKey");
        public static final g StartTime = new g(2, java/lang/Long, "StartTime", false, "StartTime");
        public static final g StopTime = new g(3, java/lang/Long, "StopTime", false, "StopTime");


        public Properties()
        {
        }
    }

}

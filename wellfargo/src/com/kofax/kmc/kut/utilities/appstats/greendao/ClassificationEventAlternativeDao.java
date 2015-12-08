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
//            ClassificationEventAlternative, DaoSession, ClassificationEventDao, ClassificationEvent

public class ClassificationEventAlternativeDao extends a
{

    public static final String TABLENAME = "ClassificationEventAlternative";
    private DaoSession a;
    private e b;
    private String c;

    public ClassificationEventAlternativeDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public ClassificationEventAlternativeDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ClassificationEventAlternative' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'ClassificationEventID' TEXT,").append("'AlternativeResult' TEXT,").append("'AlternativeConfidence' REAL);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ClassificationEventAlternative'").toString());
    }

    public List _queryClassificationEvent_ClassificationEventAlternativeList(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a.a.a.d.g g1 = queryBuilder();
            g1.a(Properties.ClassificationEventID.a(null), new h[0]);
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

    protected void attachEntity(ClassificationEventAlternative classificationeventalternative)
    {
        super.attachEntity(classificationeventalternative);
        classificationeventalternative.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((ClassificationEventAlternative)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ClassificationEventAlternative classificationeventalternative)
    {
        sqlitestatement.clearBindings();
        String s = classificationeventalternative.getID();
        if (s != null)
        {
            sqlitestatement.bindString(1, s);
        }
        s = classificationeventalternative.getClassificationEventID();
        if (s != null)
        {
            sqlitestatement.bindString(2, s);
        }
        s = classificationeventalternative.getAlternativeResult();
        if (s != null)
        {
            sqlitestatement.bindString(3, s);
        }
        classificationeventalternative = classificationeventalternative.getAlternativeConfidence();
        if (classificationeventalternative != null)
        {
            sqlitestatement.bindDouble(4, classificationeventalternative.floatValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ClassificationEventAlternative)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ClassificationEventAlternative)obj);
    }

    public String getKey(ClassificationEventAlternative classificationeventalternative)
    {
        if (classificationeventalternative != null)
        {
            return classificationeventalternative.getID();
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
            a.a.a.c.e.a(stringbuilder, "T0", a.getClassificationEventDao().getAllColumns());
            stringbuilder.append(" FROM ClassificationEventAlternative T");
            stringbuilder.append(" LEFT JOIN ClassificationEvent T0 ON T.'ClassificationEventID'=T0.'ID'");
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

    protected ClassificationEventAlternative loadCurrentDeep(Cursor cursor, boolean flag)
    {
        ClassificationEventAlternative classificationeventalternative = (ClassificationEventAlternative)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        classificationeventalternative.setClassificationEvent((ClassificationEvent)loadCurrentOther(a.getClassificationEventDao(), cursor, i));
        return classificationeventalternative;
    }

    public ClassificationEventAlternative loadDeep(Long long1)
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

    public ClassificationEventAlternative readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            cursor = obj;
        } else
        {
            cursor = Float.valueOf(cursor.getFloat(i + 3));
        }
        return new ClassificationEventAlternative(s, s1, s2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ClassificationEventAlternative classificationeventalternative, int i)
    {
        Object obj = null;
        String s;
        if (cursor.isNull(i + 0))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 0);
        }
        classificationeventalternative.setID(s);
        if (cursor.isNull(i + 1))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
        }
        classificationeventalternative.setClassificationEventID(s);
        if (cursor.isNull(i + 2))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 2);
        }
        classificationeventalternative.setAlternativeResult(s);
        if (cursor.isNull(i + 3))
        {
            cursor = obj;
        } else
        {
            cursor = Float.valueOf(cursor.getFloat(i + 3));
        }
        classificationeventalternative.setAlternativeConfidence(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ClassificationEventAlternative)obj, i);
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
        return updateKeyAfterInsert((ClassificationEventAlternative)obj, l);
    }

    protected String updateKeyAfterInsert(ClassificationEventAlternative classificationeventalternative, long l)
    {
        return classificationeventalternative.getID();
    }

    private class Properties
    {

        public static final g AlternativeConfidence = new g(3, java/lang/Float, "AlternativeConfidence", false, "AlternativeConfidence");
        public static final g AlternativeResult = new g(2, java/lang/String, "AlternativeResult", false, "AlternativeResult");
        public static final g ClassificationEventID = new g(1, java/lang/String, "ClassificationEventID", false, "ClassificationEventID");
        public static final g ID = new g(0, java/lang/String, "ID", true, "ID");


        public Properties()
        {
        }
    }

}

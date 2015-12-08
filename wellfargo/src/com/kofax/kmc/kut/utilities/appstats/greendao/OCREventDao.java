// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import a.a.a.c.e;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            OCREvent, DaoSession, InstanceDao, ImageDao, 
//            Instance, Image

public class OCREventDao extends a
{

    public static final String TABLENAME = "OcrEvent";
    private DaoSession a;
    private String b;

    public OCREventDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public OCREventDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'OcrEvent' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'InstanceID' TEXT,").append("'SessionKey' TEXT,").append("'StartTime' INTEGER,").append("'StopTime' INTEGER,").append("'SourceImageID' TEXT,").append("'ResultCode' INTEGER,").append("'EventType' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'OcrEvent'").toString());
    }

    protected void attachEntity(OCREvent ocrevent)
    {
        super.attachEntity(ocrevent);
        ocrevent.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((OCREvent)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, OCREvent ocrevent)
    {
        sqlitestatement.clearBindings();
        sqlitestatement.bindString(1, ocrevent.getId());
        Object obj = ocrevent.getInstanceID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = ocrevent.getSessionKey();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = ocrevent.getStartTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Long) (obj)).longValue());
        }
        obj = ocrevent.getStopTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Long) (obj)).longValue());
        }
        obj = ocrevent.getSourceImageID();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = ocrevent.getResultCode();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Integer) (obj)).intValue());
        }
        ocrevent = ocrevent.getEventType();
        if (ocrevent != null)
        {
            sqlitestatement.bindString(8, ocrevent);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (OCREvent)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((OCREvent)obj);
    }

    public String getKey(OCREvent ocrevent)
    {
        if (ocrevent != null)
        {
            return ocrevent.getId();
        } else
        {
            return null;
        }
    }

    protected String getSelectDeep()
    {
        if (b == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            e.a(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            e.a(stringbuilder, "T0", a.getInstanceDao().getAllColumns());
            stringbuilder.append(',');
            e.a(stringbuilder, "T1", a.getImageDao().getAllColumns());
            stringbuilder.append(" FROM OCREVENT T");
            stringbuilder.append(" LEFT JOIN INSTANCE T0 ON T.'_id'=T0.'_id'");
            stringbuilder.append(" LEFT JOIN IMAGE T1 ON T.'_id'=T1.'_id'");
            stringbuilder.append(' ');
            b = stringbuilder.toString();
        }
        return b;
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

    protected OCREvent loadCurrentDeep(Cursor cursor, boolean flag)
    {
        OCREvent ocrevent = (OCREvent)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        Instance instance = (Instance)loadCurrentOther(a.getInstanceDao(), cursor, i);
        if (instance != null)
        {
            ocrevent.setInstance(instance);
        }
        int j = a.getInstanceDao().getAllColumns().length;
        cursor = (Image)loadCurrentOther(a.getImageDao(), cursor, j + i);
        if (cursor != null)
        {
            ocrevent.setImage(cursor);
        }
        return ocrevent;
    }

    public OCREvent loadDeep(Long long1)
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
        e.b(((StringBuilder) (obj1)), "T", getPkColumns());
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

    public OCREvent readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        String s2;
        Long long1;
        Long long2;
        String s3;
        Integer integer;
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
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 4));
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
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        return new OCREvent(s, s1, s2, long1, long2, s3, integer, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, OCREvent ocrevent, int i)
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
        ocrevent.setId(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        ocrevent.setInstanceID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        ocrevent.setSessionKey(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 3));
        }
        ocrevent.setStartTime(((Long) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 4));
        }
        ocrevent.setStopTime(((Long) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        ocrevent.setSourceImageID(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 6));
        }
        ocrevent.setResultCode(((Integer) (obj)));
        if (cursor.isNull(i + 7))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        ocrevent.setEventType(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (OCREvent)obj, i);
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    public String readKey(Cursor cursor, int i)
    {
        return cursor.getString(i + 0);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((OCREvent)obj, l);
    }

    protected String updateKeyAfterInsert(OCREvent ocrevent, long l)
    {
        return ocrevent.getId();
    }
}

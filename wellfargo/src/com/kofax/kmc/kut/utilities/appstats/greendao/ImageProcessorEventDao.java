// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            ImageProcessorEvent, DaoSession

public class ImageProcessorEventDao extends a
{

    public static final String TABLENAME = "ImageProcessorEvent";

    public ImageProcessorEventDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public ImageProcessorEventDao(a.a.a.c.a a1, DaoSession daosession)
    {
        super(a1, daosession);
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ImageProcessorEvent' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'InstanceID' TEXT,").append("'StartTime' INTEGER,").append("'StopTime' INTEGER,").append("'ResultCode' INTEGER,").append("'ProcessingProfile' TEXT,").append("'SourceImageID' TEXT,").append("'ProcessedImageID' TEXT,").append("'SessionKey' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ImageProcessorEvent'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ImageProcessorEvent imageprocessorevent)
    {
        sqlitestatement.clearBindings();
        Object obj = imageprocessorevent.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = imageprocessorevent.getInstanceID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = imageprocessorevent.getStartTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Long) (obj)).longValue());
        }
        obj = imageprocessorevent.getStopTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Long) (obj)).longValue());
        }
        obj = imageprocessorevent.getResultCode();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Integer) (obj)).intValue());
        }
        obj = imageprocessorevent.getProcessingProfile();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = imageprocessorevent.getSourceImageID();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = imageprocessorevent.getProcessedImageID();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        imageprocessorevent = imageprocessorevent.getSessionKey();
        if (imageprocessorevent != null)
        {
            sqlitestatement.bindString(9, imageprocessorevent);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ImageProcessorEvent)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ImageProcessorEvent)obj);
    }

    public String getKey(ImageProcessorEvent imageprocessorevent)
    {
        if (imageprocessorevent != null)
        {
            return imageprocessorevent.getID();
        } else
        {
            return null;
        }
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public ImageProcessorEvent readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        Long long1;
        Long long2;
        Integer integer;
        String s2;
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
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 4));
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
        return new ImageProcessorEvent(s, s1, long1, long2, integer, s2, s3, s4, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ImageProcessorEvent imageprocessorevent, int i)
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
        imageprocessorevent.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        imageprocessorevent.setInstanceID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 2));
        }
        imageprocessorevent.setStartTime(((Long) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 3));
        }
        imageprocessorevent.setStopTime(((Long) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 4));
        }
        imageprocessorevent.setResultCode(((Integer) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        imageprocessorevent.setProcessingProfile(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        imageprocessorevent.setSourceImageID(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        imageprocessorevent.setProcessedImageID(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 8);
        }
        imageprocessorevent.setSessionKey(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ImageProcessorEvent)obj, i);
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
        return updateKeyAfterInsert((ImageProcessorEvent)obj, l);
    }

    protected String updateKeyAfterInsert(ImageProcessorEvent imageprocessorevent, long l)
    {
        return imageprocessorevent.getID();
    }
}

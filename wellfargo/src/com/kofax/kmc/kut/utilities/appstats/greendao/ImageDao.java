// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            Image, DaoSession

public class ImageDao extends a
{

    public static final String TABLENAME = "Image";
    private DaoSession a;

    public ImageDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public ImageDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'Image' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'EnvironmentID' TEXT,").append("'CreationTime' INTEGER,").append("'FileSize' INTEGER,").append("'Source' INTEGER,").append("'DocumentID' TEXT,").append("'StoragePath' TEXT,").append("'SessionKey' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'Image'").toString());
    }

    protected void attachEntity(Image image)
    {
        super.attachEntity(image);
        image.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((Image)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Image image)
    {
        sqlitestatement.clearBindings();
        Object obj = image.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = image.getEnvironmentID();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = image.getCreationTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Long) (obj)).longValue());
        }
        obj = image.getFileSize();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Long) (obj)).longValue());
        }
        obj = image.getSource();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Integer) (obj)).intValue());
        }
        obj = image.getDocumentID();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = image.getStoragePath();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        image = image.getSessionKey();
        if (image != null)
        {
            sqlitestatement.bindString(8, image);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Image)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Image)obj);
    }

    public String getKey(Image image)
    {
        if (image != null)
        {
            return image.getID();
        } else
        {
            return null;
        }
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Image readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        String s1;
        Long long1;
        Long long2;
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
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        return new Image(s, s1, long1, long2, integer, s2, s3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Image image, int i)
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
        image.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        image.setEnvironmentID(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 2));
        }
        image.setCreationTime(((Long) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 3));
        }
        image.setFileSize(((Long) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 4));
        }
        image.setSource(((Integer) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        image.setDocumentID(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        image.setStoragePath(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        image.setSessionKey(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Image)obj, i);
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
        return updateKeyAfterInsert((Image)obj, l);
    }

    protected String updateKeyAfterInsert(Image image, long l)
    {
        return image.getID();
    }
}

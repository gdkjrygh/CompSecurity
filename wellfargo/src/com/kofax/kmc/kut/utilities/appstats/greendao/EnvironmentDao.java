// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            Environment, DaoSession

public class EnvironmentDao extends a
{

    public static final String TABLENAME = "Environment";
    private DaoSession a;

    public EnvironmentDao(a.a.a.c.a a1)
    {
        super(a1);
    }

    public EnvironmentDao(a.a.a.c.a a1, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'Environment' (").append("'ID' TEXT PRIMARY KEY NOT NULL ,").append("'EnvTime' INTEGER,").append("'DeviceID' TEXT,").append("'Manufacturer' TEXT,").append("'Model' TEXT,").append("'Memory' TEXT,").append("'OSVersion' TEXT,").append("'Language' TEXT,").append("'SDKVersion' TEXT,").append("'TimeZone' TEXT,").append("'Carrier' TEXT,").append("'OSName' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'Environment'").toString());
    }

    protected void attachEntity(Environment environment)
    {
        super.attachEntity(environment);
        environment.__setDaoSession(a);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((Environment)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Environment environment)
    {
        sqlitestatement.clearBindings();
        Object obj = environment.getID();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = environment.getEnvTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = environment.getDeviceID();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = environment.getManufacturer();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = environment.getModel();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = environment.getMemory();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = environment.getOSVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = environment.getLanguage();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = environment.getSDKVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = environment.getTimeZone();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = environment.getCarrier();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        environment = environment.getOSName();
        if (environment != null)
        {
            sqlitestatement.bindString(12, environment);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Environment)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Environment)obj);
    }

    public String getKey(Environment environment)
    {
        if (environment != null)
        {
            return environment.getID();
        } else
        {
            return null;
        }
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Environment readEntity(Cursor cursor, int i)
    {
        String s;
        Long long1;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        if (cursor.isNull(i + 0))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 0);
        }
        if (cursor.isNull(i + 1))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 2);
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
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 11);
        }
        return new Environment(s, long1, s1, s2, s3, s4, s5, s6, s7, s8, s9, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Environment environment, int i)
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
        environment.setID(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        environment.setEnvTime(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        environment.setDeviceID(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        environment.setManufacturer(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        environment.setModel(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        environment.setMemory(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        environment.setOSVersion(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        environment.setLanguage(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        environment.setSDKVersion(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        environment.setTimeZone(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        environment.setCarrier(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 11);
        }
        environment.setOSName(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Environment)obj, i);
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
        return updateKeyAfterInsert((Environment)obj, l);
    }

    protected String updateKeyAfterInsert(Environment environment, long l)
    {
        return environment.getID();
    }
}

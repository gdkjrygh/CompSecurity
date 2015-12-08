// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.b;
import a.a.a.b.d;
import a.a.a.c;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            EnvironmentDao, ErrorLogDao, InstanceDao, DocumentDao, 
//            ImageDao, ClassificationEventDao, ClassificationEventAlternativeDao, CaptureEventDao, 
//            PropertyChangeEventDao, ImageProcessorEventDao, FieldChangeEventDao, SessionEventDao, 
//            OCREventDao, DaoSession

public class DaoMaster extends b
{

    public static final int SCHEMA_VERSION = 2;

    public DaoMaster(SQLiteDatabase sqlitedatabase)
    {
        super(sqlitedatabase, 2);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/EnvironmentDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/ErrorLogDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/InstanceDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/DocumentDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/ImageDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/ClassificationEventDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/ClassificationEventAlternativeDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/CaptureEventDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/PropertyChangeEventDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/ImageProcessorEventDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/FieldChangeEventDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/SessionEventDao);
        registerDaoClass(com/kofax/kmc/kut/utilities/appstats/greendao/OCREventDao);
    }

    public static void createAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        EnvironmentDao.createTable(sqlitedatabase, flag);
        ErrorLogDao.createTable(sqlitedatabase, flag);
        InstanceDao.createTable(sqlitedatabase, flag);
        DocumentDao.createTable(sqlitedatabase, flag);
        ImageDao.createTable(sqlitedatabase, flag);
        ClassificationEventDao.createTable(sqlitedatabase, flag);
        ClassificationEventAlternativeDao.createTable(sqlitedatabase, flag);
        CaptureEventDao.createTable(sqlitedatabase, flag);
        PropertyChangeEventDao.createTable(sqlitedatabase, flag);
        ImageProcessorEventDao.createTable(sqlitedatabase, flag);
        FieldChangeEventDao.createTable(sqlitedatabase, flag);
        SessionEventDao.createTable(sqlitedatabase, flag);
        OCREventDao.createTable(sqlitedatabase, flag);
    }

    public static void dropAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        EnvironmentDao.dropTable(sqlitedatabase, flag);
        ErrorLogDao.dropTable(sqlitedatabase, flag);
        InstanceDao.dropTable(sqlitedatabase, flag);
        DocumentDao.dropTable(sqlitedatabase, flag);
        ImageDao.dropTable(sqlitedatabase, flag);
        ClassificationEventDao.dropTable(sqlitedatabase, flag);
        ClassificationEventAlternativeDao.dropTable(sqlitedatabase, flag);
        CaptureEventDao.dropTable(sqlitedatabase, flag);
        PropertyChangeEventDao.dropTable(sqlitedatabase, flag);
        ImageProcessorEventDao.dropTable(sqlitedatabase, flag);
        FieldChangeEventDao.dropTable(sqlitedatabase, flag);
        SessionEventDao.dropTable(sqlitedatabase, flag);
        OCREventDao.dropTable(sqlitedatabase, flag);
    }

    public volatile c newSession()
    {
        return newSession();
    }

    public volatile c newSession(d d1)
    {
        return newSession(d1);
    }

    public DaoSession newSession()
    {
        return new DaoSession(db, d.a, daoConfigMap);
    }

    public DaoSession newSession(d d1)
    {
        return new DaoSession(db, d1, daoConfigMap);
    }
}

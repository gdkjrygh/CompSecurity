// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import a.a.a.d.c;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDataStore;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsOrmDao;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession

public abstract class AppStatsGreenDao extends AppStatsOrmDao
{

    static DaoSession a = null;
    static final int b = 50;
    private static final String c = "AppStatsGreenDao";

    public AppStatsGreenDao()
    {
    }

    protected abstract Object createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[]);

    public long dsCountRows()
    {
        initializeGreenDaoObjects(null);
        return countQuery.b().c();
    }

    public abstract void dsExport(String s, AppStatsDsExportHandler appstatsdsexporthandler);

    public abstract void dsInsert(AppStatsDaoField aappstatsdaofield[]);

    protected boolean initializeGreenDaoObjects(a a1)
    {
        return initializeGreenDaoSession(a1);
    }

    protected boolean initializeGreenDaoSession(a a1)
    {
        DaoSession daosession = (DaoSession)appStatsDataStore.getDsHandle();
        if (a1 != null)
        {
            a1 = a1.getSession();
        } else
        {
            a1 = null;
        }
        if (daosession != (DaoSession)(DaoSession)a1)
        {
            a = daosession;
            if (!(a instanceof DaoSession))
            {
                throw new UnsupportedOperationException("appStatsDataStore.getDsHandle(): expected object type DaoSession");
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

}

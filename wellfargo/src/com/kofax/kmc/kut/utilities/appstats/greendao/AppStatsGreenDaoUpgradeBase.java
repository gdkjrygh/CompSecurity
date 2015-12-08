// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import android.database.sqlite.SQLiteDatabase;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDaoUpgrade

public abstract class AppStatsGreenDaoUpgradeBase
    implements AppStatsGreenDaoUpgrade
{

    public AppStatsGreenDaoUpgradeBase()
    {
    }

    protected void prepareUpgrade(SQLiteDatabase sqlitedatabase, int i)
    {
        if (sqlitedatabase == null)
        {
            throw new NullPointerException("prepareUpgrade: db param cannot be null.");
        }
        if (i < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Existing schema version is ").append(i).append(". It cannot be less than 1.").toString());
        }
        if (i < getVersionICanUpgradeFrom())
        {
            AppStatsGreenDaoUpgrade appstatsgreendaoupgrade = getPrevGreenDaoUpgradeObject();
            if (appstatsgreendaoupgrade == null && i != getVersionICanUpgradeFrom())
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH);
            }
            if (appstatsgreendaoupgrade.upgradeOldToNewSchema(sqlitedatabase, i) != getVersionICanUpgradeFrom())
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH);
            }
        }
    }
}

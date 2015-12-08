// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import android.database.sqlite.SQLiteDatabase;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDaoUpgradeBase, AppStatsGreenDaoUpgrade

public class  extends AppStatsGreenDaoUpgradeBase
{

    public AppStatsGreenDaoUpgrade getPrevGreenDaoUpgradeObject()
    {
        return new <init>();
    }

    public int getVersionICanUpgradeFrom()
    {
        return 2;
    }

    public int getVersionICanUpgradeTo()
    {
        return 3;
    }

    public int upgradeOldToNewSchema(SQLiteDatabase sqlitedatabase, int i)
    {
        prepareUpgrade(sqlitedatabase, i);
        if (i == 2)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH);
        } else
        {
            return getVersionICanUpgradeTo();
        }
    }

    protected ()
    {
    }
}

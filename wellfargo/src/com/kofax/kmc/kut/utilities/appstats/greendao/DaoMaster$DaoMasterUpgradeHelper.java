// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

public class r extends r
{

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        switch (j)
        {
        default:
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH);

        case 2: // '\002'
            (new r()).upgradeOldToNewSchema(sqlitedatabase, i);
            return;

        case 3: // '\003'
            (new r()).upgradeOldToNewSchema(sqlitedatabase, i);
            break;
        }
    }

    public r(Context context, String s, android.database.sqlite.aoMasterUpgradeHelper aomasterupgradehelper)
    {
        super(context, s, aomasterupgradehelper);
    }
}

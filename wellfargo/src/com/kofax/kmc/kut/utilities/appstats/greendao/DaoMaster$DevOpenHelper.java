// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

public class it> extends it>
{

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DATASTORE_OUT_OF_DATE);
    }

    public (Context context, String s, android.database.sqlite.tory tory)
    {
        super(context, s, tory);
    }
}

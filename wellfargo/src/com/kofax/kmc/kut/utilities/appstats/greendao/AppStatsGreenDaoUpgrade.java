// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import android.database.sqlite.SQLiteDatabase;

public interface AppStatsGreenDaoUpgrade
{

    public abstract AppStatsGreenDaoUpgrade getPrevGreenDaoUpgradeObject();

    public abstract int getVersionICanUpgradeFrom();

    public abstract int getVersionICanUpgradeTo();

    public abstract int upgradeOldToNewSchema(SQLiteDatabase sqlitedatabase, int i);
}

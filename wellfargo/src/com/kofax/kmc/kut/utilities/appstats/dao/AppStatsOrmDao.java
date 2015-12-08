// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import a.a.a.d.c;
import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDataStore;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import java.util.ArrayList;
import java.util.List;

public abstract class AppStatsOrmDao
{

    private static final String a = "AppStatsOrmDao";
    protected static AppStatistics appStats;
    protected static AppStatsDataStore appStatsDataStore;
    protected static com.kofax.kmc.kut.utilities.appstats.AppStatistics.FriendAS asFriend;
    protected static List daoFields = new ArrayList();
    protected c countQuery;

    public AppStatsOrmDao()
    {
        countQuery = null;
    }

    public abstract long dsCountRows();

    public abstract void dsExport(String s, AppStatsDsExportHandler appstatsdsexporthandler);

    public abstract void dsInsert(AppStatsDaoField aappstatsdaofield[]);

    public abstract void dsUpdate(AppStatsDaoField aappstatsdaofield[]);

    static 
    {
        appStats = AppStatistics.getInstance();
        AppStatistics appstatistics = appStats;
        appstatistics.getClass();
        asFriend = new com.kofax.kmc.kut.utilities.appstats.AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
        appStatsDataStore = asFriend.getAppStatsDataStore();
    }
}

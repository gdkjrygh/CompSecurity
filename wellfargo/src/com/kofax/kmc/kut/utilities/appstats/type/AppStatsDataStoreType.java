// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsDataStoreType extends Enum
{

    public static final AppStatsDataStoreType DS_GREENDAO;
    public static final AppStatsDataStoreType DS_ORMLITE;
    public static final AppStatsDataStoreType DS_SQLITE;
    private static final AppStatsDataStoreType a[];

    private AppStatsDataStoreType(String s, int i)
    {
        super(s, i);
    }

    public static AppStatsDataStoreType valueOf(String s)
    {
        return (AppStatsDataStoreType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsDataStoreType, s);
    }

    public static AppStatsDataStoreType[] values()
    {
        return (AppStatsDataStoreType[])a.clone();
    }

    static 
    {
        DS_GREENDAO = new AppStatsDataStoreType("DS_GREENDAO", 0);
        DS_ORMLITE = new AppStatsDataStoreType("DS_ORMLITE", 1);
        DS_SQLITE = new AppStatsDataStoreType("DS_SQLITE", 2);
        a = (new AppStatsDataStoreType[] {
            DS_GREENDAO, DS_ORMLITE, DS_SQLITE
        });
    }
}

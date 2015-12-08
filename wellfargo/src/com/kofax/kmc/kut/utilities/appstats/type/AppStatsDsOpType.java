// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsDsOpType extends Enum
{

    public static final AppStatsDsOpType APP_STATS_DS_INSERT;
    public static final AppStatsDsOpType APP_STATS_DS_NONE;
    public static final AppStatsDsOpType APP_STATS_DS_UPDATE;
    private static final AppStatsDsOpType a[];

    private AppStatsDsOpType(String s, int i)
    {
        super(s, i);
    }

    public static AppStatsDsOpType valueOf(String s)
    {
        return (AppStatsDsOpType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsDsOpType, s);
    }

    public static AppStatsDsOpType[] values()
    {
        return (AppStatsDsOpType[])a.clone();
    }

    static 
    {
        APP_STATS_DS_NONE = new AppStatsDsOpType("APP_STATS_DS_NONE", 0);
        APP_STATS_DS_INSERT = new AppStatsDsOpType("APP_STATS_DS_INSERT", 1);
        APP_STATS_DS_UPDATE = new AppStatsDsOpType("APP_STATS_DS_UPDATE", 2);
        a = (new AppStatsDsOpType[] {
            APP_STATS_DS_NONE, APP_STATS_DS_INSERT, APP_STATS_DS_UPDATE
        });
    }
}

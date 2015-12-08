// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsDbFieldKeyType extends Enum
{

    public static final AppStatsDbFieldKeyType DB_FIELD_FOREIGN_KEY;
    public static final AppStatsDbFieldKeyType DB_FIELD_NO_KEY;
    public static final AppStatsDbFieldKeyType DB_FIELD_PRIMARY_KEY;
    private static final AppStatsDbFieldKeyType a[];

    private AppStatsDbFieldKeyType(String s, int i)
    {
        super(s, i);
    }

    public static AppStatsDbFieldKeyType valueOf(String s)
    {
        return (AppStatsDbFieldKeyType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsDbFieldKeyType, s);
    }

    public static AppStatsDbFieldKeyType[] values()
    {
        return (AppStatsDbFieldKeyType[])a.clone();
    }

    static 
    {
        DB_FIELD_NO_KEY = new AppStatsDbFieldKeyType("DB_FIELD_NO_KEY", 0);
        DB_FIELD_PRIMARY_KEY = new AppStatsDbFieldKeyType("DB_FIELD_PRIMARY_KEY", 1);
        DB_FIELD_FOREIGN_KEY = new AppStatsDbFieldKeyType("DB_FIELD_FOREIGN_KEY", 2);
        a = (new AppStatsDbFieldKeyType[] {
            DB_FIELD_NO_KEY, DB_FIELD_PRIMARY_KEY, DB_FIELD_FOREIGN_KEY
        });
    }
}

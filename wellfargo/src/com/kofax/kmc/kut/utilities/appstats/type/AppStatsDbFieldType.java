// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsDbFieldType extends Enum
{

    public static final AppStatsDbFieldType DB_FIELD_TYPE_DATETIME;
    public static final AppStatsDbFieldType DB_FIELD_TYPE_FLOAT;
    public static final AppStatsDbFieldType DB_FIELD_TYPE_GUID;
    public static final AppStatsDbFieldType DB_FIELD_TYPE_INTEGER;
    public static final AppStatsDbFieldType DB_FIELD_TYPE_NONE;
    public static final AppStatsDbFieldType DB_FIELD_TYPE_TEXT;
    private static final AppStatsDbFieldType a[];

    private AppStatsDbFieldType(String s, int i)
    {
        super(s, i);
    }

    public static AppStatsDbFieldType valueOf(String s)
    {
        return (AppStatsDbFieldType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsDbFieldType, s);
    }

    public static AppStatsDbFieldType[] values()
    {
        return (AppStatsDbFieldType[])a.clone();
    }

    static 
    {
        DB_FIELD_TYPE_NONE = new AppStatsDbFieldType("DB_FIELD_TYPE_NONE", 0);
        DB_FIELD_TYPE_TEXT = new AppStatsDbFieldType("DB_FIELD_TYPE_TEXT", 1);
        DB_FIELD_TYPE_INTEGER = new AppStatsDbFieldType("DB_FIELD_TYPE_INTEGER", 2);
        DB_FIELD_TYPE_DATETIME = new AppStatsDbFieldType("DB_FIELD_TYPE_DATETIME", 3);
        DB_FIELD_TYPE_FLOAT = new AppStatsDbFieldType("DB_FIELD_TYPE_FLOAT", 4);
        DB_FIELD_TYPE_GUID = new AppStatsDbFieldType("DB_FIELD_TYPE_GUID", 5);
        a = (new AppStatsDbFieldType[] {
            DB_FIELD_TYPE_NONE, DB_FIELD_TYPE_TEXT, DB_FIELD_TYPE_INTEGER, DB_FIELD_TYPE_DATETIME, DB_FIELD_TYPE_FLOAT, DB_FIELD_TYPE_GUID
        });
    }
}

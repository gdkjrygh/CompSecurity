// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsDsFieldType extends Enum
{

    public static final AppStatsDsFieldType DS_FIELD_TYPE_DATE;
    public static final AppStatsDsFieldType DS_FIELD_TYPE_FLOAT;
    public static final AppStatsDsFieldType DS_FIELD_TYPE_INTEGER;
    public static final AppStatsDsFieldType DS_FIELD_TYPE_LONG;
    public static final AppStatsDsFieldType DS_FIELD_TYPE_NONE;
    public static final AppStatsDsFieldType DS_FIELD_TYPE_STRING;
    private static final AppStatsDsFieldType a[];

    private AppStatsDsFieldType(String s, int i)
    {
        super(s, i);
    }

    public static AppStatsDsFieldType valueOf(String s)
    {
        return (AppStatsDsFieldType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsDsFieldType, s);
    }

    public static AppStatsDsFieldType[] values()
    {
        return (AppStatsDsFieldType[])a.clone();
    }

    static 
    {
        DS_FIELD_TYPE_NONE = new AppStatsDsFieldType("DS_FIELD_TYPE_NONE", 0);
        DS_FIELD_TYPE_STRING = new AppStatsDsFieldType("DS_FIELD_TYPE_STRING", 1);
        DS_FIELD_TYPE_INTEGER = new AppStatsDsFieldType("DS_FIELD_TYPE_INTEGER", 2);
        DS_FIELD_TYPE_DATE = new AppStatsDsFieldType("DS_FIELD_TYPE_DATE", 3);
        DS_FIELD_TYPE_LONG = new AppStatsDsFieldType("DS_FIELD_TYPE_LONG", 4);
        DS_FIELD_TYPE_FLOAT = new AppStatsDsFieldType("DS_FIELD_TYPE_FLOAT", 5);
        a = (new AppStatsDsFieldType[] {
            DS_FIELD_TYPE_NONE, DS_FIELD_TYPE_STRING, DS_FIELD_TYPE_INTEGER, DS_FIELD_TYPE_DATE, DS_FIELD_TYPE_LONG, DS_FIELD_TYPE_FLOAT
        });
    }
}

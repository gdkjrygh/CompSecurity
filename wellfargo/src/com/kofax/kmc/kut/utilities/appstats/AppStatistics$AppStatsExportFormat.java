// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


public final class  extends Enum
{

    public static final EXP_FORMAT_APP_DEFINED EXP_FORMAT_APP_DEFINED;
    public static final EXP_FORMAT_APP_DEFINED EXP_FORMAT_JSON;
    public static final EXP_FORMAT_APP_DEFINED EXP_FORMAT_SQL_SERVER;
    private static final EXP_FORMAT_APP_DEFINED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatistics$AppStatsExportFormat, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        EXP_FORMAT_SQL_SERVER = new <init>("EXP_FORMAT_SQL_SERVER", 0);
        EXP_FORMAT_JSON = new <init>("EXP_FORMAT_JSON", 1);
        EXP_FORMAT_APP_DEFINED = new <init>("EXP_FORMAT_APP_DEFINED", 2);
        a = (new a[] {
            EXP_FORMAT_SQL_SERVER, EXP_FORMAT_JSON, EXP_FORMAT_APP_DEFINED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

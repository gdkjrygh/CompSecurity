// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsOCRType extends Enum
{

    public static final AppStatsOCRType OCR_FULLPAGE;
    public static final AppStatsOCRType OCR_ZONAL;
    private static final String a = "AppStatsOCRType";
    private static final AppStatsOCRType c[];
    private final String b;

    private AppStatsOCRType(String s, int i, String s1)
    {
        super(s, i);
        b = s1;
    }

    public static AppStatsOCRType valueOf(String s)
    {
        return (AppStatsOCRType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsOCRType, s);
    }

    public static AppStatsOCRType[] values()
    {
        return (AppStatsOCRType[])c.clone();
    }

    public String getOCRDescription()
    {
        return b;
    }

    static 
    {
        OCR_ZONAL = new AppStatsOCRType("OCR_ZONAL", 0, "Zonal OCR");
        OCR_FULLPAGE = new AppStatsOCRType("OCR_FULLPAGE", 1, "Full Page OCR");
        c = (new AppStatsOCRType[] {
            OCR_ZONAL, OCR_FULLPAGE
        });
    }
}

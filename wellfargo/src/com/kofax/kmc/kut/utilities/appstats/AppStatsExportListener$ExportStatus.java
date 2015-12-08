// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


public final class  extends Enum
{

    public static final FAILED COMPLETE;
    public static final FAILED EXPORTING;
    public static final FAILED FAILED;
    private static final FAILED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatsExportListener$ExportStatus, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        EXPORTING = new <init>("EXPORTING", 0);
        COMPLETE = new <init>("COMPLETE", 1);
        FAILED = new <init>("FAILED", 2);
        a = (new a[] {
            EXPORTING, COMPLETE, FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

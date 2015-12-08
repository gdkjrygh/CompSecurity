// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


public final class  extends Enum
{

    public static final WRITE_STATUS_FAILED WRITE_STATUS_COMPLETE;
    public static final WRITE_STATUS_FAILED WRITE_STATUS_FAILED;
    public static final WRITE_STATUS_FAILED WRITE_STATUS_WRITING;
    private static final WRITE_STATUS_FAILED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatsWriteFileListener$WriteFileStatus, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        WRITE_STATUS_WRITING = new <init>("WRITE_STATUS_WRITING", 0);
        WRITE_STATUS_COMPLETE = new <init>("WRITE_STATUS_COMPLETE", 1);
        WRITE_STATUS_FAILED = new <init>("WRITE_STATUS_FAILED", 2);
        a = (new a[] {
            WRITE_STATUS_WRITING, WRITE_STATUS_COMPLETE, WRITE_STATUS_FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

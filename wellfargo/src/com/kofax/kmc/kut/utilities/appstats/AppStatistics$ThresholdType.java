// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


public final class  extends Enum
{

    public static final THRESH_TYPE_FILE THRESH_TYPE_FILE;
    public static final THRESH_TYPE_FILE THRESH_TYPE_RAM;
    private static final THRESH_TYPE_FILE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatistics$ThresholdType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        THRESH_TYPE_RAM = new <init>("THRESH_TYPE_RAM", 0);
        THRESH_TYPE_FILE = new <init>("THRESH_TYPE_FILE", 1);
        a = (new a[] {
            THRESH_TYPE_RAM, THRESH_TYPE_FILE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

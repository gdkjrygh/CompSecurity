// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


public final class  extends Enum
{

    public static final VERBOSE DEBUG;
    public static final VERBOSE ERROR;
    public static final VERBOSE VERBOSE;
    private static final VERBOSE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kui/uicontrols/BusEvents$LogEvent$Level, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0);
        ERROR = new <init>("ERROR", 1);
        VERBOSE = new <init>("VERBOSE", 2);
        a = (new a[] {
            DEBUG, ERROR, VERBOSE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

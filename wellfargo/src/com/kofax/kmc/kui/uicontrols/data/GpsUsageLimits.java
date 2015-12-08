// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public final class GpsUsageLimits extends Enum
{

    public static final GpsUsageLimits ALWAYS_USE_IF_ENABLED;
    public static final GpsUsageLimits NEVER_USE;
    private static final GpsUsageLimits a[];

    private GpsUsageLimits(String s, int i)
    {
        super(s, i);
    }

    public static GpsUsageLimits valueOf(String s)
    {
        return (GpsUsageLimits)Enum.valueOf(com/kofax/kmc/kui/uicontrols/data/GpsUsageLimits, s);
    }

    public static GpsUsageLimits[] values()
    {
        return (GpsUsageLimits[])a.clone();
    }

    static 
    {
        NEVER_USE = new GpsUsageLimits("NEVER_USE", 0);
        ALWAYS_USE_IF_ENABLED = new GpsUsageLimits("ALWAYS_USE_IF_ENABLED", 1);
        a = (new GpsUsageLimits[] {
            NEVER_USE, ALWAYS_USE_IF_ENABLED
        });
    }
}

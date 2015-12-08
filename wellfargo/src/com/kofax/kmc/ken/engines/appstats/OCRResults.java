// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsOCRType;

public class OCRResults
{

    private int a;
    private AppStatsOCRType b;
    private long c;
    private long d;

    public OCRResults()
    {
    }

    public AppStatsOCRType getEventType()
    {
        return b;
    }

    public int getResultCode()
    {
        return a;
    }

    public long getStopTime(long l)
    {
        return d;
    }

    public void setOCREventType(AppStatsOCRType appstatsocrtype)
    {
        b = appstatsocrtype;
    }

    public void setResultCode(int i)
    {
        a = i;
    }

    public void setStopTime(long l)
    {
        d = l;
    }
}

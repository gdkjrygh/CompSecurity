// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import java.util.EventObject;

public class AppStatsThresholdReachedEvent extends EventObject
{

    private static final long serialVersionUID = 0x6b5e08628f559c45L;
    private AppStatistics.ThresholdType a;
    private long b;

    public AppStatsThresholdReachedEvent(Object obj, AppStatistics.ThresholdType thresholdtype, long l)
    {
        super(obj);
        a = thresholdtype;
        b = l;
    }

    public long getSize()
    {
        return b;
    }

    public AppStatistics.ThresholdType getThresholdType()
    {
        return a;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

class 
{

    static final int a[];

    static 
    {
        a = new int[AppStatsEventIDType.values().length];
        try
        {
            a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_FOCUS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_PAGEDETECT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_LEVELNESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_STABILITY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_EVENT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

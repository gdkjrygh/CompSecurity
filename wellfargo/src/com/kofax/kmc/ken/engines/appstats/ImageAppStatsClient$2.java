// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

class Type
{

    static final int a[];

    static 
    {
        a = new int[AppStatsEventIDType.values().length];
        try
        {
            a[AppStatsEventIDType.APP_STATS_IMAGE_CREATED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[AppStatsEventIDType.APP_STATS_IMAGE_ADD_TO_DOCUMENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

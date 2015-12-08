// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


class pStatsExportFormat
{

    static final int a[];

    static 
    {
        a = new int[pStatsExportFormat.values().length];
        try
        {
            a[pStatsExportFormat.EXP_FORMAT_SQL_SERVER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[pStatsExportFormat.EXP_FORMAT_JSON.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[pStatsExportFormat.EXP_FORMAT_APP_DEFINED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

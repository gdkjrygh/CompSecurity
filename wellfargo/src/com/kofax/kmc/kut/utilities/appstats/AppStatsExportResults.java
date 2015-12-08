// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class AppStatsExportResults
{

    private AppStatsExportListener.ExportStatus a;
    private ErrorInfo b;

    public AppStatsExportResults(ErrorInfo errorinfo, AppStatsExportListener.ExportStatus exportstatus)
    {
        b = errorinfo;
        a = exportstatus;
    }

    public AppStatsExportListener.ExportStatus getState()
    {
        return a;
    }

    public ErrorInfo isError()
    {
        return b;
    }

    public void setError(ErrorInfo errorinfo)
    {
        b = errorinfo;
    }

    public void setState(AppStatsExportListener.ExportStatus exportstatus)
    {
        a = exportstatus;
    }
}

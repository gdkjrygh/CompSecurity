// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class AppStatsWriteToFileResults
{

    private AppStatsWriteFileListener.WriteFileStatus a;
    private ErrorInfo b;

    public AppStatsWriteToFileResults(ErrorInfo errorinfo, AppStatsWriteFileListener.WriteFileStatus writefilestatus)
    {
        b = errorinfo;
        a = writefilestatus;
    }

    public AppStatsWriteFileListener.WriteFileStatus getState()
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

    public void setState(AppStatsWriteFileListener.WriteFileStatus writefilestatus)
    {
        a = writefilestatus;
    }
}

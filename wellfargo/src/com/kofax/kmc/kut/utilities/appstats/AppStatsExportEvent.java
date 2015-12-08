// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

public class AppStatsExportEvent extends EventObject
{

    private static final long serialVersionUID = 0x6b5e08628f559c45L;
    private AppStatsExportListener.ExportStatus a;
    private int b;
    private ErrorInfo c;

    public AppStatsExportEvent(Object obj, AppStatsExportListener.ExportStatus exportstatus, int i, ErrorInfo errorinfo)
    {
        super(obj);
        a = exportstatus;
        b = i;
        c = errorinfo;
    }

    public ErrorInfo getErrorInfo()
    {
        return c;
    }

    public AppStatsExportListener.ExportStatus getExportStatus()
    {
        return a;
    }

    public int getPercentComplete()
    {
        return b;
    }
}

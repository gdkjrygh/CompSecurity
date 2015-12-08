// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.error;

import com.kofax.kmc.kut.utilities.appstats.UtilitiesAppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.kut.utilities.error:
//            ErrorInfo

public class KmcException extends Exception
{

    private static UtilitiesAppStatsClient b = UtilitiesAppStatsClient.getInstance();
    private static final long serialVersionUID = 0x11c2fbef81e380fcL;
    private ErrorInfo a;

    public KmcException(ErrorInfo errorinfo)
    {
        super((new StringBuilder()).append(errorinfo.getErr()).append(": ").append(errorinfo.getErrMsg()).toString(), new Throwable(errorinfo.getErrDesc()));
        a = errorinfo;
        b.logAppStats(AppStatsEventIDType.APP_STATS_ERROR_LOG_EVENT, errorinfo);
    }

    public KmcException(ErrorInfo errorinfo, Throwable throwable)
    {
        super((new StringBuilder()).append(errorinfo.getErr()).append(": ").append(errorinfo.getErrMsg()).toString(), throwable);
        a = errorinfo;
        b.logAppStats(AppStatsEventIDType.APP_STATS_ERROR_LOG_EVENT, errorinfo);
    }

    public ErrorInfo getErrorInfo()
    {
        return a;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.error;

import com.kofax.kmc.kut.utilities.appstats.UtilitiesAppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.kut.utilities.error:
//            ErrorInfo

public class IllegalThreadStateException extends IllegalThreadStateException
{

    private static final long serialVersionUID = 0x7ba41703d851ac68L;

    public IllegalThreadStateException(String s)
    {
        super(s);
        ErrorInfo errorinfo = ErrorInfo.KMC_GN_ILLEGAL_THREAD_STATE_EXCEPTION;
        errorinfo.setErrCause(s);
        UtilitiesAppStatsClient.getInstance().logAppStats(AppStatsEventIDType.APP_STATS_ERROR_LOG_EVENT, errorinfo);
    }
}

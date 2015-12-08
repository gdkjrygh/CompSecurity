// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.error;

import com.kofax.kmc.kut.utilities.appstats.UtilitiesAppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.kut.utilities.error:
//            IOException, ErrorInfo

public class FileNotFoundException extends IOException
{

    private static final long serialVersionUID = 0x32a306b2d548be1bL;

    public FileNotFoundException(java.io.FileNotFoundException filenotfoundexception)
    {
        super(filenotfoundexception);
        a(filenotfoundexception.getMessage());
    }

    public FileNotFoundException(String s)
    {
        super(s);
        a(s);
    }

    private void a(String s)
    {
        ErrorInfo errorinfo = ErrorInfo.KMC_GN_FILE_NOT_FOUND_EXCEPTION;
        errorinfo.setErrCause(s);
        UtilitiesAppStatsClient.getInstance().logAppStats(AppStatsEventIDType.APP_STATS_ERROR_LOG_EVENT, errorinfo);
    }
}

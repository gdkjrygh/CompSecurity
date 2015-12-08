// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsClientEventLogger, UtilitiesAppStatsClient

class a
    implements AppStatsClientEventLogger
{

    final ErrorInfo a;
    final UtilitiesAppStatsClient b;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            b.setEventId(appstatseventidtype);
            break;
        }
        UtilitiesAppStatsClient.a(b, a);
    }

    (UtilitiesAppStatsClient utilitiesappstatsclient, ErrorInfo errorinfo)
    {
        b = utilitiesappstatsclient;
        a = errorinfo;
        super();
    }
}

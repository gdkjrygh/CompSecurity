// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsClientEventLogger, UtilitiesAppStatsClient

class b
    implements AppStatsClientEventLogger
{

    final boolean a;
    final String b;
    final UtilitiesAppStatsClient c;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 5: // '\005'
            c.setEventId(appstatseventidtype);
            break;
        }
        UtilitiesAppStatsClient.a(c, a, b);
    }

    (UtilitiesAppStatsClient utilitiesappstatsclient, boolean flag, String s)
    {
        c = utilitiesappstatsclient;
        a = flag;
        b = s;
        super();
    }
}

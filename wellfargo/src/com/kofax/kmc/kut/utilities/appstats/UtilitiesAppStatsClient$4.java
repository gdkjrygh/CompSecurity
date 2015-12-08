// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsClientEventLogger, UtilitiesAppStatsClient, AppStatsSessionEvent

class a
    implements AppStatsClientEventLogger
{

    final AppStatsSessionEvent a;
    final UtilitiesAppStatsClient b;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 4: // '\004'
            b.setEventId(appstatseventidtype);
            break;
        }
        UtilitiesAppStatsClient.a(b, a);
    }

    (UtilitiesAppStatsClient utilitiesappstatsclient, AppStatsSessionEvent appstatssessionevent)
    {
        b = utilitiesappstatsclient;
        a = appstatssessionevent;
        super();
    }
}

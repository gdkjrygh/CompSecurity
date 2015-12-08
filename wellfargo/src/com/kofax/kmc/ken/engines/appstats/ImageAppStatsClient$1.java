// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.ken.engines.appstats:
//            ImageAppStatsClient, AppStatsImageData

class a
    implements AppStatsClientEventLogger
{

    final AppStatsImageData a;
    final ImageAppStatsClient b;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            ImageAppStatsClient.a(b, appstatseventidtype);
            b.logAppStatsImageStartEvent(a);
            return;

        case 2: // '\002'
            ImageAppStatsClient.b(b, appstatseventidtype);
            break;
        }
        ImageAppStatsClient.a(b, a);
    }

    Type(ImageAppStatsClient imageappstatsclient, AppStatsImageData appstatsimagedata)
    {
        b = imageappstatsclient;
        a = appstatsimagedata;
        super();
    }
}

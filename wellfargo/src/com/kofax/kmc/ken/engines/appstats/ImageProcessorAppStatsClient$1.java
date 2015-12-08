// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.ken.engines.appstats:
//            ImageProcessorAppStatsClient, AppStatsImageProcessorData

class a
    implements AppStatsClientEventLogger
{

    final AppStatsImageProcessorData a;
    final ImageProcessorAppStatsClient b;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            ImageProcessorAppStatsClient.a(b, appstatseventidtype);
            b.logAppStatsImgProcessingStartEvent(a);
            return;

        case 2: // '\002'
            ImageProcessorAppStatsClient.b(b, appstatseventidtype);
            break;
        }
        ImageProcessorAppStatsClient.a(b, a);
    }

    (ImageProcessorAppStatsClient imageprocessorappstatsclient, AppStatsImageProcessorData appstatsimageprocessordata)
    {
        b = imageprocessorappstatsclient;
        a = appstatsimageprocessordata;
        super();
    }
}

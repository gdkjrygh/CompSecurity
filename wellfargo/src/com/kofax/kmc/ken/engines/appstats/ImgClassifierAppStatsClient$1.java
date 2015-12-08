// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.ken.engines.appstats:
//            ImgClassifierAppStatsClient

class a
    implements AppStatsClientEventLogger
{

    final String a;
    final ImgClassifierAppStatsClient b;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            ImgClassifierAppStatsClient.a(b, appstatseventidtype);
            break;
        }
        ImgClassifierAppStatsClient.a(b, a);
    }

    (ImgClassifierAppStatsClient imgclassifierappstatsclient, String s)
    {
        b = imgclassifierappstatsclient;
        a = s;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import java.util.List;

// Referenced classes of package com.kofax.kmc.ken.engines.appstats:
//            ImgClassifierAppStatsClient

class b
    implements AppStatsClientEventLogger
{

    final List a;
    final String b;
    final ImgClassifierAppStatsClient c;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
            ImgClassifierAppStatsClient.b(c, appstatseventidtype);
            break;
        }
        ImgClassifierAppStatsClient.a(c, a, b);
    }

    (ImgClassifierAppStatsClient imgclassifierappstatsclient, List list, String s)
    {
        c = imgclassifierappstatsclient;
        a = list;
        b = s;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsClientEventLogger, PropChangeAppStatsClient

class b
    implements AppStatsClientEventLogger
{

    final String a;
    final String b;
    final PropChangeAppStatsClient c;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        a[appstatseventidtype.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!a.equals(b))
        {
            c.setEventId(appstatseventidtype);
            PropChangeAppStatsClient.a(c);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    (PropChangeAppStatsClient propchangeappstatsclient, String s, String s1)
    {
        c = propchangeappstatsclient;
        a = s;
        b = s1;
        super();
    }
}

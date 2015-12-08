// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, TrackingPingAuthenticationSettings, VmapAdBreak, bj, 
//            bf

public class bg
    implements r
{

    private List a;
    private TrackingPingAuthenticationSettings b;

    public bg()
    {
        a = new ArrayList();
        b = TrackingPingAuthenticationSettings.NO_TRACKING_AUTH_SETTINGS;
    }

    public final bf a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((VmapAdBreak)iterator.next()).buildUpon().a(b).a())) { }
        return new bf(arraylist);
    }

    public final bg a(TrackingPingAuthenticationSettings trackingpingauthenticationsettings)
    {
        b = (TrackingPingAuthenticationSettings)c.a(trackingpingauthenticationsettings);
        return this;
    }

    public final bg a(VmapAdBreak vmapadbreak)
    {
        a.add(vmapadbreak);
        return this;
    }

    public final bg a(List list)
    {
        a = list;
        return this;
    }

    public Object build()
    {
        return a();
    }
}

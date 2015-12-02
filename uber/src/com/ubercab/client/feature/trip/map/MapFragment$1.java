// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import fte;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            MapFragment

final class a
    implements Runnable
{

    final MapFragment a;

    public final void run()
    {
        boolean flag;
        if (!MapFragment.a(a, a.j.g()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.a(flag);
    }

    (MapFragment mapfragment)
    {
        a = mapfragment;
        super();
    }
}

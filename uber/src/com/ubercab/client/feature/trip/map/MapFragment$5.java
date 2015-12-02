// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;


// Referenced classes of package com.ubercab.client.feature.trip.map:
//            MapFragment

final class a
    implements Runnable
{

    final MapFragment a;

    public final void run()
    {
        while (!a.isAdded() || !MapFragment.c(a)) 
        {
            return;
        }
        MapFragment.d(a);
        MapFragment.e(a);
        MapFragment.f(a);
    }

    (MapFragment mapfragment)
    {
        a = mapfragment;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import cjo;
import com.ubercab.android.map.MapView;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            MapFragment

final class a
    implements cjo
{

    final MapFragment a;

    public final void a()
    {
        if (MapFragment.c(a))
        {
            MapFragment.d(a);
            a.mViewMap.post(new Runnable() {

                final MapFragment._cls4 a;

                public final void run()
                {
                    MapFragment.e(a.a);
                    MapFragment.f(a.a);
                }

            
            {
                a = MapFragment._cls4.this;
                super();
            }
            });
        }
    }

    public final void b()
    {
        if (MapFragment.c(a))
        {
            MapFragment.d(a);
            MapFragment.e(a);
            MapFragment.f(a);
        }
    }

    _cls1.a(MapFragment mapfragment)
    {
        a = mapfragment;
        super();
    }
}

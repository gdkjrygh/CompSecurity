// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import cjo;
import com.ubercab.android.map.MapView;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            MapFragment

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        MapFragment.e(a.a);
        MapFragment.f(a.a);
    }

    _cls9(_cls9 _pcls9)
    {
        a = _pcls9;
        super();
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/map/MapFragment$4

/* anonymous class */
    final class MapFragment._cls4
        implements cjo
    {

        final MapFragment a;

        public final void a()
        {
            if (MapFragment.c(a))
            {
                MapFragment.d(a);
                a.mViewMap.post(new MapFragment._cls4._cls1(this));
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

            
            {
                a = mapfragment;
                super();
            }
    }

}

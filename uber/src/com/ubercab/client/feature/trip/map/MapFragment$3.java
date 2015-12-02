// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import cjn;
import cjw;
import cka;
import com.ubercab.client.feature.map.MapViewExtension;
import dbf;
import eeg;
import eei;
import gmg;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            MapFragment

final class a
    implements cka
{

    final MapFragment a;

    public final void a(cjn cjn1)
    {
        a.s = cjn1;
        cjn1.a(a);
        cjn1.a(a);
        cjn1.a(a);
        boolean flag;
        if (!a.f.b(dbf.bX))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cjn1.a(flag);
        cjn1.d();
        cjn1.e();
        if (!a.f.b(dbf.bP))
        {
            cjn1.b(true);
        }
        if (cjn1.c() != null)
        {
            cjn1.c().d();
            cjn1.c().b(true);
            cjn1.c().f();
            cjn1.c().h();
            cjn1.c().g();
            cjn1.c().e();
            cjn1.c().i();
            a.mViewMapExtension.a(a);
            a.mViewMapExtension.a(a);
            MapViewExtension mapviewextension = a.mViewMapExtension;
            Object obj;
            if (a.f.b(dbf.bH))
            {
                obj = new eei();
            } else
            {
                obj = new eeg(a.getActivity());
            }
            mapviewextension.a(((eej) (obj)));
            MapFragment.a(a, cjn1, MapFragment.a(a));
            MapFragment.b(a, cjn1, MapFragment.a(a));
            if (MapFragment.b(a))
            {
                a.q();
                return;
            }
        }
    }

    (MapFragment mapfragment)
    {
        a = mapfragment;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.view.View;
import android.view.ViewTreeObserver;
import dbf;
import dbn;
import fqf;
import gmg;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

final class a
    implements android.view.r.OnPreDrawListener
{

    final View a;
    final TripFragment b;

    public final boolean onPreDraw()
    {
        if (!b.k.a(dbf.bZ, dbn.a)) goto _L2; else goto _L1
_L1:
        TripFragment.a(b, fqf.a);
_L4:
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
_L2:
        if (b.k.a(dbf.bZ, dbn.b))
        {
            TripFragment.a(b, fqf.b);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (TripFragment tripfragment, View view)
    {
        b = tripfragment;
        a = view;
        super();
    }
}

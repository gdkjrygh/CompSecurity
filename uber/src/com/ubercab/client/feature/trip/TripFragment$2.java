// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import chp;
import fte;
import n;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

final class a
    implements android.widget.ismissListener
{

    final TripFragment a;

    public final void onDismiss()
    {
        a.d.a(n.dt);
        a.E.a(false);
    }

    (TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }
}

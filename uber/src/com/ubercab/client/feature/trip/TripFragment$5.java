// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.view.View;
import dsy;
import fte;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

final class a extends dsy
{

    final TripFragment a;

    public final void onViewAttachedToWindow(View view)
    {
        if (a.E.c())
        {
            TripFragment.b(a);
        }
    }

    (TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }
}

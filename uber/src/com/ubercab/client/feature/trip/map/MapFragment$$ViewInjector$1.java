// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            MapFragment

final class a extends DebouncingOnClickListener
{

    final MapFragment a;
    final nButton b;

    public final void doClick(View view)
    {
        a.onClickMyLocationButton();
    }

    ( , MapFragment mapfragment)
    {
        b = ;
        a = mapfragment;
        super();
    }
}

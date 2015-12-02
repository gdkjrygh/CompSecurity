// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.view.View;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            GuidedPickupBannerView

final class a
    implements android.view.er
{

    final GuidedPickupBannerView a;

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        view.removeOnLayoutChangeListener(this);
        a.a();
    }

    (GuidedPickupBannerView guidedpickupbannerview)
    {
        a = guidedpickupbannerview;
        super();
    }
}

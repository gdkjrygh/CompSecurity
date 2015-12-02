// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            GuidedPickupBannerView

final class a extends AnimatorListenerAdapter
{

    final GuidedPickupBannerView a;

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(4);
        GuidedPickupBannerView.d(a);
    }

    public final void onAnimationStart(Animator animator)
    {
        GuidedPickupBannerView.c(a);
    }

    (GuidedPickupBannerView guidedpickupbannerview)
    {
        a = guidedpickupbannerview;
        super();
    }
}

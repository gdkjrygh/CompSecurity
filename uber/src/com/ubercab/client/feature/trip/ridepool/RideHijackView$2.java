// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ViewSwitcher;

// Referenced classes of package com.ubercab.client.feature.trip.ridepool:
//            RideHijackView

final class a extends AnimatorListenerAdapter
{

    final RideHijackView a;

    public final void onAnimationEnd(Animator animator)
    {
        a.mMemoViewSwitcher.setVisibility(8);
    }

    (RideHijackView ridehijackview)
    {
        a = ridehijackview;
        super();
    }
}

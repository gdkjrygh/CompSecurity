// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.summary;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.ubercab.client.feature.trip.summary:
//            TripSummaryView, TripSummaryTabView

final class a extends AnimatorListenerAdapter
{

    final TripSummaryView a;

    public final void onAnimationEnd(Animator animator)
    {
        a.mFareTabView.setVisibility(8);
        a.mLeftDivider.setVisibility(8);
    }

    (TripSummaryView tripsummaryview)
    {
        a = tripsummaryview;
        super();
    }
}

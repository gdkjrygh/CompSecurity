// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.summary;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.feature.trip.summary:
//            TripSummaryView, TripSummaryTabView

final class a
    implements android.animation.atorUpdateListener
{

    final TripSummaryView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.mCapacityTabView.a(((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    (TripSummaryView tripsummaryview)
    {
        a = tripsummaryview;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.prediction;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.trip.prediction:
//            DestinationPredictionView

final class a extends AnimatorListenerAdapter
{

    final DestinationPredictionView a;

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator)
    {
        a.setPivotX(a.getMeasuredWidth() / 2);
        a.setPivotY(a.getMeasuredHeight() / 8);
    }

    (DestinationPredictionView destinationpredictionview)
    {
        a = destinationpredictionview;
        super();
    }
}

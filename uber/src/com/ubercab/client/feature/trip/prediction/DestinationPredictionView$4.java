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

    public final void onAnimationStart(Animator animator)
    {
        if (DestinationPredictionView.c(a) || DestinationPredictionView.d(a))
        {
            int i = android.view.Spec(0, 0);
            int k = android.view.Spec(0, 0);
            a.measure(i, k);
            DestinationPredictionView.e(a);
            DestinationPredictionView.f(a);
        }
        int j = a.getMeasuredWidth() / 2;
        a.setAlpha(0.0F);
        a.setPivotX(j);
        a.setPivotY(0.0F);
        a.setTranslationY(DestinationPredictionView.g(a));
        a.setVisibility(0);
    }

    (DestinationPredictionView destinationpredictionview)
    {
        a = destinationpredictionview;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.pickup.view:
//            WalkingEstimatorCircleView

final class a extends AnimatorListenerAdapter
{

    final WalkingEstimatorCircleView a;

    public final void onAnimationEnd(Animator animator)
    {
        WalkingEstimatorCircleView.a(a);
        WalkingEstimatorCircleView.b(a);
        WalkingEstimatorCircleView.c(a);
    }

    public final void onAnimationStart(Animator animator)
    {
        WalkingEstimatorCircleView.d(a);
    }

    I(WalkingEstimatorCircleView walkingestimatorcircleview)
    {
        a = walkingestimatorcircleview;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.feature.pickup.view:
//            WalkingEstimatorCircleView

final class a
    implements android.animation.istener
{

    final WalkingEstimatorCircleView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.setRotation(((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    I(WalkingEstimatorCircleView walkingestimatorcircleview)
    {
        a = walkingestimatorcircleview;
        super();
    }
}

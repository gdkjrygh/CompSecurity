// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity

class aj
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final View a;
    final ShuffleLoadingActivity b;

    aj(ShuffleLoadingActivity shuffleloadingactivity, View view)
    {
        b = shuffleloadingactivity;
        a = view;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        valueanimator = (PointF)valueanimator.getAnimatedValue();
        a.setX(((PointF) (valueanimator)).x);
        a.setY(((PointF) (valueanimator)).y);
    }
}

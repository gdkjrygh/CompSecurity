// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import com.nineoldandroids.animation.ValueAnimator;

// Referenced classes of package com.weather.Weather.ui:
//            TwcDynamicListView

class this._cls0
    implements com.nineoldandroids.animation.rUpdateListener
{

    final TwcDynamicListView this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        invalidate();
    }

    AnimatorUpdateListener()
    {
        this$0 = TwcDynamicListView.this;
        super();
    }
}

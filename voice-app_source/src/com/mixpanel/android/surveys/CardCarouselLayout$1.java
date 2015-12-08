// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout

class val.viewShowing
    implements android.view.animation.stener
{

    final CardCarouselLayout this$0;
    private final View val$viewShowing;

    public void onAnimationEnd(Animation animation)
    {
        val$viewShowing.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = final_cardcarousellayout;
        val$viewShowing = View.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tooltip;

import android.view.animation.Animation;

// Referenced classes of package com.contextlogic.wish.ui.components.tooltip:
//            SlidingTooltip

class this._cls0
    implements android.view.animation.onListener
{

    final SlidingTooltip this$0;

    public void onAnimationEnd(Animation animation)
    {
        setVisibility(4);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = SlidingTooltip.this;
        super();
    }
}

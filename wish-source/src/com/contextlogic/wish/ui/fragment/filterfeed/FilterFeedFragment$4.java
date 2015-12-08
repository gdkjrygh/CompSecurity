// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.view.animation.Animation;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFragment

class val.hiddenTabBarOffset
    implements android.view.animation.stener
{

    final FilterFeedFragment this$0;
    final int val$hiddenTabBarOffset;

    public void onAnimationEnd(Animation animation)
    {
        setTabBarStripOffset(val$hiddenTabBarOffset);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = final_filterfeedfragment;
        val$hiddenTabBarOffset = I.this;
        super();
    }
}

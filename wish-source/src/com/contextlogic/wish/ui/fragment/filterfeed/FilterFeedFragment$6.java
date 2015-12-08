// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.view.animation.Animation;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFragment, FilterFeedFilterView

class this._cls0
    implements android.view.animation.stener
{

    final FilterFeedFragment this$0;

    public void onAnimationEnd(Animation animation)
    {
        FilterFeedFragment.access$100(FilterFeedFragment.this);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        FilterFeedFragment.access$800(FilterFeedFragment.this).prepareToShow(FilterFeedFragment.access$700(FilterFeedFragment.this));
        FilterFeedFragment.access$800(FilterFeedFragment.this).resync();
        FilterFeedFragment.access$800(FilterFeedFragment.this).setVisibility(0);
    }

    ()
    {
        this$0 = FilterFeedFragment.this;
        super();
    }
}

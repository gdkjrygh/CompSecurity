// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.view.animation.Animation;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFragment, FilterFeedProductSelectedFiltersView

class this._cls0
    implements android.view.animation.tener
{

    final FilterFeedFragment this$0;

    public void onAnimationEnd(Animation animation)
    {
        FilterFeedFragment.access$1000(FilterFeedFragment.this).setVisibility(8);
        FilterFeedFragment.access$1300(FilterFeedFragment.this);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    tedFiltersView()
    {
        this$0 = FilterFeedFragment.this;
        super();
    }
}

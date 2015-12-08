// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFragment

class this._cls0
    implements android.support.v4.view.eListener
{

    final FilterFeedFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
        if (i == 0)
        {
            FilterFeedFragment.access$300(FilterFeedFragment.this);
            return;
        } else
        {
            FilterFeedFragment.access$400(FilterFeedFragment.this);
            return;
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (FilterFeedFragment.access$000(FilterFeedFragment.this).getAnimation() == null)
        {
            showTabBarStrip(true);
        }
        FilterFeedFragment.access$100(FilterFeedFragment.this);
    }

    public void onPageSelected(int i)
    {
        FilterFeedFragment.access$200(FilterFeedFragment.this, i);
    }

    ()
    {
        this$0 = FilterFeedFragment.this;
        super();
    }
}

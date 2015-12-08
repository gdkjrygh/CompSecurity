// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import com.astuetz.PagerSlidingTabStrip;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFilterView

class val.tabStrip
    implements android.support.v4.view.istener
{

    final FilterFeedFilterView this$0;
    final PagerSlidingTabStrip val$tabStrip;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        FilterFeedFilterView.access$100(FilterFeedFilterView.this, val$tabStrip);
    }

    I()
    {
        this$0 = final_filterfeedfilterview;
        val$tabStrip = PagerSlidingTabStrip.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFragment, FilterFeedPagerAdapter

class val.allowAnimate
    implements Runnable
{

    final FilterFeedFragment this$0;
    final boolean val$allowAnimate;

    public void run()
    {
        FilterFeedFragment.access$1400(FilterFeedFragment.this).refreshWishStates(val$allowAnimate);
    }

    ()
    {
        this$0 = final_filterfeedfragment;
        val$allowAnimate = Z.this;
        super();
    }
}

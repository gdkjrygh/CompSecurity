// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;

import com.contextlogic.wish.api.data.WishRatingSummary;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.ratings:
//            RatingsFragment

class val.nextOffset
    implements Runnable
{

    final val.nextOffset this$1;
    final ArrayList val$items;
    final int val$nextOffset;
    final boolean val$noMoreRatings;
    final int val$ratingsCount;
    final WishRatingSummary val$summary;

    public void run()
    {
        RatingsFragment.access$400(_fld0, val$summary, val$items, val$noMoreRatings, val$ratingsCount, val$nextOffset);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$summary = wishratingsummary;
        val$items = arraylist;
        val$noMoreRatings = flag;
        val$ratingsCount = i;
        val$nextOffset = I.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/ratings/RatingsFragment$7

/* anonymous class */
    class RatingsFragment._cls7
        implements com.contextlogic.wish.api.service.GetProductRatingsService.SuccessCallback
    {

        final RatingsFragment this$0;

        public void onServiceSucceeded(final WishRatingSummary summary, final ArrayList items, final int ratingsCount, int i, final boolean noMoreRatings)
        {
            RatingsFragment.access$302(RatingsFragment.this, true);
            postDelayed(i. new RatingsFragment._cls7._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
    }

}

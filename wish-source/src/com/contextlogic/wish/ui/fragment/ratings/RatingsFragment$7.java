// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;

import com.contextlogic.wish.api.data.WishRatingSummary;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.ratings:
//            RatingsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.ervice.SuccessCallback
{

    final RatingsFragment this$0;

    public void onServiceSucceeded(final WishRatingSummary summary, final ArrayList items, final int ratingsCount, final int nextOffset, final boolean noMoreRatings)
    {
        RatingsFragment.access$302(RatingsFragment.this, true);
        postDelayed(new Runnable() {

            final RatingsFragment._cls7 this$1;
            final ArrayList val$items;
            final int val$nextOffset;
            final boolean val$noMoreRatings;
            final int val$ratingsCount;
            final WishRatingSummary val$summary;

            public void run()
            {
                RatingsFragment.access$400(this$0, summary, items, noMoreRatings, ratingsCount, nextOffset);
            }

            
            {
                this$1 = RatingsFragment._cls7.this;
                summary = wishratingsummary;
                items = arraylist;
                noMoreRatings = flag;
                ratingsCount = i;
                nextOffset = j;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.nextOffset()
    {
        this$0 = RatingsFragment.this;
        super();
    }
}

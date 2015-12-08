// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import com.contextlogic.wish.api.data.WishRatingSummary;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsProductRatingsView

class this._cls0
    implements com.contextlogic.wish.api.service.sProductRatingsView._cls1
{

    final TabbedProductDetailsProductRatingsView this$0;

    public void onServiceSucceeded(final WishRatingSummary summary, final ArrayList items, final int ratingsCount, final int nextOffset, final boolean noMoreRatings)
    {
        updatingList = true;
        queuePagerSettledTask(new Runnable() {

            final TabbedProductDetailsProductRatingsView._cls1 this$1;
            final ArrayList val$items;
            final int val$nextOffset;
            final boolean val$noMoreRatings;
            final int val$ratingsCount;
            final WishRatingSummary val$summary;

            public void run()
            {
                handleLoadingSuccess(summary, items, noMoreRatings, ratingsCount, nextOffset);
            }

            
            {
                this$1 = TabbedProductDetailsProductRatingsView._cls1.this;
                summary = wishratingsummary;
                items = arraylist;
                noMoreRatings = flag;
                ratingsCount = i;
                nextOffset = j;
                super();
            }
        });
    }

    _cls1.val.nextOffset()
    {
        this$0 = TabbedProductDetailsProductRatingsView.this;
        super();
    }
}

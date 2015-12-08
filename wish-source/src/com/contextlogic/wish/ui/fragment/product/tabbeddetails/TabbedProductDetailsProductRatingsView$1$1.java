// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import com.contextlogic.wish.api.data.WishRatingSummary;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsProductRatingsView

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
        handleLoadingSuccess(val$summary, val$items, val$noMoreRatings, val$ratingsCount, val$nextOffset);
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

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsProductRatingsView$1

/* anonymous class */
    class TabbedProductDetailsProductRatingsView._cls1
        implements com.contextlogic.wish.api.service.GetProductRatingsService.SuccessCallback
    {

        final TabbedProductDetailsProductRatingsView this$0;

        public void onServiceSucceeded(final WishRatingSummary summary, final ArrayList items, final int ratingsCount, int i, final boolean noMoreRatings)
        {
            updatingList = true;
            queuePagerSettledTask(i. new TabbedProductDetailsProductRatingsView._cls1._cls1());
        }

            
            {
                this$0 = TabbedProductDetailsProductRatingsView.this;
                super();
            }
    }

}

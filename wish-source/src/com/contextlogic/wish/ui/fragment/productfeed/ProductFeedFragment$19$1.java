// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.nextOffset
    implements Runnable
{

    final val.nextOffset this$1;
    final ArrayList val$items;
    final int val$nextOffset;
    final boolean val$noMoreItems;

    public void run()
    {
        ArrayList arraylist = new ArrayList(val$items);
        ProductFeedFragment.access$1800(_fld0, arraylist, val$noMoreItems, val$nextOffset, null, null);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$items = arraylist;
        val$noMoreItems = flag;
        val$nextOffset = I.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$19

/* anonymous class */
    class ProductFeedFragment._cls19
        implements com.contextlogic.wish.api.service.GetWishlistFeedService.SuccessCallback
    {

        final ProductFeedFragment this$0;

        public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, int i)
        {
            ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
            postDelayed(i. new ProductFeedFragment._cls19._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
    }

}

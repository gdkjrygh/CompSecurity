// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.bannerTitle
    implements Runnable
{

    final val.bannerTitle this$1;
    final String val$bannerTitle;
    final WishFeedEndedButtonSpec val$feedEndedSpec;
    final ArrayList val$items;
    final int val$nextOffset;
    final boolean val$noMoreItems;

    public void run()
    {
        ProductFeedFragment.access$1800(_fld0, val$items, val$noMoreItems, val$nextOffset, val$feedEndedSpec, val$bannerTitle);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$items = arraylist;
        val$noMoreItems = flag;
        val$nextOffset = i;
        val$feedEndedSpec = wishfeedendedbuttonspec;
        val$bannerTitle = String.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$21

/* anonymous class */
    class ProductFeedFragment._cls21
        implements com.contextlogic.wish.api.service.GetProfileProductsService.SuccessCallback
    {

        final ProductFeedFragment this$0;

        public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, String s)
        {
            ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
            postDelayed(s. new ProductFeedFragment._cls21._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
    }

}

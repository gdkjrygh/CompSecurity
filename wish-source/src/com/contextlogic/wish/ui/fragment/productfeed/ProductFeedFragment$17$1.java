// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.os.Bundle;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.bannerTitle
    implements Runnable
{

    final val.bannerTitle this$1;
    final WishFeedPromotionItem val$banner;
    final String val$bannerTitle;
    final WishFeedEndedButtonSpec val$feedEndedSpec;
    final ArrayList val$items;
    final int val$nextOffset;
    final boolean val$noMoreItems;
    final int val$promotionTileCount;
    final String val$tagTitle;

    public void run()
    {
        if (val$tagTitle != null)
        {
            ProductFeedFragment.access$1402(_fld0, val$tagTitle);
        }
        if (getArguments() != null)
        {
            getArguments().putString("ArgDataTitle", val$tagTitle);
        }
        ProductFeedFragment.access$1500(_fld0);
        ProductFeedFragment.access$1612(_fld0, val$promotionTileCount);
        ProductFeedFragment.access$1700(_fld0, val$banner);
        ProductFeedFragment.access$1800(_fld0, val$items, val$noMoreItems, val$nextOffset, val$feedEndedSpec, val$bannerTitle);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$tagTitle = s;
        val$promotionTileCount = i;
        val$banner = wishfeedpromotionitem;
        val$items = arraylist;
        val$noMoreItems = flag;
        val$nextOffset = j;
        val$feedEndedSpec = wishfeedendedbuttonspec;
        val$bannerTitle = String.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$17

/* anonymous class */
    class ProductFeedFragment._cls17
        implements com.contextlogic.wish.api.service.GetFeedService.SuccessCallback
    {

        final ProductFeedFragment this$0;

        public void onServiceSucceeded(final ArrayList items, final String tagTitle, final boolean noMoreItems, final WishFeedPromotionItem banner, final int promotionTileCount, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, 
                String s)
        {
            ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
            postDelayed(s. new ProductFeedFragment._cls17._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
    }

}

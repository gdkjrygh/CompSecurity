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

class this._cls0
    implements com.contextlogic.wish.api.service.allback
{

    final ProductFeedFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final String tagTitle, final boolean noMoreItems, final WishFeedPromotionItem banner, final int promotionTileCount, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, 
            final String bannerTitle)
    {
        ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
        postDelayed(new Runnable() {

            final ProductFeedFragment._cls17 this$1;
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
                if (tagTitle != null)
                {
                    ProductFeedFragment.access$1402(this$0, tagTitle);
                }
                if (getArguments() != null)
                {
                    getArguments().putString("ArgDataTitle", tagTitle);
                }
                ProductFeedFragment.access$1500(this$0);
                ProductFeedFragment.access$1612(this$0, promotionTileCount);
                ProductFeedFragment.access$1700(this$0, banner);
                ProductFeedFragment.access$1800(this$0, items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
            }

            
            {
                this$1 = ProductFeedFragment._cls17.this;
                tagTitle = s;
                promotionTileCount = i;
                banner = wishfeedpromotionitem;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = j;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = s1;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.bannerTitle()
    {
        this$0 = ProductFeedFragment.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishMerchant;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls0
    implements com.contextlogic.wish.api.service.SuccessCallback
{

    final ProductFeedFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, final String bannerTitle, final WishMerchant merchant)
    {
        postDelayed(new Runnable() {

            final ProductFeedFragment._cls27 this$1;
            final String val$bannerTitle;
            final WishFeedEndedButtonSpec val$feedEndedSpec;
            final ArrayList val$items;
            final WishMerchant val$merchant;
            final int val$nextOffset;
            final boolean val$noMoreItems;

            public void run()
            {
                ProductFeedFragment.access$2200(this$0, merchant);
                ProductFeedFragment.access$1800(this$0, items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
            }

            
            {
                this$1 = ProductFeedFragment._cls27.this;
                merchant = wishmerchant;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = s;
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

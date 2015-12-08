// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls0
    implements com.contextlogic.wish.api.service.ce.SuccessCallback
{

    final ProductFeedFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, final String bannerTitle)
    {
        ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
        postDelayed(new Runnable() {

            final ProductFeedFragment._cls21 this$1;
            final String val$bannerTitle;
            final WishFeedEndedButtonSpec val$feedEndedSpec;
            final ArrayList val$items;
            final int val$nextOffset;
            final boolean val$noMoreItems;

            public void run()
            {
                ProductFeedFragment.access$1800(this$0, items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
            }

            
            {
                this$1 = ProductFeedFragment._cls21.this;
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

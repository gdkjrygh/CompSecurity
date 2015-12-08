// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls0
    implements com.contextlogic.wish.api.service.SuccessCallback
{

    final ProductFeedFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset)
    {
        ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
        postDelayed(new Runnable() {

            final ProductFeedFragment._cls19 this$1;
            final ArrayList val$items;
            final int val$nextOffset;
            final boolean val$noMoreItems;

            public void run()
            {
                ArrayList arraylist = new ArrayList(items);
                ProductFeedFragment.access$1800(this$0, arraylist, noMoreItems, nextOffset, null, null);
            }

            
            {
                this$1 = ProductFeedFragment._cls19.this;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.nextOffset()
    {
        this$0 = ProductFeedFragment.this;
        super();
    }
}

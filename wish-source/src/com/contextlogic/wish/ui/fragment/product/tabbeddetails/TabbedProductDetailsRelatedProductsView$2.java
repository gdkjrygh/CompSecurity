// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsRelatedProductsView

class this._cls0
    implements com.contextlogic.wish.api.service.ck
{

    final TabbedProductDetailsRelatedProductsView this$0;

    public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset)
    {
        TabbedProductDetailsRelatedProductsView.access$102(TabbedProductDetailsRelatedProductsView.this, true);
        queuePagerSettledTask(new Runnable() {

            final TabbedProductDetailsRelatedProductsView._cls2 this$1;
            final ArrayList val$items;
            final int val$nextOffset;
            final boolean val$noMoreItems;

            public void run()
            {
                TabbedProductDetailsRelatedProductsView.access$200(this$0, items, noMoreItems, nextOffset);
            }

            
            {
                this$1 = TabbedProductDetailsRelatedProductsView._cls2.this;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                super();
            }
        });
    }

    _cls1.val.nextOffset()
    {
        this$0 = TabbedProductDetailsRelatedProductsView.this;
        super();
    }
}

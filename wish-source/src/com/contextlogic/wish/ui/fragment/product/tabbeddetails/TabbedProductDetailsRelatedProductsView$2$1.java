// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsRelatedProductsView

class val.nextOffset
    implements Runnable
{

    final val.nextOffset this$1;
    final ArrayList val$items;
    final int val$nextOffset;
    final boolean val$noMoreItems;

    public void run()
    {
        TabbedProductDetailsRelatedProductsView.access$200(_fld0, val$items, val$noMoreItems, val$nextOffset);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$items = arraylist;
        val$noMoreItems = flag;
        val$nextOffset = I.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsRelatedProductsView$2

/* anonymous class */
    class TabbedProductDetailsRelatedProductsView._cls2
        implements com.contextlogic.wish.api.service.GetRelatedProductFeedService.SuccessCallback
    {

        final TabbedProductDetailsRelatedProductsView this$0;

        public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, int i)
        {
            TabbedProductDetailsRelatedProductsView.access$102(TabbedProductDetailsRelatedProductsView.this, true);
            queuePagerSettledTask(i. new TabbedProductDetailsRelatedProductsView._cls2._cls1());
        }

            
            {
                this$0 = TabbedProductDetailsRelatedProductsView.this;
                super();
            }
    }

}

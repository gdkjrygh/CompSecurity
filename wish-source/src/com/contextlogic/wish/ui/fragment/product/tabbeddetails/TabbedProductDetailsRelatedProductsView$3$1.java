// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsRelatedProductsView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        TabbedProductDetailsRelatedProductsView.access$300(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsRelatedProductsView$3

/* anonymous class */
    class TabbedProductDetailsRelatedProductsView._cls3
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final TabbedProductDetailsRelatedProductsView this$0;

        public void onServiceFailed()
        {
            queuePagerSettledTask(new TabbedProductDetailsRelatedProductsView._cls3._cls1());
        }

            
            {
                this$0 = TabbedProductDetailsRelatedProductsView.this;
                super();
            }
    }

}

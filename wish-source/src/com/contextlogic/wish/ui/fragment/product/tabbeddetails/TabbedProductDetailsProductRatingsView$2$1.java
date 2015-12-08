// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsProductRatingsView

class this._cls1
    implements Runnable
{

    final leLoadingFailure this$1;

    public void run()
    {
        handleLoadingFailure();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsProductRatingsView$2

/* anonymous class */
    class TabbedProductDetailsProductRatingsView._cls2
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final TabbedProductDetailsProductRatingsView this$0;

        public void onServiceFailed()
        {
            updatingList = true;
            queuePagerSettledTask(new TabbedProductDetailsProductRatingsView._cls2._cls1());
        }

            
            {
                this$0 = TabbedProductDetailsProductRatingsView.this;
                super();
            }
    }

}

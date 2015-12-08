// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsProductRatingsView

class this._cls0
    implements com.contextlogic.wish.api.service.sProductRatingsView._cls2
{

    final TabbedProductDetailsProductRatingsView this$0;

    public void onServiceFailed()
    {
        updatingList = true;
        queuePagerSettledTask(new Runnable() {

            final TabbedProductDetailsProductRatingsView._cls2 this$1;

            public void run()
            {
                handleLoadingFailure();
            }

            
            {
                this$1 = TabbedProductDetailsProductRatingsView._cls2.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = TabbedProductDetailsProductRatingsView.this;
        super();
    }
}

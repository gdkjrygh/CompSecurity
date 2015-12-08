// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsRelatedProductsView

class this._cls0
    implements com.contextlogic.wish.api.service.RelatedProductsView._cls3
{

    final TabbedProductDetailsRelatedProductsView this$0;

    public void onServiceFailed()
    {
        queuePagerSettledTask(new Runnable() {

            final TabbedProductDetailsRelatedProductsView._cls3 this$1;

            public void run()
            {
                TabbedProductDetailsRelatedProductsView.access$300(this$0);
            }

            
            {
                this$1 = TabbedProductDetailsRelatedProductsView._cls3.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = TabbedProductDetailsRelatedProductsView.this;
        super();
    }
}

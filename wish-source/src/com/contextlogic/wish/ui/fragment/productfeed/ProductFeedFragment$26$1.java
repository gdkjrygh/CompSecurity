// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        ProductFeedFragment.access$1900(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$26

/* anonymous class */
    class ProductFeedFragment._cls26
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final ProductFeedFragment this$0;

        public void onServiceFailed()
        {
            postDelayed(new ProductFeedFragment._cls26._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
    }

}

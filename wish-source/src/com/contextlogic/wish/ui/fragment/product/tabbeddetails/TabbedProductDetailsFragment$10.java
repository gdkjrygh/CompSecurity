// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsFragment, TabbedProductDetailsPagerAdapter

class val.allowAnimate
    implements Runnable
{

    final TabbedProductDetailsFragment this$0;
    final boolean val$allowAnimate;

    public void run()
    {
        TabbedProductDetailsFragment.access$900(TabbedProductDetailsFragment.this).refreshWishStates(val$allowAnimate);
    }

    ()
    {
        this$0 = final_tabbedproductdetailsfragment;
        val$allowAnimate = Z.this;
        super();
    }
}

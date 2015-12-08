// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.ck
{

    final TabbedProductDetailsFragment this$0;

    public void onServiceSucceeded(WishProduct wishproduct)
    {
        TabbedProductDetailsFragment.access$600(TabbedProductDetailsFragment.this, wishproduct);
    }

    ()
    {
        this$0 = TabbedProductDetailsFragment.this;
        super();
    }
}

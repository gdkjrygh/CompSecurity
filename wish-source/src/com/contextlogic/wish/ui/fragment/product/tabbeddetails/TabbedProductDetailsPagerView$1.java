// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView

class this._cls0
    implements Runnable
{

    final TabbedProductDetailsPagerView this$0;

    public void run()
    {
        int i = getCurrentScrollY();
        if (TabbedProductDetailsPagerView.access$000(TabbedProductDetailsPagerView.this) - i == 0)
        {
            TabbedProductDetailsPagerView.access$100(TabbedProductDetailsPagerView.this);
            return;
        } else
        {
            TabbedProductDetailsPagerView.access$002(TabbedProductDetailsPagerView.this, i);
            postDelayed(TabbedProductDetailsPagerView.access$200(TabbedProductDetailsPagerView.this), 100L);
            return;
        }
    }

    ()
    {
        this$0 = TabbedProductDetailsPagerView.this;
        super();
    }
}

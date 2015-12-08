// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.description;

import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.description:
//            ProductDetailsDescriptionFragment

class val.rootActivity
    implements Runnable
{

    final ProductDetailsDescriptionFragment this$0;
    final RootActivity val$rootActivity;

    public void run()
    {
        val$rootActivity.showCart(null, null, null);
    }

    ()
    {
        this$0 = final_productdetailsdescriptionfragment;
        val$rootActivity = RootActivity.this;
        super();
    }
}

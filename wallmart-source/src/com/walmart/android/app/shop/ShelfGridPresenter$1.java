// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmartlabs.ui.recycler.GridRecyclerView;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfGridPresenter

class this._cls0
    implements Runnable
{

    final ShelfGridPresenter this$0;

    public void run()
    {
        ((GridRecyclerView)mItemsView).requestLayout();
    }

    ()
    {
        this$0 = ShelfGridPresenter.this;
        super();
    }
}

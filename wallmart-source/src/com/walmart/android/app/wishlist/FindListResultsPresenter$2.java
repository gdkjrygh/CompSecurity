// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.service.wishlist.WishList;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.wishlist:
//            FindListResultsPresenter, FindListResultsAdapter, GiverItemListPresenter

class this._cls0
    implements com.walmartlabs.ui.recycler.ckListener
{

    final FindListResultsPresenter this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        basicviewholder = (WishList)FindListResultsPresenter.access$100(FindListResultsPresenter.this).getItem(i);
        FindListResultsPresenter.access$300(FindListResultsPresenter.this, new GiverItemListPresenter(FindListResultsPresenter.access$200(FindListResultsPresenter.this), basicviewholder));
    }

    tener()
    {
        this$0 = FindListResultsPresenter.this;
        super();
    }
}

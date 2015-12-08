// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreListPresenter

class er extends RecyclerItemSingleClickListener
{

    final InStoreListPresenter this$0;

    public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
    {
        InStoreListPresenter.access$400(InStoreListPresenter.this, i);
    }

    er(Presenter presenter)
    {
        this$0 = InStoreListPresenter.this;
        super(presenter);
    }
}

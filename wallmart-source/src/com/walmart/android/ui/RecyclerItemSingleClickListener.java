// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.ui:
//            Presenter

public abstract class RecyclerItemSingleClickListener
    implements com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener
{

    private Presenter mPresenter;

    public RecyclerItemSingleClickListener(Presenter presenter)
    {
        mPresenter = presenter;
    }

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        if (!mPresenter.isSingleClickFlagSet())
        {
            mPresenter.setSingleClickFlag(true);
            onItemSingleClick(basicviewholder, i);
        }
    }

    public abstract void onItemSingleClick(BasicViewHolder basicviewholder, int i);
}

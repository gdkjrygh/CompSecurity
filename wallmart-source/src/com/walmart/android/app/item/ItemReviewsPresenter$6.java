// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewsPresenter, ItemReviewsAdapter, ItemReviewDetailsPresenter

class this._cls0
    implements com.walmartlabs.ui.recycler.mClickListener
{

    final ItemReviewsPresenter this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        com.walmart.android.data.r r = (com.walmart.android.data.r)ItemReviewsPresenter.access$000(ItemReviewsPresenter.this).getItem(i);
        if (r != null)
        {
            if (ItemReviewsPresenter.access$500(ItemReviewsPresenter.this) != null)
            {
                basicviewholder = ItemReviewsPresenter.access$500(ItemReviewsPresenter.this);
            } else
            {
                basicviewholder = "";
            }
            basicviewholder = new ItemReviewDetailsPresenter(ItemReviewsPresenter.access$100(ItemReviewsPresenter.this), basicviewholder, ItemReviewsPresenter.access$600(ItemReviewsPresenter.this), ItemReviewsPresenter.access$700(ItemReviewsPresenter.this), r, ItemReviewsPresenter.access$000(ItemReviewsPresenter.this));
            ItemReviewsPresenter.access$800(ItemReviewsPresenter.this, basicviewholder);
        }
    }

    ter()
    {
        this$0 = ItemReviewsPresenter.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.service.review.ReviewSort;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewsPresenter, ItemReviewsAdapter

class this._cls0
    implements hangedListener
{

    final ItemReviewsPresenter this$0;

    public void onSortChanged(ReviewSort reviewsort)
    {
        ItemReviewsPresenter.access$000(ItemReviewsPresenter.this).applySort(reviewsort);
    }

    public volatile void onSortChanged(Object obj)
    {
        onSortChanged((ReviewSort)obj);
    }

    hangedListener()
    {
        this$0 = ItemReviewsPresenter.this;
        super();
    }
}

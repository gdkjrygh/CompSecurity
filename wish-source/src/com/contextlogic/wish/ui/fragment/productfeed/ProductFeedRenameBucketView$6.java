// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedRenameBucketView, ProductFeedRenameBucketAdapter

class this._cls0
    implements com.contextlogic.wish.api.service.ck
{

    final ProductFeedRenameBucketView this$0;

    public void onServiceSucceeded(ArrayList arraylist)
    {
        ProductFeedRenameBucketView.access$500(ProductFeedRenameBucketView.this).clear();
        ProductFeedRenameBucketView.access$500(ProductFeedRenameBucketView.this).addAll(arraylist);
        ProductFeedRenameBucketView.access$600(ProductFeedRenameBucketView.this).notifyDataSetChanged();
    }

    ()
    {
        this$0 = ProductFeedRenameBucketView.this;
        super();
    }
}

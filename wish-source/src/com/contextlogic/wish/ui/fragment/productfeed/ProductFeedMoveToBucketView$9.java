// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedMoveToBucketView, ProductFeedMoveToBucketAdapter

class this._cls0
    implements Runnable
{

    final ProductFeedMoveToBucketView this$0;

    public void run()
    {
        ProductFeedMoveToBucketView.access$600(ProductFeedMoveToBucketView.this);
        ProductFeedMoveToBucketView.access$700(ProductFeedMoveToBucketView.this).notifyDataSetChanged();
    }

    ()
    {
        this$0 = ProductFeedMoveToBucketView.this;
        super();
    }
}

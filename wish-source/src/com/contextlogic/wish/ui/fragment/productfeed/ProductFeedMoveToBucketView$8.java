// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.DialogInterface;
import com.contextlogic.wish.analytics.Analytics;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedMoveToBucketView

class this._cls0
    implements android.content.r
{

    final ProductFeedMoveToBucketView this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.t, com.contextlogic.wish.analytics.ucket, com.contextlogic.wish.analytics.ucket);
        if (ProductFeedMoveToBucketView.access$100(ProductFeedMoveToBucketView.this) != null)
        {
            ProductFeedMoveToBucketView.access$100(ProductFeedMoveToBucketView.this).onProductsRemoved(ProductFeedMoveToBucketView.access$500(ProductFeedMoveToBucketView.this));
        }
    }

    allback()
    {
        this$0 = ProductFeedMoveToBucketView.this;
        super();
    }
}

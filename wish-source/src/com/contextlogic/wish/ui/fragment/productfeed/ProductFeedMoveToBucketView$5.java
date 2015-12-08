// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedMoveToBucketView

class this._cls0
    implements android.widget.r
{

    final ProductFeedMoveToBucketView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.oBucketView, com.contextlogic.wish.analytics.ucket, com.contextlogic.wish.analytics.ucket);
        if (ProductFeedMoveToBucketView.access$100(ProductFeedMoveToBucketView.this) != null && i < ProductFeedMoveToBucketView.access$400(ProductFeedMoveToBucketView.this).size())
        {
            adapterview = (WishUserProductBucket)ProductFeedMoveToBucketView.access$400(ProductFeedMoveToBucketView.this).get(i);
            ProductFeedMoveToBucketView.access$100(ProductFeedMoveToBucketView.this).onBucketEdited(ProductFeedMoveToBucketView.access$500(ProductFeedMoveToBucketView.this), adapterview.getName(), adapterview.getBucketId());
        }
    }

    allback()
    {
        this$0 = ProductFeedMoveToBucketView.this;
        super();
    }
}

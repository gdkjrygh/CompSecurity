// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.data.WishTag;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedRenameBucketView

class this._cls0
    implements android.widget.r
{

    final ProductFeedRenameBucketView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ProductFeedRenameBucketView.access$000(ProductFeedRenameBucketView.this);
        adapterview = ((WishTag)ProductFeedRenameBucketView.access$500(ProductFeedRenameBucketView.this).get(i)).getName();
        ProductFeedRenameBucketView.access$100(ProductFeedRenameBucketView.this);
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.eBucketView, com.contextlogic.wish.analytics.ucket, com.contextlogic.wish.analytics.ucket);
        if (ProductFeedRenameBucketView.access$200(ProductFeedRenameBucketView.this) != null)
        {
            ProductFeedRenameBucketView.access$200(ProductFeedRenameBucketView.this).onBucketRenamed(adapterview);
        }
    }

    llback()
    {
        this$0 = ProductFeedRenameBucketView.this;
        super();
    }
}

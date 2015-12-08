// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.api.data.WishUserProductBucket;
import java.util.Comparator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedMoveToBucketView

class this._cls0
    implements Comparator
{

    final ProductFeedMoveToBucketView this$0;

    public int compare(WishUserProductBucket wishuserproductbucket, WishUserProductBucket wishuserproductbucket1)
    {
        return wishuserproductbucket.getName().compareToIgnoreCase(wishuserproductbucket1.getName());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((WishUserProductBucket)obj, (WishUserProductBucket)obj1);
    }

    Q()
    {
        this$0 = ProductFeedMoveToBucketView.this;
        super();
    }
}

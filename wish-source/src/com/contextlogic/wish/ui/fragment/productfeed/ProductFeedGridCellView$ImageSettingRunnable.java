// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedGridCellView

private class cancelled
    implements Runnable
{

    private boolean cancelled;
    private String imageUrl;
    final ProductFeedGridCellView this$0;

    public void markCancelled()
    {
        cancelled = true;
    }

    public void run()
    {
        if (!cancelled)
        {
            ProductFeedGridCellView.access$500(ProductFeedGridCellView.this).getImageView().setImageUrl(imageUrl);
        }
    }

    public (String s)
    {
        this$0 = ProductFeedGridCellView.this;
        super();
        imageUrl = s;
        cancelled = false;
    }
}

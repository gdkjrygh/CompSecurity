// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.collections;

import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.collections:
//            CollectionsFeedGridCellView

private class cancelled
    implements Runnable
{

    private boolean cancelled;
    private ArrayList imageUrls;
    final CollectionsFeedGridCellView this$0;

    public void markCancelled()
    {
        cancelled = true;
    }

    public void run()
    {
        if (!cancelled)
        {
            CollectionsFeedGridCellView.access$300(CollectionsFeedGridCellView.this).getImageView().setImageUrl((String)imageUrls.get(0));
            CollectionsFeedGridCellView.access$400(CollectionsFeedGridCellView.this).getImageView().setImageUrl((String)imageUrls.get(1));
            CollectionsFeedGridCellView.access$500(CollectionsFeedGridCellView.this).getImageView().setImageUrl((String)imageUrls.get(2));
        }
    }

    public (ArrayList arraylist)
    {
        this$0 = CollectionsFeedGridCellView.this;
        super();
        imageUrls = arraylist;
        cancelled = false;
    }
}

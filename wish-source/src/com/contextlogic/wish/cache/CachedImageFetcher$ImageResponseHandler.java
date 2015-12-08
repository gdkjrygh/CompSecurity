// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.graphics.Bitmap;
import com.contextlogic.wish.http.ImageHttpResponseHandler;

// Referenced classes of package com.contextlogic.wish.cache:
//            CachedImageFetcher

class cancelled extends ImageHttpResponseHandler
{

    private boolean cancelled;
    final CachedImageFetcher this$0;

    public void markCancelled()
    {
        cancelled = true;
    }

    public void onFailure(Throwable throwable, Bitmap bitmap)
    {
        if (!cancelled)
        {
            CachedImageFetcher.access$100(CachedImageFetcher.this);
        }
    }

    public void onSuccess(Bitmap bitmap)
    {
        if (!cancelled)
        {
            CachedImageFetcher.access$000(CachedImageFetcher.this, bitmap);
        }
    }

    I()
    {
        this$0 = CachedImageFetcher.this;
        super();
        cancelled = false;
    }
}

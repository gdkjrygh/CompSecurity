// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.service:
//            ImageDownloader, DataCache

class this._cls0
    implements Runnable
{

    final ImageDownloader this$0;

    public void run()
    {
        long l = System.currentTimeMillis();
        WLog.v(ImageDownloader.TAG, "Starting image cache cleanup.");
        ImageDownloader.access$200(ImageDownloader.this).cleanup();
        WLog.v(ImageDownloader.TAG, (new StringBuilder()).append("Done with image cache cleanup. Time: ").append(System.currentTimeMillis() - l).append(" ms").toString());
    }

    ()
    {
        this$0 = ImageDownloader.this;
        super();
    }
}

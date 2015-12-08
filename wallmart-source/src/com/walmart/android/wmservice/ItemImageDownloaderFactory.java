// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import com.walmart.android.service.ImageDownloader;

// Referenced classes of package com.walmart.android.wmservice:
//            Services, WalmartNetService

public class ItemImageDownloaderFactory
{

    public static final String CACHE_DIR = "images";
    public static final long DEFAULT_CACHE_EXPIRY_TIME = 0x493e0L;

    public ItemImageDownloaderFactory()
    {
    }

    public static ImageDownloader createImageDownloader(Context context)
    {
        return createImageDownloader(context, 0x493e0L);
    }

    public static ImageDownloader createImageDownloader(Context context, long l)
    {
        context = new ImageDownloader(Services.get().getWalmartService().getImageClient(), "images", context);
        context.setDefaultCacheExpiryTime(l);
        return context;
    }
}

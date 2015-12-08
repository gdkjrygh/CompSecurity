// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;

// Referenced classes of package com.facebook.internal:
//            ImageDownloader

private static class allowCachedRedirects
    implements Runnable
{

    private boolean allowCachedRedirects;
    private Context context;
    private allowCachedRedirects key;

    public void run()
    {
        ImageDownloader.access$0(key, context, allowCachedRedirects);
    }

    (Context context1,  , boolean flag)
    {
        context = context1;
        key = ;
        allowCachedRedirects = flag;
    }
}

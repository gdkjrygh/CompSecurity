// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;

// Referenced classes of package com.facebook.internal:
//            ImageDownloader

private static class key
    implements Runnable
{

    private Context context;
    private context key;

    public void run()
    {
        ImageDownloader.access$1(key, context);
    }

    A(Context context1, A a)
    {
        context = context1;
        key = a;
    }
}

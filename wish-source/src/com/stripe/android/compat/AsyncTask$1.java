// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.compat;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.stripe.android.compat:
//            AsyncTask

static final class ger
    implements ThreadFactory
{

    private final AtomicInteger mCount = new AtomicInteger(1);

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("AsyncTask #").append(mCount.getAndIncrement()).toString());
    }

    ger()
    {
    }
}

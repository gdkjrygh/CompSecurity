// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;


// Referenced classes of package com.contextlogic.wish.http:
//            WishHttpClient

static class runnable
{

    private Runnable runnable;
    private long timestamp;

    public Runnable getRunnable()
    {
        return runnable;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public (Runnable runnable1)
    {
        timestamp = System.currentTimeMillis();
        runnable = runnable1;
    }
}

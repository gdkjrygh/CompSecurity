// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            Backoff, RetryPolicy

public class RetryState
{

    private final Backoff backoff;
    private final int retryCount;
    private final RetryPolicy retryPolicy;

    public RetryState(int i, Backoff backoff1, RetryPolicy retrypolicy)
    {
        retryCount = i;
        backoff = backoff1;
        retryPolicy = retrypolicy;
    }

    public RetryState(Backoff backoff1, RetryPolicy retrypolicy)
    {
        this(0, backoff1, retrypolicy);
    }

    public Backoff getBackoff()
    {
        return backoff;
    }

    public int getRetryCount()
    {
        return retryCount;
    }

    public long getRetryDelay()
    {
        return backoff.getDelayMillis(retryCount);
    }

    public RetryPolicy getRetryPolicy()
    {
        return retryPolicy;
    }

    public RetryState initialRetryState()
    {
        return new RetryState(backoff, retryPolicy);
    }

    public RetryState nextRetryState()
    {
        return new RetryState(retryCount + 1, backoff, retryPolicy);
    }
}

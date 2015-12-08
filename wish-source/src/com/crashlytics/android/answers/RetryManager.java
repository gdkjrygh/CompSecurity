// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.RetryState;

class RetryManager
{

    private static final long NANOSECONDS_IN_MS = 0xf4240L;
    long lastRetry;
    private RetryState retryState;

    public RetryManager(RetryState retrystate)
    {
        if (retrystate == null)
        {
            throw new NullPointerException("retryState must not be null");
        } else
        {
            retryState = retrystate;
            return;
        }
    }

    public boolean canRetry(long l)
    {
        long l1 = retryState.getRetryDelay();
        return l - lastRetry >= 0xf4240L * l1;
    }

    public void recordRetry(long l)
    {
        lastRetry = l;
        retryState = retryState.nextRetryState();
    }

    public void reset()
    {
        lastRetry = 0L;
        retryState = retryState.initialRetryState();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            RetryPolicy

public class DefaultRetryPolicy
    implements RetryPolicy
{

    private final int maxRetries;

    public DefaultRetryPolicy()
    {
        this(1);
    }

    public DefaultRetryPolicy(int i)
    {
        maxRetries = i;
    }

    public boolean shouldRetry(int i, Throwable throwable)
    {
        return i < maxRetries;
    }
}

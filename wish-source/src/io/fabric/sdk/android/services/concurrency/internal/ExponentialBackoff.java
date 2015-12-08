// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            Backoff

public class ExponentialBackoff
    implements Backoff
{

    private static final int DEFAULT_POWER = 2;
    private final long baseTimeMillis;
    private final int power;

    public ExponentialBackoff(long l)
    {
        this(l, 2);
    }

    public ExponentialBackoff(long l, int i)
    {
        baseTimeMillis = l;
        power = i;
    }

    public long getDelayMillis(int i)
    {
        return (long)((double)baseTimeMillis * Math.pow(power, i));
    }
}

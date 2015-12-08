// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.weather.ads2.targeting:
//            ViewCount

public static class mentAndGet
{

    private static final AtomicInteger ID_COUNTER = new AtomicInteger();
    public final long count;
    public final int countId;


    public (long l)
    {
        count = l;
        countId = ID_COUNTER.incrementAndGet();
    }
}

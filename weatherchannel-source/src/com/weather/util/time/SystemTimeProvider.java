// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time;


// Referenced classes of package com.weather.util.time:
//            TimeProvider

public class SystemTimeProvider
    implements TimeProvider
{

    private static final TimeProvider provider = new SystemTimeProvider();

    public SystemTimeProvider()
    {
    }

    public static TimeProvider getInstance()
    {
        return provider;
    }

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public long nanoTime()
    {
        return System.nanoTime();
    }

}

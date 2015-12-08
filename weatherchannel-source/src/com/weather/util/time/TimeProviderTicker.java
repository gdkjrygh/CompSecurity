// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time;

import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;

// Referenced classes of package com.weather.util.time:
//            TimeProvider

public class TimeProviderTicker extends Ticker
{

    private final TimeProvider timeProvider;

    public TimeProviderTicker(TimeProvider timeprovider)
    {
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
    }

    public final long read()
    {
        return timeProvider.nanoTime();
    }
}

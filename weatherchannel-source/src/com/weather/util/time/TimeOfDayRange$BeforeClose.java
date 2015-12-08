// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time;

import com.google.common.base.Predicate;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.util.time:
//            TimeOfDayRange, TimeOfDay

private static final class <init>
    implements Predicate
{

    private final TimeUnit precision;
    private final TimeOfDay timeOfDay;

    public boolean apply(TimeOfDay timeofday)
    {
        return timeofday != null && !timeofday.isAfter(timeOfDay, precision);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((TimeOfDay)obj);
    }

    private (TimeOfDay timeofday, TimeUnit timeunit)
    {
        timeOfDay = timeofday;
        precision = timeunit;
    }

    precision(TimeOfDay timeofday, TimeUnit timeunit, precision precision1)
    {
        this(timeofday, timeunit);
    }
}

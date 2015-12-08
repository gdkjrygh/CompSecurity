// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.util.time:
//            TimeOfDay

public class TimeOfDayBuilder
{

    private int hours;
    private int milliseconds;
    private int minutes;
    private int seconds;

    public TimeOfDayBuilder()
    {
    }

    public TimeOfDay build()
    {
        return new TimeOfDay(TimeUnit.HOURS.toMillis(hours) + TimeUnit.MINUTES.toMillis(minutes) + TimeUnit.SECONDS.toMillis(seconds) + (long)milliseconds);
    }

    public TimeOfDayBuilder setHours(int i)
    {
        boolean flag;
        if (i >= 0 && (long)i < TimeUnit.DAYS.toHours(1L))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        hours = i;
        return this;
    }

    public TimeOfDayBuilder setMilliseconds(int i)
    {
        boolean flag;
        if (i >= 0 && (long)i < TimeUnit.SECONDS.toMillis(1L))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        milliseconds = i;
        return this;
    }

    public TimeOfDayBuilder setMinutes(int i)
    {
        boolean flag;
        if (i >= 0 && (long)i < TimeUnit.HOURS.toMinutes(1L))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        minutes = i;
        return this;
    }

    public TimeOfDayBuilder setSeconds(int i)
    {
        boolean flag;
        if (i >= 0 && (long)i < TimeUnit.MINUTES.toSeconds(1L))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        seconds = i;
        return this;
    }
}

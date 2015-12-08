// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time;

import com.google.common.base.Preconditions;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.util.time:
//            TimeOfDayBuilder

public class TimeOfDay
    implements Comparable
{

    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0L);
    private static final long MILLI_IN_DAY;
    private final int milliseconds;

    public TimeOfDay(long l)
    {
        boolean flag;
        if (l >= 0L && l < MILLI_IN_DAY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        milliseconds = (int)l;
    }

    public static TimeOfDayBuilder builder()
    {
        return new TimeOfDayBuilder();
    }

    public static TimeOfDayBuilder builderFor(Calendar calendar)
    {
        return builder().setHours(calendar.get(11)).setMinutes(calendar.get(12)).setSeconds(calendar.get(13)).setMilliseconds(calendar.get(14));
    }

    public static TimeOfDay now()
    {
        return builderFor(Calendar.getInstance()).build();
    }

    public static TimeOfDay valueOf(int i, TimeUnit timeunit)
    {
        return new TimeOfDay(timeunit.toMillis(i));
    }

    public TimeOfDay add(int i, TimeUnit timeunit)
    {
        long l1 = ((long)milliseconds + timeunit.toMillis(i)) % MILLI_IN_DAY;
        long l = l1;
        if (l1 < 0L)
        {
            l = l1 + MILLI_IN_DAY;
        }
        return new TimeOfDay(l);
    }

    public int compareTo(TimeOfDay timeofday)
    {
        return compareTo(timeofday, TimeUnit.MILLISECONDS);
    }

    public int compareTo(TimeOfDay timeofday, TimeUnit timeunit)
    {
        long l = timeunit.convert(milliseconds, TimeUnit.MILLISECONDS);
        long l1 = timeunit.convert(timeofday.milliseconds, TimeUnit.MILLISECONDS);
        if (l < l1)
        {
            return -1;
        }
        return l != l1 ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TimeOfDay)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TimeOfDay)obj;
            if (milliseconds != ((TimeOfDay) (obj)).milliseconds)
            {
                return false;
            }
        }
        return true;
    }

    public int getHours()
    {
        return (int)TimeUnit.MILLISECONDS.toHours(milliseconds);
    }

    public int getMilliseconds()
    {
        return (int)((long)milliseconds % TimeUnit.SECONDS.toMillis(1L));
    }

    public int getMinutes()
    {
        return (int)TimeUnit.MILLISECONDS.toMinutes((long)milliseconds % TimeUnit.HOURS.toMillis(1L));
    }

    public int getSeconds()
    {
        return (int)TimeUnit.MILLISECONDS.toSeconds((long)milliseconds % TimeUnit.MINUTES.toMillis(1L));
    }

    public int getTime()
    {
        return milliseconds;
    }

    public int hashCode()
    {
        return milliseconds;
    }

    public boolean isAfter(TimeOfDay timeofday, TimeUnit timeunit)
    {
        return compareTo(timeofday, timeunit) > 0;
    }

    public boolean isBefore(TimeOfDay timeofday, TimeUnit timeunit)
    {
        return compareTo(timeofday, timeunit) < 0;
    }

    public boolean isSame(TimeOfDay timeofday, TimeUnit timeunit)
    {
        return compareTo(timeofday, timeunit) == 0;
    }

    public void putTime(Calendar calendar)
    {
        calendar.set(11, getHours());
        calendar.set(12, getMinutes());
        calendar.set(13, getSeconds());
        calendar.set(14, getMilliseconds());
    }

    public String toString()
    {
        return (new StringBuilder()).append("TimeOfDay{hours=").append(getHours()).append(", minutes=").append(getMinutes()).append(", seconds=").append(getSeconds()).append(", milliseconds=").append(getMilliseconds()).append('}').toString();
    }

    static 
    {
        MILLI_IN_DAY = TimeUnit.DAYS.toMillis(1L);
    }
}

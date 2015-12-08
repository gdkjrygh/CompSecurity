// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.util.time:
//            TimeOfDay

public class TimeOfDayRange
{
    private static final class AfterClose
        implements Predicate
    {

        private final TimeUnit precision;
        private final TimeOfDay timeOfDay;

        public boolean apply(TimeOfDay timeofday)
        {
            return timeofday != null && !timeofday.isBefore(timeOfDay, precision);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((TimeOfDay)obj);
        }

        private AfterClose(TimeOfDay timeofday, TimeUnit timeunit)
        {
            timeOfDay = timeofday;
            precision = timeunit;
        }

    }

    private static final class AfterOpen
        implements Predicate
    {

        private final TimeUnit precision;
        private final TimeOfDay timeOfDay;

        public boolean apply(TimeOfDay timeofday)
        {
            return timeofday != null && timeofday.isAfter(timeOfDay, precision);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((TimeOfDay)obj);
        }

        private AfterOpen(TimeOfDay timeofday, TimeUnit timeunit)
        {
            timeOfDay = timeofday;
            precision = timeunit;
        }

    }

    private static final class BeforeClose
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

        private BeforeClose(TimeOfDay timeofday, TimeUnit timeunit)
        {
            timeOfDay = timeofday;
            precision = timeunit;
        }

    }

    private static final class BeforeOpen
        implements Predicate
    {

        private final TimeUnit precision;
        private final TimeOfDay timeOfDay;

        public boolean apply(TimeOfDay timeofday)
        {
            return timeofday != null && timeofday.isBefore(timeOfDay, precision);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((TimeOfDay)obj);
        }

        private BeforeOpen(TimeOfDay timeofday, TimeUnit timeunit)
        {
            timeOfDay = timeofday;
            precision = timeunit;
        }

    }


    private final Predicate predicate;

    private TimeOfDayRange(Predicate predicate1)
    {
        predicate = predicate1;
    }

    public static TimeOfDayRange closed(TimeOfDay timeofday, TimeOfDay timeofday1, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(timeofday);
        Preconditions.checkNotNull(timeofday1);
        Preconditions.checkNotNull(timeunit);
        boolean flag;
        if (timeunit != TimeUnit.DAYS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new TimeOfDayRange(combine(new AfterClose(timeofday, timeunit), new BeforeClose(timeofday1, timeunit), timeofday, timeofday1));
    }

    public static TimeOfDayRange closedOpen(TimeOfDay timeofday, TimeOfDay timeofday1, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(timeofday);
        Preconditions.checkNotNull(timeofday1);
        Preconditions.checkNotNull(timeunit);
        boolean flag;
        if (timeunit != TimeUnit.DAYS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new TimeOfDayRange(combine(new AfterClose(timeofday, timeunit), new BeforeOpen(timeofday1, timeunit), timeofday, timeofday1));
    }

    private static Predicate combine(Predicate predicate1, Predicate predicate2, TimeOfDay timeofday, TimeOfDay timeofday1)
    {
        if (timeofday1.isBefore(timeofday, TimeUnit.MILLISECONDS))
        {
            return Predicates.or(predicate1, predicate2);
        } else
        {
            return Predicates.and(predicate1, predicate2);
        }
    }

    public static TimeOfDayRange open(TimeOfDay timeofday, TimeOfDay timeofday1, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(timeofday);
        Preconditions.checkNotNull(timeofday1);
        Preconditions.checkNotNull(timeunit);
        boolean flag;
        if (timeunit != TimeUnit.DAYS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new TimeOfDayRange(combine(new AfterOpen(timeofday, timeunit), new BeforeOpen(timeofday1, timeunit), timeofday, timeofday1));
    }

    public static TimeOfDayRange openClosed(TimeOfDay timeofday, TimeOfDay timeofday1, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(timeofday);
        Preconditions.checkNotNull(timeofday1);
        Preconditions.checkNotNull(timeunit);
        boolean flag;
        if (timeunit != TimeUnit.DAYS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new TimeOfDayRange(combine(new AfterOpen(timeofday, timeunit), new BeforeClose(timeofday1, timeunit), timeofday, timeofday1));
    }

    public boolean contains(TimeOfDay timeofday)
    {
        return predicate.apply(timeofday);
    }
}

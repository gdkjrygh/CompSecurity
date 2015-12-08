// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time.validator;

import com.weather.util.time.TimeOfDay;
import com.weather.util.time.TimeOfDayRange;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.util.time.validator:
//            TimeValidationException

public class TimeOfTheDayOutsideRangeValidator
{

    private TimeOfDay lowerLimit;
    private TimeOfDay timeOfDay;
    private TimeOfDayRange timeOfDayRange;
    private TimeOfDay upperLimit;

    public TimeOfTheDayOutsideRangeValidator()
    {
    }

    public TimeOfTheDayOutsideRangeValidator setLowerLimit(TimeOfDay timeofday)
    {
        lowerLimit = timeofday;
        return this;
    }

    public TimeOfTheDayOutsideRangeValidator setTimeOfDay(TimeOfDay timeofday)
    {
        timeOfDay = timeofday;
        return this;
    }

    public TimeOfTheDayOutsideRangeValidator setUpperLimit(TimeOfDay timeofday)
    {
        upperLimit = timeofday;
        return this;
    }

    public void validate()
        throws TimeValidationException
    {
        timeOfDayRange = TimeOfDayRange.closedOpen(lowerLimit, upperLimit, TimeUnit.MINUTES);
        if (timeOfDayRange.contains(timeOfDay))
        {
            throw new TimeValidationException("TimeOfDay should be outside the range");
        } else
        {
            return;
        }
    }
}

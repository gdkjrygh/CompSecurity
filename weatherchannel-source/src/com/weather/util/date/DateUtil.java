// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.date;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.common.base.Preconditions;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.util.date:
//            TwcDateFormatter

public final class DateUtil
{

    private static final int MAXIMUM_DAY_TIME_IN_HOUR = 24;

    private DateUtil()
    {
    }

    public static long getRoundedUpTimeInGMT(int i, long l)
    {
        TimeZone timezone;
        long l1;
        boolean flag;
        if (i >= 0 && i < 24)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "local time should be in range of 0 to 23");
        timezone = TimeZone.getDefault();
        l1 = TimeUnit.MILLISECONDS.toHours(timezone.getOffset(l));
        l = l1;
        if (l1 < 0L)
        {
            l = l1;
            if (TimeUnit.MILLISECONDS.toMinutes(timezone.getRawOffset()) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toHours(timezone.getRawOffset())) != 0L)
            {
                l = l1 - 1L;
            }
        }
        l = (long)i - l;
        if (l < 0L)
        {
            return 24L + l;
        }
        if (l >= 24L)
        {
            return l - 24L;
        } else
        {
            return l;
        }
    }

    public static String getUserFormattedTime(long l, String s, Context context)
    {
        boolean flag = DateFormat.is24HourFormat(context);
        context = new Date(l);
        if (flag)
        {
            return TwcDateFormatter.formatHmm(context, s);
        } else
        {
            return TwcDateFormatter.formathmm(context, s);
        }
    }

    public static String getUserFormattedTime(long l, String s, boolean flag)
    {
        Date date = new Date(l);
        if (flag)
        {
            return TwcDateFormatter.formatHmm(date, s);
        } else
        {
            return TwcDateFormatter.formathmm(date, s);
        }
    }

    public static boolean isSameDay(TimeZone timezone, long l, long l1)
    {
        Preconditions.checkNotNull(timezone);
        Calendar calendar = Calendar.getInstance(timezone);
        calendar.setTimeInMillis(l);
        timezone = Calendar.getInstance(timezone);
        timezone.setTimeInMillis(l1);
        return calendar.get(1) == timezone.get(1) && calendar.get(6) == timezone.get(6);
    }
}

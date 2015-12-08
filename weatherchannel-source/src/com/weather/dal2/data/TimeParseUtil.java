// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.common.base.Preconditions;
import com.weather.util.date.TwcDateFormatter;
import com.weather.util.date.TwcDateParser;
import com.weather.util.time.TimeOfDay;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class TimeParseUtil
{

    private TimeParseUtil()
    {
    }

    public static CharSequence convertTimeTwelveOrTwentyFourHourFormat(TimeOfDay timeofday, Context context)
    {
        Calendar calendar = Calendar.getInstance();
        timeofday.putTime(calendar);
        if (DateFormat.is24HourFormat(context))
        {
            return TwcDateFormatter.formatHmm(calendar);
        } else
        {
            return TwcDateFormatter.formathmm(calendar);
        }
    }

    public static long getTimeFromGMTObservationDateAndTimeComponents(String s, String s1)
    {
        boolean flag1 = true;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        boolean flag;
        if (s.length() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (s1.length() == 6)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        i = Integer.parseInt(s.substring(0, 4));
        j = Integer.parseInt(s.substring(4, 6));
        k = Integer.parseInt(s.substring(6));
        l = Integer.parseInt(s1.substring(0, 2));
        i1 = Integer.parseInt(s1.substring(2, 4));
        j1 = Integer.parseInt(s1.substring(4));
        s = Calendar.getInstance(Locale.getDefault());
        s.setTimeZone(TimeZone.getTimeZone("GMT"));
        s.set(i, j - 1, k, l, i1, j1);
        return s.getTimeInMillis();
    }

    public static long getTimeWithUpdatedHourAndMinute(long l, int i, int j, TimeZone timezone)
    {
        timezone = Calendar.getInstance(timezone);
        timezone.setTimeInMillis(l);
        timezone.set(11, i);
        timezone.set(12, j);
        return timezone.getTimeInMillis();
    }

    public static Long gmtTextToLocalTimeSeconds(String s, Long long1)
    {
        s = TwcDateParser.parseISO(s);
        if (s != null)
        {
            long1 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(s.getTime()));
        }
        return long1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.util;

import com.stripe.android.time.Clock;
import java.util.Calendar;
import java.util.Locale;

public class DateUtils
{

    public DateUtils()
    {
    }

    public static boolean hasMonthPassed(int i, int j)
    {
        Calendar calendar = Clock.getCalendarInstance();
        return hasYearPassed(i) || normalizeYear(i) == calendar.get(1) && j < calendar.get(2) + 1;
    }

    public static boolean hasYearPassed(int i)
    {
        return normalizeYear(i) < Clock.getCalendarInstance().get(1);
    }

    private static int normalizeYear(int i)
    {
        int j = i;
        if (i < 100)
        {
            j = i;
            if (i >= 0)
            {
                String s = String.valueOf(Clock.getCalendarInstance().get(1));
                s = s.substring(0, s.length() - 2);
                j = Integer.parseInt(String.format(Locale.US, "%s%02d", new Object[] {
                    s, Integer.valueOf(i)
                }));
            }
        }
        return j;
    }
}

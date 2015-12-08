// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.date;

import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Pattern;

public class Day
{

    private static final String BIRTHDAY_FORMAT = "%d-%s-%s";
    private static final String TAG = "Day";
    private final String dateString;
    private final int dayOfMonth;
    private final int dayOfWeek;
    private final int monthOfYear;
    private final int year;

    public Day(int i, int j, int k)
    {
        this(((Calendar) (new GregorianCalendar(i, j, k))));
    }

    public Day(Calendar calendar)
    {
        year = calendar.get(1);
        monthOfYear = calendar.get(2);
        dayOfMonth = calendar.get(5);
        dayOfWeek = calendar.get(7);
        dateString = String.format(Locale.US, "%d-%s-%s", new Object[] {
            Integer.valueOf(year), formatDateOrMonth(monthOfYear + 1), formatDateOrMonth(dayOfMonth)
        });
    }

    private static String formatDateOrMonth(int i)
    {
        if (i <= 9)
        {
            return (new StringBuilder()).append("0").append(i).toString();
        } else
        {
            return String.valueOf(i);
        }
    }

    public static Day now()
    {
        return new Day(Calendar.getInstance());
    }

    public static Day valueOf(CharSequence charsequence)
    {
        try
        {
            charsequence = Pattern.compile("-").split(charsequence);
            if (charsequence.length == 3)
            {
                return new Day(Integer.parseInt(charsequence[0]), Integer.parseInt(charsequence[1]) - 1, Integer.parseInt(charsequence[2]));
            }
            LogUtil.d("Day", LoggingMetaTags.TWC_GENERAL, "Date string needs to have three parts", new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            LogUtil.d("Day", LoggingMetaTags.TWC_GENERAL, "Unable to parse date string", new Object[] {
                charsequence
            });
        }
        return null;
    }

    public boolean equals(Object obj)
    {
        boolean flag2 = true;
        boolean flag3 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag3;
            if (obj != null)
            {
                flag = flag3;
                if (getClass() == obj.getClass())
                {
                    obj = (Day)obj;
                    flag = flag3;
                    if (year == ((Day) (obj)).year)
                    {
                        flag = flag3;
                        if (monthOfYear == ((Day) (obj)).monthOfYear)
                        {
                            boolean flag1;
                            if (dayOfMonth == ((Day) (obj)).dayOfMonth)
                            {
                                flag1 = flag2;
                            } else
                            {
                                flag1 = false;
                            }
                            return flag1;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int getAge()
    {
        return getAge(now());
    }

    int getAge(Day day)
    {
        int i;
label0:
        {
            int j = day.year - year;
            if (day.monthOfYear >= monthOfYear)
            {
                i = j;
                if (day.monthOfYear != monthOfYear)
                {
                    break label0;
                }
                i = j;
                if (day.dayOfMonth >= dayOfMonth)
                {
                    break label0;
                }
            }
            i = j - 1;
        }
        return i;
    }

    public int getDayOfMonth()
    {
        return dayOfMonth;
    }

    public int getDayOfWeek()
    {
        return dayOfWeek;
    }

    public int getMonthOfYear()
    {
        return monthOfYear;
    }

    public int getYear()
    {
        return year;
    }

    public int hashCode()
    {
        return (year * 31 + monthOfYear) * 31 + dayOfMonth;
    }

    public String toString()
    {
        return dateString;
    }
}

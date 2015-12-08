// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.isodate;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class IsoDate
{

    public static final int DATE = 1;
    public static final int DATE_TIME = 3;
    public static final int TIME = 2;

    public IsoDate()
    {
    }

    public static String dateToString(Date date, int i)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        calendar.setTime(date);
        date = new StringBuffer();
        if ((i & 1) != 0)
        {
            int j = calendar.get(1);
            dd(date, j / 100);
            dd(date, j % 100);
            date.append('-');
            dd(date, calendar.get(2) + 0 + 1);
            date.append('-');
            dd(date, calendar.get(5));
            if (i == 3)
            {
                date.append("T");
            }
        }
        if ((i & 2) != 0)
        {
            dd(date, calendar.get(11));
            date.append(':');
            dd(date, calendar.get(12));
            date.append(':');
            dd(date, calendar.get(13));
            date.append('.');
            i = calendar.get(14);
            date.append((char)(i / 100 + 48));
            dd(date, i % 100);
            date.append('Z');
        }
        return date.toString();
    }

    static void dd(StringBuffer stringbuffer, int i)
    {
        stringbuffer.append((char)(i / 10 + 48));
        stringbuffer.append((char)(i % 10 + 48));
    }

    public static Date stringToDate(String s, int i)
    {
        Calendar calendar;
        int j;
        int k;
        char c;
        calendar = Calendar.getInstance();
        if ((i & 1) != 0)
        {
            calendar.set(1, Integer.parseInt(s.substring(0, 4)));
            calendar.set(2, (Integer.parseInt(s.substring(5, 7)) - 1) + 0);
            calendar.set(5, Integer.parseInt(s.substring(8, 10)));
            if (i != 3 || s.length() < 11)
            {
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                return calendar.getTime();
            }
            s = s.substring(11);
        } else
        {
            calendar.setTime(new Date(0L));
        }
        calendar.set(11, Integer.parseInt(s.substring(0, 2)));
        calendar.set(12, Integer.parseInt(s.substring(3, 5)));
        calendar.set(13, Integer.parseInt(s.substring(6, 8)));
        k = 8;
        if (8 >= s.length() || s.charAt(8) != '.') goto _L2; else goto _L1
_L1:
        j = 0;
        i = 100;
_L7:
        k++;
        c = s.charAt(k);
        if (c >= '0' && c <= '9') goto _L4; else goto _L3
_L3:
        calendar.set(14, j);
_L5:
        if (k < s.length())
        {
            if (s.charAt(k) == '+' || s.charAt(k) == '-')
            {
                calendar.setTimeZone(TimeZone.getTimeZone((new StringBuilder()).append("GMT").append(s.substring(k)).toString()));
            } else
            {
label0:
                {
                    if (s.charAt(k) != 'Z')
                    {
                        break label0;
                    }
                    calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
                }
            }
        }
        return calendar.getTime();
_L4:
        j += (c - 48) * i;
        i /= 10;
        continue; /* Loop/switch isn't completed */
_L2:
        calendar.set(14, 0);
          goto _L5
        throw new RuntimeException("illegal time format!");
        if (true) goto _L7; else goto _L6
_L6:
    }
}

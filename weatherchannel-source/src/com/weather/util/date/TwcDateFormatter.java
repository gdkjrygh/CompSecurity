// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.date;

import android.text.TextUtils;
import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TwcDateFormatter
{

    public static final ThreadLocal EEE = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEE");
        }

    };
    public static final ThreadLocal EEEE = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEEE");
        }

    };
    public static final ThreadLocal EEEE_MMMMMd = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEEE, MMMM d");
        }

    };
    public static final ThreadLocal EEEE_dMMMMM = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEEE, d. MMMM");
        }

    };
    public static final ThreadLocal EEEE_d_de_MMMMM = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEEE, d 'de' MMMM");
        }

    };
    public static final ThreadLocal EEEE_d_de_MMMMM_de_yyyy = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
        }

    };
    public static final ThreadLocal EEE_MMMdhmmazzz = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEE, MMM d h:mm a zzz");
        }

    };
    public static final ThreadLocal EEEhmmazzz = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEE, h:mm a zzz");
        }

    };
    public static final ThreadLocal H = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("H:00");
        }

    };
    private static final Pattern HHMM_PATTERN = Pattern.compile("([+-])([01]\\d|2[0-4]):([0-5]\\d)");
    public static final ThreadLocal Hmm = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("H:mm");
        }

    };
    public static final ThreadLocal ISO8601 = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        }

    };
    public static final ThreadLocal MMMMMd = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("MMMM d");
        }

    };
    public static final ThreadLocal M_d = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("M/d");
        }

    };
    public static final String NO_OFFSET = "+00:00";
    public static final String TAG = "TwcDateFormatter";
    public static final ThreadLocal dMMMMM = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("d. MMMM");
        }

    };
    public static final ThreadLocal ddeMMMMM = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("d 'de' MMMM");
        }

    };
    public static final ThreadLocal h = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("h a");
        }

    };
    public static final ThreadLocal hmm = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("h:mm a");
        }

    };

    private TwcDateFormatter()
    {
    }

    public static String format(Date date, String s, ThreadLocal threadlocal)
    {
        threadlocal = (DateFormat)threadlocal.get();
        threadlocal.setTimeZone(TimeZone.getTimeZone((new StringBuilder()).append("GMT").append(s).toString()));
        return threadlocal.format(date);
    }

    public static String format(Date date, TimeZone timezone, ThreadLocal threadlocal)
    {
        threadlocal = (DateFormat)threadlocal.get();
        threadlocal.setTimeZone(timezone);
        return threadlocal.format(date);
    }

    public static String formatDDeM(Date date, String s)
    {
        return format(date, s, ddeMMMMM);
    }

    public static String formatDM(Date date, String s)
    {
        return format(date, s, dMMMMM);
    }

    public static String formatEEE(Date date, String s)
    {
        return format(date, s, EEE);
    }

    public static String formatEEEE(Date date, String s)
    {
        return format(date, s, EEEE);
    }

    public static String formatEEEEMMMMd(Date date, String s)
    {
        return format(date, s, EEEE_MMMMMd);
    }

    public static String formatEEEEdDeMMMM(Date date, String s)
    {
        return format(date, s, EEEE_d_de_MMMMM);
    }

    public static String formatEEEEdDeMMMMDeYYYY(Date date, String s)
    {
        return format(date, s, EEEE_d_de_MMMMM_de_yyyy);
    }

    public static String formatEEEEdMMMM(Date date, String s)
    {
        return format(date, s, EEEE_dMMMMM);
    }

    public static String formatH(Date date, String s)
    {
        return format(date, s, H);
    }

    public static String formatHmm(Calendar calendar)
    {
        return format(calendar.getTime(), calendar.getTimeZone(), Hmm);
    }

    public static String formatHmm(Date date, String s)
    {
        return format(date, s, Hmm);
    }

    public static String formatISO8601(Date date, TimeZone timezone)
    {
        return format(date, timezone, ISO8601);
    }

    public static String formatM(Date date, String s)
    {
        return format(date, s, MMMMMd);
    }

    public static String formatMd(Date date, TimeZone timezone)
    {
        return format(date, timezone, M_d);
    }

    public static String formath(Date date, String s)
    {
        return format(date, s, h);
    }

    public static String formathmm(Calendar calendar)
    {
        return format(calendar.getTime(), calendar.getTimeZone(), hmm);
    }

    public static String formathmm(Date date, String s)
    {
        return format(date, s, hmm);
    }

    public static String getTimeOffset(String s)
    {
        if (s == null)
        {
            return "+00:00";
        }
        Object obj = null;
        String s1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            if (s.endsWith("Z"))
            {
                return "+00:00";
            }
            int i = s.length();
            s1 = obj;
            if (i >= 6)
            {
                s1 = s.substring(i - 6);
                Matcher matcher = HHMM_PATTERN.matcher(s1);
                if (matcher.matches())
                {
                    return matcher.group();
                }
            }
        }
        Log.w("TwcDateFormatter", (new StringBuilder()).append("invalid time offset. offset='").append(s1).append("' date='").append(s).append('\'').toString());
        return "+00:00";
    }

}

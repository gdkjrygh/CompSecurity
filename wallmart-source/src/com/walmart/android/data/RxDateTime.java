// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class RxDateTime
{

    public static final transient String DATE_PATTERN = "yyyy-MM-dd";
    public static final transient String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final transient String TIME_PATTERN = "HH:mm:ss";
    public static final transient SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd");
    public static final transient SimpleDateFormat dfDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final transient SimpleDateFormat dfTime = new SimpleDateFormat("HH:mm:ss");
    private static final long serialVersionUID = 1L;
    private final GregorianCalendar calendar;
    private final String dateTime;
    private final String tzId;

    public RxDateTime()
    {
        this(((Calendar) (new GregorianCalendar())));
    }

    public RxDateTime(String s)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        try
        {
            gregoriancalendar.setTime(dfDateTime.parse(s.replaceAll("T", " ")));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gregoriancalendar.clear();
        }
        calendar = (GregorianCalendar)gregoriancalendar;
        dateTime = dfDateTime.format(gregoriancalendar.getTime()).replaceAll(" ", "T");
        tzId = "";
    }

    public RxDateTime(Calendar calendar1)
    {
        if (calendar1 != null)
        {
            calendar = (GregorianCalendar)calendar1;
            String s = dfDate.format(calendar1.getTime());
            String s1 = dfTime.format(calendar1.getTime());
            calendar1 = calendar1.getTimeZone();
            String s2 = String.format("%03d00", new Object[] {
                Integer.valueOf(calendar1.getRawOffset() / 1000 / 60 / 60)
            });
            dateTime = (new StringBuilder()).append(s).append("T").append(s1).append(s2).toString();
            tzId = calendar1.getID();
            return;
        } else
        {
            calendar = null;
            dateTime = "";
            tzId = "";
            return;
        }
    }

    public static Date fromDateString(String s)
    {
        try
        {
            s = dfDate.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static Calendar fromDateTimeString(String s)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        try
        {
            gregoriancalendar.setTime(dfDateTime.parse(s.replaceAll("T", " ")));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return gregoriancalendar;
    }

    public Calendar getCalendar()
    {
        return calendar;
    }

    public String getDateTime()
    {
        return dateTime;
    }

    public String getTzId()
    {
        return tzId;
    }

}

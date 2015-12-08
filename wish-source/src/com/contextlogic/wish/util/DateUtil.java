// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.contextlogic.wish.WishApplication;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtil
{

    private static final long DAY = 0x15180L;
    private static final long HOUR = 3600L;
    private static final long MINUTE = 60L;
    private static final long MONTH = 0x278d00L;
    private static final long SECOND = 1L;
    private static final long YEAR = 0x1da9c00L;

    public DateUtil()
    {
    }

    public static CharSequence format(CharSequence charsequence, Date date)
    {
        if (Locale.getDefault().getLanguage().equals(Locale.ENGLISH.toString()))
        {
            return DateFormat.format(charsequence, date);
        }
        if (charsequence.equals("MMM d"))
        {
            return DateFormat.getMediumDateFormat(WishApplication.getAppInstance()).format(date);
        } else
        {
            return DateFormat.format(charsequence, date);
        }
    }

    public static String getFuzzyDate(Date date, Date date1)
    {
        WishApplication wishapplication = WishApplication.getAppInstance();
        long l1 = Math.abs(date1.getTime() - date.getTime()) / 1000L;
        if (l1 < 60L)
        {
            if (l1 <= 2L)
            {
                return wishapplication.getResources().getString(0x7f0601f8);
            } else
            {
                return String.format(wishapplication.getResources().getString(0x7f0601f9), new Object[] {
                    Long.valueOf(l1)
                });
            }
        }
        if (l1 < 3540L)
        {
            int i = (int)Math.floor(l1 / 60L);
            if (i <= 1)
            {
                return wishapplication.getResources().getString(0x7f0601f4);
            } else
            {
                return String.format(wishapplication.getResources().getString(0x7f0601f5), new Object[] {
                    Integer.valueOf(i)
                });
            }
        }
        if (l1 < 0x15180L)
        {
            int j = (int)Math.floor(l1 / 3600L);
            if (j <= 1)
            {
                return wishapplication.getResources().getString(0x7f0601f2);
            } else
            {
                return String.format(wishapplication.getResources().getString(0x7f0601f3), new Object[] {
                    Integer.valueOf(j)
                });
            }
        }
        if (l1 < 0x278d00L)
        {
            int k = (int)Math.floor(l1 / 0x15180L);
            if (k <= 1)
            {
                return wishapplication.getResources().getString(0x7f0601f0);
            } else
            {
                return String.format(wishapplication.getResources().getString(0x7f0601f1), new Object[] {
                    Integer.valueOf(k)
                });
            }
        }
        if (l1 < 0x1da9c00L)
        {
            int l = (int)Math.floor(l1 / 0x278d00L);
            if (l <= 1)
            {
                return wishapplication.getResources().getString(0x7f0601f6);
            } else
            {
                return String.format(wishapplication.getResources().getString(0x7f0601f7), new Object[] {
                    Integer.valueOf(l)
                });
            }
        }
        int i1 = (int)Math.floor(l1 / 0x1da9c00L);
        if (i1 <= 1)
        {
            return wishapplication.getResources().getString(0x7f0601fa);
        } else
        {
            return String.format(wishapplication.getResources().getString(0x7f0601fb), new Object[] {
                Integer.valueOf(i1)
            });
        }
    }

    public static String getFuzzyDateFromNow(Date date)
    {
        return getFuzzyDate(date, new Date());
    }

    public static long[] getTimeDifferenceFromNow(Date date, long al[])
    {
        Date date1;
        long l;
        long l1;
        long l2;
        if (al == null || al.length != 3)
        {
            al = new long[3];
        }
        date1 = new Date();
        l1 = (date.getTime() - date1.getTime()) / 1000L;
        l = l1;
        if (l1 < 0L)
        {
            l = 0L;
        }
        l1 = l / 3600L;
        l -= 3600L * l1;
        l2 = l / 60L;
        al[0] = l1;
        al[1] = l2;
        al[2] = l - 60L * l2;
        return al;
    }

    public static Date parseIsoDate(String s)
        throws ParseException
    {
        return parseIsoDate(s, true);
    }

    public static Date parseIsoDate(String s, boolean flag)
        throws ParseException
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        if (flag)
        {
            simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        }
        return simpledateformat.parse(s.substring(0, 19));
    }
}

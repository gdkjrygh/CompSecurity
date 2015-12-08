// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.date;

import android.text.TextUtils;
import android.util.Log;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TwcDateParser
{

    private static final ThreadLocal ISOFormat = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZ", Locale.US);
        }

    };
    private static final ThreadLocal ISOFormatZ = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpledateformat;
        }

    };
    private static final ThreadLocal ISOFormatZZ = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ", Locale.US);
        }

    };
    private static final ThreadLocal MEDIUM_FORMAT = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        }

    };
    public static final String TAG = "TwcDateParser";

    private TwcDateParser()
    {
    }

    private static Date parse(String s, DateFormat dateformat)
    {
        try
        {
            s = dateformat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("TwcDateParser", s.toString(), s);
            return null;
        }
        return s;
    }

    public static Date parseISO(String s)
    {
        Object obj;
        if (TextUtils.isEmpty(s))
        {
            obj = null;
        } else
        {
            Date date;
            if (s.endsWith("Z"))
            {
                obj = ISOFormatZ;
            } else
            {
                obj = ISOFormatZZ;
            }
            date = parse(s, (DateFormat)((ThreadLocal) (obj)).get());
            obj = date;
            if (date == null)
            {
                return parse(s, (DateFormat)ISOFormat.get());
            }
        }
        return ((Date) (obj));
    }

    public static Date parseMediumDate(String s)
    {
        return parse(s, (DateFormat)MEDIUM_FORMAT.get());
    }

}

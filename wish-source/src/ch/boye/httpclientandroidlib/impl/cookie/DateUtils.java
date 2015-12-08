// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            DateParseException

public final class DateUtils
{
    static final class DateFormatHolder
    {

        private static final ThreadLocal THREADLOCAL_FORMATS = new ThreadLocal() {

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            protected SoftReference initialValue()
            {
                return new SoftReference(new HashMap());
            }

        };

        public static SimpleDateFormat formatFor(String s)
        {
            Object obj1 = (Map)((SoftReference)THREADLOCAL_FORMATS.get()).get();
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = new HashMap();
                THREADLOCAL_FORMATS.set(new SoftReference(obj));
            }
            SimpleDateFormat simpledateformat = (SimpleDateFormat)((Map) (obj)).get(s);
            obj1 = simpledateformat;
            if (simpledateformat == null)
            {
                obj1 = new SimpleDateFormat(s, Locale.US);
                ((SimpleDateFormat) (obj1)).setTimeZone(TimeZone.getTimeZone("GMT"));
                ((Map) (obj)).put(s, obj1);
            }
            return ((SimpleDateFormat) (obj1));
        }


        DateFormatHolder()
        {
        }
    }


    private static final String DEFAULT_PATTERNS[] = {
        "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE, dd MMM yyyy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"
    };
    private static final Date DEFAULT_TWO_DIGIT_YEAR_START;
    public static final TimeZone GMT;
    public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
    public static final String PATTERN_RFC1036 = "EEEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";

    private DateUtils()
    {
    }

    public static String formatDate(Date date)
    {
        return formatDate(date, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    public static String formatDate(Date date, String s)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("date is null");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("pattern is null");
        } else
        {
            return DateFormatHolder.formatFor(s).format(date);
        }
    }

    public static Date parseDate(String s)
        throws DateParseException
    {
        return parseDate(s, null, null);
    }

    public static Date parseDate(String s, String as[])
        throws DateParseException
    {
        return parseDate(s, as, null);
    }

    public static Date parseDate(String s, String as[], Date date)
        throws DateParseException
    {
        String as1[];
        int i;
        int j;
        if (s == null)
        {
            throw new IllegalArgumentException("dateValue is null");
        }
        as1 = as;
        if (as == null)
        {
            as1 = DEFAULT_PATTERNS;
        }
        as = date;
        if (date == null)
        {
            as = DEFAULT_TWO_DIGIT_YEAR_START;
        }
        date = s;
        if (s.length() > 1)
        {
            date = s;
            if (s.startsWith("'"))
            {
                date = s;
                if (s.endsWith("'"))
                {
                    date = s.substring(1, s.length() - 1);
                }
            }
        }
        j = as1.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = DateFormatHolder.formatFor(as1[i]);
        s.set2DigitYearStart(as);
        s = s.parse(date);
        return s;
        s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throw new DateParseException((new StringBuilder()).append("Unable to parse the date ").append(date).toString());
    }

    static 
    {
        GMT = TimeZone.getTimeZone("GMT");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(GMT);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        DEFAULT_TWO_DIGIT_YEAR_START = calendar.getTime();
    }
}

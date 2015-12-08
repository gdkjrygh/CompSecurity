// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.log;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.weather.util.log:
//            SystemLoggabilityProvider, LoggabilityProvider, LoggingMetaTags

public final class LogUtil
{

    private static final String TAG = "LogUtil";
    private static LoggabilityProvider loggabilityProvider = new SystemLoggabilityProvider();
    private static final Map scrollStateNames = ImmutableMap.of(Integer.valueOf(0), "SCROLL_STATE_IDLE", Integer.valueOf(1), "SCROLL_STATE_TOUCH_SCROLL", Integer.valueOf(2), "SCROLL_STATE_FLING");
    private static final Map visibilityNames = ImmutableMap.of(Integer.valueOf(0), "VISIBLE", Integer.valueOf(4), "INVISIBLE", Integer.valueOf(8), "GONE");

    private LogUtil()
    {
    }

    public static String bundleToString(Bundle bundle)
    {
        if (bundle == null)
        {
            return "null";
        }
        StringBuilder stringbuilder = new StringBuilder("Bundle{");
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); stringbuilder.append("\n ").append(s).append(" => ").append(bundle.get(s)).append(';'))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

    public static transient void d(String s, Iterable iterable, String s1, Object aobj[])
    {
        iterable = firstLoggable(iterable, 3);
        if (iterable != null)
        {
            Log.d(s, formatLog(s1, iterable, aobj));
        }
    }

    public static transient void e(String s, Iterable iterable, String s1, Object aobj[])
    {
        iterable = firstLoggable(iterable, 6);
        if (iterable != null)
        {
            Log.e(s, formatLog(s1, iterable, aobj));
        }
    }

    private static String firstLoggable(Iterable iterable, int j)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            String s = (String)iterable.next();
            if (loggabilityProvider.isLoggable(s, j))
            {
                return s;
            }
        }

        return null;
    }

    private static String formatLog(String s, String s1, Object aobj[])
    {
        s = (new StringBuilder()).append('(').append(s1).append(") ").append(s).toString();
        if (aobj.length == 0)
        {
            return s;
        } else
        {
            return String.format(s, aobj);
        }
    }

    public static String getScrollStateName(int j)
    {
        String s1 = (String)scrollStateNames.get(Integer.valueOf(j));
        String s = s1;
        if (s1 == null)
        {
            s = "SCROLL_STATE_UNKNOWN";
        }
        return s;
    }

    public static String getVisibilityName(int j)
    {
        String s1 = (String)visibilityNames.get(Integer.valueOf(j));
        String s = s1;
        if (s1 == null)
        {
            s = "VISIBILITY_UNKNOWN";
        }
        return s;
    }

    public static transient void i(String s, Iterable iterable, String s1, Object aobj[])
    {
        iterable = firstLoggable(iterable, 4);
        if (iterable != null)
        {
            Log.i(s, formatLog(s1, iterable, aobj));
        }
    }

    public static boolean isLoggable(Iterable iterable, int j)
    {
        return firstLoggable(iterable, j) != null;
    }

    public static void logToFile(String s)
    {
        if (!isLoggable(LoggingMetaTags.LOG_TO_FILE, 2))
        {
            break MISSING_BLOCK_LABEL_178;
        }
        Object obj;
        obj = new File(new File(Environment.getExternalStorageDirectory(), "logs"), "twc.log");
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).getParentFile().mkdir();
            ((File) (obj)).createNewFile();
        }
        obj = new OutputStreamWriter(new FileOutputStream(((File) (obj)), true), Charsets.UTF_8);
        String s1 = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US)).format(new Date(System.currentTimeMillis()));
        ((Writer) (obj)).write((new StringBuilder()).append('[').append(s1).append(" - ").append(System.currentTimeMillis()).append("]: ").toString());
        ((Writer) (obj)).write(s);
        ((Writer) (obj)).write(10);
        ((Writer) (obj)).flush();
        try
        {
            ((Writer) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("LogUtil", s.toString(), s);
        }
        break MISSING_BLOCK_LABEL_178;
        s;
        ((Writer) (obj)).close();
        throw s;
    }

    public static transient void method(String s, Iterable iterable, int j, String s1, Object aobj[])
    {
label0:
        {
            iterable = firstLoggable(iterable, j);
            if (iterable != null)
            {
                aobj = Joiner.on(", ").useForNull("null").join(aobj);
                iterable = String.format((new StringBuilder()).append('(').append(iterable).append(") ").append(s1).append("(%s)").toString(), new Object[] {
                    aobj
                });
                if (j != 3)
                {
                    break label0;
                }
                Log.d(s, iterable);
            }
            return;
        }
        if (j == 2)
        {
            Log.v(s, iterable);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Log level not allowed:").append(j).toString());
        }
    }

    public static transient void method(String s, Iterable iterable, String s1, Object aobj[])
    {
        method(s, iterable, 2, s1, aobj);
    }

    public static transient void method(String s, String s1, int j, String s2, Object aobj[])
    {
        method(s, ((Iterable) (ImmutableSet.of(s1))), j, s2, aobj);
    }

    public static transient void method(String s, String s1, String s2, Object aobj[])
    {
        method(s, ((Iterable) (ImmutableSet.of(s1))), 2, s2, aobj);
    }

    public static void setLoggabilityProvider(LoggabilityProvider loggabilityprovider)
    {
        Object obj = loggabilityprovider;
        if (loggabilityprovider == null)
        {
            obj = new SystemLoggabilityProvider();
        }
        loggabilityProvider = ((LoggabilityProvider) (obj));
    }

    public static transient void v(String s, Iterable iterable, String s1, Object aobj[])
    {
        iterable = firstLoggable(iterable, 2);
        if (iterable != null)
        {
            Log.v(s, formatLog(s1, iterable, aobj));
        }
    }

    public static transient void w(String s, Iterable iterable, String s1, Object aobj[])
    {
        iterable = firstLoggable(iterable, 5);
        if (iterable != null)
        {
            Log.w(s, formatLog(s1, iterable, aobj));
        }
    }

}

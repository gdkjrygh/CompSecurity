// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import android.util.Log;

public abstract class AniviaLog
{
    public static class DefaultAniviaLog extends AniviaLog
    {

        public void debug(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                Log.d(s, s1, throwable);
                return;
            } else
            {
                Log.d(s, s1);
                return;
            }
        }

        public void error(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                Log.e(s, s1, throwable);
                return;
            } else
            {
                Log.e(s, s1);
                return;
            }
        }

        public void info(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                Log.i(s, s1, throwable);
                return;
            } else
            {
                Log.i(s, s1);
                return;
            }
        }

        public void verbose(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                Log.v(s, s1, throwable);
                return;
            } else
            {
                Log.v(s, s1);
                return;
            }
        }

        public void warn(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                Log.w(s, s1, throwable);
                return;
            } else
            {
                Log.w(s, s1);
                return;
            }
        }

        public void whatTheFox(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                Log.wtf(s, s1, throwable);
                return;
            } else
            {
                Log.wtf(s, s1);
                return;
            }
        }

        public DefaultAniviaLog()
        {
        }
    }


    public static final String DEFAULT_TAG = "Anivia";
    private static volatile AniviaLog sInstance = new DefaultAniviaLog();

    public AniviaLog()
    {
    }

    public static void d(String s)
    {
        sInstance.debug("Anivia", s, null);
    }

    public static void d(String s, String s1)
    {
        sInstance.debug(s, s1, null);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        sInstance.debug(s, s1, throwable);
    }

    public static void e(String s)
    {
        sInstance.warn("Anivia", s, null);
    }

    public static void e(String s, String s1)
    {
        sInstance.warn(s, s1, null);
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        sInstance.warn(s, s1, throwable);
    }

    public static void i(String s)
    {
        sInstance.info("Anivia", s, null);
    }

    public static void i(String s, String s1)
    {
        sInstance.info(s, s1, null);
    }

    public static void i(String s, String s1, Throwable throwable)
    {
        sInstance.info(s, s1, throwable);
    }

    public static void setInstance(AniviaLog anivialog)
    {
        sInstance = anivialog;
    }

    public static void v(String s)
    {
        sInstance.verbose("Anivia", s, null);
    }

    public static void v(String s, String s1)
    {
        sInstance.verbose(s, s1, null);
    }

    public static void v(String s, String s1, Throwable throwable)
    {
        sInstance.verbose(s, s1, throwable);
    }

    public static void w(String s)
    {
        sInstance.warn("Anivia", s, null);
    }

    public static void w(String s, String s1)
    {
        sInstance.warn(s, s1, null);
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        sInstance.warn(s, s1, throwable);
    }

    public static void wtf(String s)
    {
        sInstance.whatTheFox("Anivia", s, null);
    }

    public static void wtf(String s, String s1)
    {
        sInstance.whatTheFox(s, s1, null);
    }

    public static void wtf(String s, String s1, Throwable throwable)
    {
        sInstance.whatTheFox(s, s1, throwable);
    }

    public abstract void debug(String s, String s1, Throwable throwable);

    public abstract void error(String s, String s1, Throwable throwable);

    public abstract void info(String s, String s1, Throwable throwable);

    public abstract void verbose(String s, String s1, Throwable throwable);

    public abstract void warn(String s, String s1, Throwable throwable);

    public abstract void whatTheFox(String s, String s1, Throwable throwable);

}

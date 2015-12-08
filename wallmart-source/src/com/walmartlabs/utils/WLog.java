// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.utils;


public class WLog
{
    public static interface LogListener
    {

        public abstract void d(String s, String s1);

        public abstract void e(String s, String s1);

        public abstract void e(String s, String s1, Throwable throwable);

        public abstract void i(String s, String s1);

        public abstract void v(String s, String s1);

        public abstract void w(String s, String s1);
    }


    public static final boolean LOGCAT_ENABLED = false;
    private static LogListener sLogListener;

    public WLog()
    {
    }

    public static void d(String s, String s1)
    {
        if (sLogListener != null)
        {
            sLogListener.d(s, s1);
        }
    }

    public static void e(String s, String s1)
    {
        if (sLogListener != null)
        {
            sLogListener.e(s, s1);
        }
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        if (sLogListener != null)
        {
            sLogListener.e(s, s1, throwable);
        }
    }

    public static void i(String s, String s1)
    {
        if (sLogListener != null)
        {
            sLogListener.i(s, s1);
        }
    }

    public static void setLogListener(LogListener loglistener)
    {
        sLogListener = loglistener;
    }

    public static void v(String s, String s1)
    {
        if (sLogListener != null)
        {
            sLogListener.v(s, s1);
        }
    }

    public static void w(String s, String s1)
    {
        if (sLogListener != null)
        {
            sLogListener.w(s, s1);
        }
    }
}

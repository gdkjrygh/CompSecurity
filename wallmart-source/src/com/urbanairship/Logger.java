// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.util.Log;

public class Logger
{

    public static String TAG = "UALib";
    public static int logLevel = 6;

    private Logger()
    {
    }

    public static void debug(String s)
    {
        if (logLevel <= 3 && s != null)
        {
            Log.d(TAG, s);
        }
    }

    public static void debug(String s, Throwable throwable)
    {
        if (logLevel <= 3 && s != null && throwable != null)
        {
            Log.d(TAG, s, throwable);
        }
    }

    public static void error(String s)
    {
        if (logLevel <= 6 && s != null)
        {
            Log.e(TAG, s);
        }
    }

    public static void error(String s, Throwable throwable)
    {
        if (logLevel <= 6 && s != null && throwable != null)
        {
            Log.e(TAG, s, throwable);
        }
    }

    public static void error(Throwable throwable)
    {
        if (logLevel <= 6 && throwable != null)
        {
            Log.e(TAG, "", throwable);
        }
    }

    public static void info(String s)
    {
        if (logLevel <= 4 && s != null)
        {
            Log.i(TAG, s);
        }
    }

    public static void info(String s, Throwable throwable)
    {
        if (logLevel <= 4 && s != null && throwable != null)
        {
            Log.i(TAG, s, throwable);
        }
    }

    public static void verbose(String s)
    {
        if (logLevel <= 2 && s != null)
        {
            Log.v(TAG, s);
        }
    }

    public static void warn(String s)
    {
        if (logLevel <= 5 && s != null)
        {
            Log.w(TAG, s);
        }
    }

    public static void warn(String s, Throwable throwable)
    {
        if (logLevel <= 5 && s != null && throwable != null)
        {
            Log.w(TAG, s, throwable);
        }
    }

    public static void warn(Throwable throwable)
    {
        if (logLevel <= 5 && throwable != null)
        {
            Log.w(TAG, throwable);
        }
    }

}

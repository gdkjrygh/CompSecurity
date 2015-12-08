// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


class Log
{

    static final String LOG_TAG = "GAV2";
    private static boolean debug;

    private Log()
    {
    }

    static int d(String s)
    {
        return android.util.Log.d("GAV2", formatMessage(s));
    }

    static int dDebug(String s)
    {
        if (debug)
        {
            return d(s);
        } else
        {
            return 0;
        }
    }

    static boolean debugEnabled()
    {
        return debug;
    }

    static int e(String s)
    {
        return android.util.Log.e("GAV2", formatMessage(s));
    }

    static int eDebug(String s)
    {
        if (debug)
        {
            return e(s);
        } else
        {
            return 0;
        }
    }

    private static String formatMessage(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    static int i(String s)
    {
        return android.util.Log.i("GAV2", formatMessage(s));
    }

    static int iDebug(String s)
    {
        if (debug)
        {
            return i(s);
        } else
        {
            return 0;
        }
    }

    static void setDebug(boolean flag)
    {
        debug = flag;
    }

    static int v(String s)
    {
        return android.util.Log.v("GAV2", formatMessage(s));
    }

    static int vDebug(String s)
    {
        if (debug)
        {
            return v(s);
        } else
        {
            return 0;
        }
    }

    static int w(String s)
    {
        return android.util.Log.w("GAV2", formatMessage(s));
    }

    static int wDebug(String s)
    {
        if (debug)
        {
            return w(s);
        } else
        {
            return 0;
        }
    }
}

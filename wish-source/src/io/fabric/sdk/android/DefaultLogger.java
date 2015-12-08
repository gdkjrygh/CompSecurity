// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.util.Log;

// Referenced classes of package io.fabric.sdk.android:
//            Logger

public class DefaultLogger
    implements Logger
{

    private int logLevel;

    public DefaultLogger()
    {
        logLevel = 4;
    }

    public DefaultLogger(int j)
    {
        logLevel = j;
    }

    public void d(String s, String s1)
    {
        d(s, s1, null);
    }

    public void d(String s, String s1, Throwable throwable)
    {
        if (isLoggable(s, 3))
        {
            Log.d(s, s1, throwable);
        }
    }

    public void e(String s, String s1)
    {
        e(s, s1, null);
    }

    public void e(String s, String s1, Throwable throwable)
    {
        if (isLoggable(s, 6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public int getLogLevel()
    {
        return logLevel;
    }

    public void i(String s, String s1)
    {
        i(s, s1, null);
    }

    public void i(String s, String s1, Throwable throwable)
    {
        if (isLoggable(s, 4))
        {
            Log.i(s, s1, throwable);
        }
    }

    public boolean isLoggable(String s, int j)
    {
        return logLevel <= j;
    }

    public void log(int j, String s, String s1)
    {
        log(j, s, s1, false);
    }

    public void log(int j, String s, String s1, boolean flag)
    {
        if (flag || isLoggable(s, j))
        {
            Log.println(j, s, s1);
        }
    }

    public void setLogLevel(int j)
    {
        logLevel = j;
    }

    public void v(String s, String s1)
    {
        v(s, s1, null);
    }

    public void v(String s, String s1, Throwable throwable)
    {
        if (isLoggable(s, 2))
        {
            Log.v(s, s1, throwable);
        }
    }

    public void w(String s, String s1)
    {
        w(s, s1, null);
    }

    public void w(String s, String s1, Throwable throwable)
    {
        if (isLoggable(s, 5))
        {
            Log.w(s, s1, throwable);
        }
    }
}

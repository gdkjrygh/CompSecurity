// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.androidextra;

import android.util.Log;

public class HttpClientAndroidLog
{

    private boolean debugEnabled;
    private boolean errorEnabled;
    private boolean infoEnabled;
    private String logTag;
    private boolean traceEnabled;
    private boolean warnEnabled;

    public HttpClientAndroidLog(Object obj)
    {
        logTag = obj.toString();
        debugEnabled = false;
        errorEnabled = false;
        traceEnabled = false;
        warnEnabled = false;
        infoEnabled = false;
    }

    public void debug(Object obj)
    {
        if (isDebugEnabled())
        {
            Log.d(logTag, obj.toString());
        }
    }

    public void debug(Object obj, Throwable throwable)
    {
        if (isDebugEnabled())
        {
            Log.d(logTag, obj.toString(), throwable);
        }
    }

    public void enableDebug(boolean flag)
    {
        debugEnabled = flag;
    }

    public void enableError(boolean flag)
    {
        errorEnabled = flag;
    }

    public void enableInfo(boolean flag)
    {
        infoEnabled = flag;
    }

    public void enableTrace(boolean flag)
    {
        traceEnabled = flag;
    }

    public void enableWarn(boolean flag)
    {
        warnEnabled = flag;
    }

    public void error(Object obj)
    {
        if (isErrorEnabled())
        {
            Log.e(logTag, obj.toString());
        }
    }

    public void error(Object obj, Throwable throwable)
    {
        if (isErrorEnabled())
        {
            Log.e(logTag, obj.toString(), throwable);
        }
    }

    public void info(Object obj)
    {
        if (isInfoEnabled())
        {
            Log.i(logTag, obj.toString());
        }
    }

    public void info(Object obj, Throwable throwable)
    {
        if (isInfoEnabled())
        {
            Log.i(logTag, obj.toString(), throwable);
        }
    }

    public boolean isDebugEnabled()
    {
        return debugEnabled;
    }

    public boolean isErrorEnabled()
    {
        return errorEnabled;
    }

    public boolean isInfoEnabled()
    {
        return infoEnabled;
    }

    public boolean isTraceEnabled()
    {
        return traceEnabled;
    }

    public boolean isWarnEnabled()
    {
        return warnEnabled;
    }

    public void trace(Object obj)
    {
        if (isTraceEnabled())
        {
            Log.i(logTag, obj.toString());
        }
    }

    public void trace(Object obj, Throwable throwable)
    {
        if (isTraceEnabled())
        {
            Log.i(logTag, obj.toString(), throwable);
        }
    }

    public void warn(Object obj)
    {
        if (isWarnEnabled())
        {
            Log.w(logTag, obj.toString());
        }
    }

    public void warn(Object obj, Throwable throwable)
    {
        if (isWarnEnabled())
        {
            Log.w(logTag, obj.toString(), throwable);
        }
    }
}

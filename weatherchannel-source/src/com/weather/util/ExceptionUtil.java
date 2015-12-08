// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import android.util.Log;
import com.google.common.base.Preconditions;
import com.weather.util.net.NetworkUnavailableException;

public final class ExceptionUtil
{

    private ExceptionUtil()
    {
    }

    static String getCauseMessage(String s, Throwable throwable)
    {
        return (new StringBuilder()).append(s).append(" cause: ").append(throwable).toString();
    }

    public static void logExceptionError(String s, String s1, Throwable throwable)
    {
        Throwable throwable1 = rootCause(throwable);
        Log.e(s, getCauseMessage(s1, throwable1));
        if (!(throwable1 instanceof NetworkUnavailableException))
        {
            Log.e(s, s1, throwable);
        }
    }

    public static void logExceptionWarning(String s, String s1, Throwable throwable)
    {
        Log.w(s, getCauseMessage(s1, rootCause(throwable)));
    }

    public static Throwable rootCause(Throwable throwable)
    {
        Throwable throwable1 = (Throwable)Preconditions.checkNotNull(throwable);
        for (throwable = throwable.getCause(); throwable != null; throwable = throwable.getCause())
        {
            throwable1 = throwable;
        }

        return throwable1;
    }
}

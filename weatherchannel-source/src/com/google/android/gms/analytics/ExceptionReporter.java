// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.zzae;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//            StandardExceptionParser, ExceptionParser, Tracker, GoogleAnalytics

public class ExceptionReporter
    implements Thread.UncaughtExceptionHandler
{

    private final Context mContext;
    private final Thread.UncaughtExceptionHandler zzIp;
    private final Tracker zzIq;
    private ExceptionParser zzIr;
    private GoogleAnalytics zzIs;

    public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Context context)
    {
        if (tracker == null)
        {
            throw new NullPointerException("tracker cannot be null");
        }
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        zzIp = uncaughtexceptionhandler;
        zzIq = tracker;
        zzIr = new StandardExceptionParser(context, new ArrayList());
        mContext = context.getApplicationContext();
        context = (new StringBuilder()).append("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            tracker = "null";
        } else
        {
            tracker = uncaughtexceptionhandler.getClass().getName();
        }
        zzae.zzaB(context.append(tracker).toString());
    }

    public ExceptionParser getExceptionParser()
    {
        return zzIr;
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        zzIr = exceptionparser;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = "UncaughtException";
        if (zzIr != null)
        {
            if (thread != null)
            {
                obj = thread.getName();
            } else
            {
                obj = null;
            }
            obj = zzIr.getDescription(((String) (obj)), throwable);
        }
        zzae.zzaB((new StringBuilder()).append("Reporting uncaught exception: ").append(((String) (obj))).toString());
        zzIq.send((new HitBuilders.ExceptionBuilder()).setDescription(((String) (obj))).setFatal(true).build());
        obj = zzhg();
        ((GoogleAnalytics) (obj)).dispatchLocalHits();
        ((GoogleAnalytics) (obj)).zzhk();
        if (zzIp != null)
        {
            zzae.zzaB("Passing exception to the original handler");
            zzIp.uncaughtException(thread, throwable);
        }
    }

    GoogleAnalytics zzhg()
    {
        if (zzIs == null)
        {
            zzIs = GoogleAnalytics.getInstance(mContext);
        }
        return zzIs;
    }

    Thread.UncaughtExceptionHandler zzhh()
    {
        return zzIp;
    }
}

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
    private final Thread.UncaughtExceptionHandler zzKp;
    private final Tracker zzKq;
    private ExceptionParser zzKr;
    private GoogleAnalytics zzKs;

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
        zzKp = uncaughtexceptionhandler;
        zzKq = tracker;
        zzKr = new StandardExceptionParser(context, new ArrayList());
        mContext = context.getApplicationContext();
        context = (new StringBuilder()).append("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            tracker = "null";
        } else
        {
            tracker = uncaughtexceptionhandler.getClass().getName();
        }
        zzae.v(context.append(tracker).toString());
    }

    public ExceptionParser getExceptionParser()
    {
        return zzKr;
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        zzKr = exceptionparser;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = "UncaughtException";
        if (zzKr != null)
        {
            if (thread != null)
            {
                obj = thread.getName();
            } else
            {
                obj = null;
            }
            obj = zzKr.getDescription(((String) (obj)), throwable);
        }
        zzae.v((new StringBuilder()).append("Reporting uncaught exception: ").append(((String) (obj))).toString());
        zzKq.send((new HitBuilders.ExceptionBuilder()).setDescription(((String) (obj))).setFatal(true).build());
        obj = zzhu();
        ((GoogleAnalytics) (obj)).dispatchLocalHits();
        ((GoogleAnalytics) (obj)).zzhy();
        if (zzKp != null)
        {
            zzae.v("Passing exception to the original handler");
            zzKp.uncaughtException(thread, throwable);
        }
    }

    GoogleAnalytics zzhu()
    {
        if (zzKs == null)
        {
            zzKs = GoogleAnalytics.getInstance(mContext);
        }
        return zzKs;
    }

    Thread.UncaughtExceptionHandler zzhv()
    {
        return zzKp;
    }
}

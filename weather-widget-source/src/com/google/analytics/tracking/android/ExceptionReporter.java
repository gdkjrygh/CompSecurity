// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            Log, Tracker, ServiceManager, ExceptionParser

public class ExceptionReporter
    implements Thread.UncaughtExceptionHandler
{

    private ExceptionParser exceptionParser;
    private final Thread.UncaughtExceptionHandler originalHandler;
    private final ServiceManager serviceManager;
    private final Tracker tracker;

    public ExceptionReporter(Tracker tracker1, ServiceManager servicemanager, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        if (tracker1 == null)
        {
            throw new NullPointerException("tracker cannot be null");
        }
        if (servicemanager == null)
        {
            throw new NullPointerException("serviceManager cannot be null");
        }
        originalHandler = uncaughtexceptionhandler;
        tracker = tracker1;
        serviceManager = servicemanager;
        servicemanager = (new StringBuilder()).append("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            tracker1 = "null";
        } else
        {
            tracker1 = uncaughtexceptionhandler.getClass().getName();
        }
        Log.iDebug(servicemanager.append(tracker1).toString());
    }

    public ExceptionParser getExceptionParser()
    {
        return exceptionParser;
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        exceptionParser = exceptionparser;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        String s;
        if (exceptionParser == null)
        {
            s = throwable.getMessage();
        } else
        {
            if (thread != null)
            {
                s = thread.getName();
            } else
            {
                s = null;
            }
            s = exceptionParser.getDescription(s, throwable);
        }
        Log.iDebug((new StringBuilder()).append("Tracking Exception: ").append(s).toString());
        tracker.trackException(s, true);
        serviceManager.dispatch();
        if (originalHandler != null)
        {
            Log.iDebug("Passing exception to original handler.");
            originalHandler.uncaughtException(thread, throwable);
        }
    }
}

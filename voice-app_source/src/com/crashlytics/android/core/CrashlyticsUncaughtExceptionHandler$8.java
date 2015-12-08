// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, LogFileManager

class val.msg
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final String val$msg;
    final long val$timestamp;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        if (!CrashlyticsUncaughtExceptionHandler.access$300(CrashlyticsUncaughtExceptionHandler.this).get())
        {
            CrashlyticsUncaughtExceptionHandler.access$400(CrashlyticsUncaughtExceptionHandler.this).writeToLog(val$timestamp, val$msg);
        }
        return null;
    }

    ()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$timestamp = l;
        val$msg = String.this;
        super();
    }
}

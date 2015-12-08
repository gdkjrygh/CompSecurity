// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

class val.ex
    implements Runnable
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final Throwable val$ex;
    final Date val$now;
    final Thread val$thread;

    public void run()
    {
        if (!CrashlyticsUncaughtExceptionHandler.access$300(CrashlyticsUncaughtExceptionHandler.this).get())
        {
            CrashlyticsUncaughtExceptionHandler.access$500(CrashlyticsUncaughtExceptionHandler.this, val$now, val$thread, val$ex);
        }
    }

    ()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$now = date;
        val$thread = thread1;
        val$ex = Throwable.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            UncaughtExceptionHandlers

static final class runtime
    implements xceptionHandlers.Exiter
{

    private static final Logger logger = Logger.getLogger(com/google/common/util/concurrent/UncaughtExceptionHandlers$Exiter.getName());
    private final Runtime runtime;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        logger.log(Level.SEVERE, String.format("Caught an exception in %s.  Shutting down.", new Object[] {
            thread
        }), throwable);
        runtime.exit(1);
        return;
        thread;
        System.err.println(throwable.getMessage());
        System.err.println(thread.getMessage());
        runtime.exit(1);
        return;
        thread;
        runtime.exit(1);
        throw thread;
    }


    (Runtime runtime1)
    {
        runtime = runtime1;
    }
}

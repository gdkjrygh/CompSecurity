// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

// Referenced classes of package com.google.common.util.concurrent:
//            Callables

static final class val.task
    implements Runnable
{

    final Supplier val$nameSupplier;
    final Runnable val$task;

    public void run()
    {
        Thread thread;
        String s;
        boolean flag;
        thread = Thread.currentThread();
        s = thread.getName();
        flag = Callables.access$000((String)val$nameSupplier.get(), thread);
        val$task.run();
        if (flag)
        {
            Callables.access$000(s, thread);
        }
        return;
        Exception exception;
        exception;
        if (flag)
        {
            Callables.access$000(s, thread);
        }
        throw exception;
    }

    (Supplier supplier, Runnable runnable)
    {
        val$nameSupplier = supplier;
        val$task = runnable;
        super();
    }
}

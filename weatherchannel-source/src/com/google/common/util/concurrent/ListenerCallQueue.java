// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

final class ListenerCallQueue
    implements Runnable
{
    static abstract class Callback
    {

        private final String methodCall;

        abstract void call(Object obj);

        void enqueueOn(Iterable iterable)
        {
            for (iterable = iterable.iterator(); iterable.hasNext(); ((ListenerCallQueue)iterable.next()).add(this)) { }
        }


        Callback(String s)
        {
            methodCall = s;
        }
    }


    private static final Logger logger = Logger.getLogger(com/google/common/util/concurrent/ListenerCallQueue.getName());
    private final Executor executor;
    private boolean isThreadScheduled;
    private final Object listener;
    private final Queue waitQueue = Queues.newArrayDeque();

    ListenerCallQueue(Object obj, Executor executor1)
    {
        listener = Preconditions.checkNotNull(obj);
        executor = (Executor)Preconditions.checkNotNull(executor1);
    }

    void add(Callback callback)
    {
        this;
        JVM INSTR monitorenter ;
        waitQueue.add(callback);
        this;
        JVM INSTR monitorexit ;
        return;
        callback;
        throw callback;
    }

    void execute()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (isThreadScheduled)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        isThreadScheduled = true;
        flag = true;
        this;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        executor.execute(this);
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorenter ;
        isThreadScheduled = false;
        this;
        JVM INSTR monitorexit ;
        Logger logger1 = logger;
        Level level = Level.SEVERE;
        String s = String.valueOf(String.valueOf(listener));
        String s1 = String.valueOf(String.valueOf(executor));
        logger1.log(level, (new StringBuilder(s.length() + 42 + s1.length())).append("Exception while running callbacks for ").append(s).append(" on ").append(s1).toString(), ((Throwable) (obj)));
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void run()
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
_L3:
        boolean flag = flag1;
        this;
        JVM INSTR monitorenter ;
        flag = flag2;
        Preconditions.checkState(isThreadScheduled);
        flag = flag2;
        Object obj1 = (Callback)waitQueue.poll();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        flag = flag2;
        isThreadScheduled = false;
        flag = false;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        isThreadScheduled = false;
        this;
        JVM INSTR monitorexit ;
_L2:
        return;
        flag = flag2;
        this;
        JVM INSTR monitorexit ;
        flag = flag1;
        ((Callback) (obj1)).call(listener);
          goto _L3
        Object obj;
        obj;
        flag = flag1;
        Logger logger1 = logger;
        flag = flag1;
        Level level = Level.SEVERE;
        flag = flag1;
        String s = String.valueOf(String.valueOf(listener));
        flag = flag1;
        obj1 = String.valueOf(String.valueOf(((Callback) (obj1)).methodCall));
        flag = flag1;
        logger1.log(level, (new StringBuilder(s.length() + 37 + ((String) (obj1)).length())).append("Exception while executing callback: ").append(s).append(".").append(((String) (obj1))).toString(), ((Throwable) (obj)));
          goto _L3
        obj;
        if (!flag) goto _L5; else goto _L4
_L4:
        this;
        JVM INSTR monitorenter ;
        isThreadScheduled = false;
        this;
        JVM INSTR monitorexit ;
_L5:
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

}

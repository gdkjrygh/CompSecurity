// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

final class SerializingExecutor
    implements Executor
{
    private class TaskRunner
        implements Runnable
    {

        final SerializingExecutor this$0;

        public void run()
        {
            boolean flag1;
            boolean flag2;
            flag2 = true;
            flag1 = true;
_L1:
            boolean flag = flag1;
            Preconditions.checkState(isThreadScheduled);
            flag = flag1;
            Object obj1 = internalLock;
            flag = flag1;
            obj1;
            JVM INSTR monitorenter ;
            flag = flag2;
            obj = (Runnable)waitQueue.poll();
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            flag = flag2;
            isThreadScheduled = false;
            flag = false;
            obj1;
            JVM INSTR monitorexit ;
            if (false)
            {
                synchronized (internalLock)
                {
                    isThreadScheduled = false;
                }
            }
            return;
            flag = flag2;
            obj1;
            JVM INSTR monitorexit ;
            flag = flag1;
            ((Runnable) (obj)).run();
              goto _L1
            obj1;
            flag = flag1;
            Logger logger = SerializingExecutor.log;
            flag = flag1;
            Level level = Level.SEVERE;
            flag = flag1;
            obj = String.valueOf(String.valueOf(obj));
            flag = flag1;
            logger.log(level, (new StringBuilder(((String) (obj)).length() + 35)).append("Exception while executing runnable ").append(((String) (obj))).toString(), ((Throwable) (obj1)));
              goto _L1
            obj1;
            if (flag)
            {
                synchronized (internalLock)
                {
                    isThreadScheduled = false;
                }
            }
            throw obj1;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
        }

        private TaskRunner()
        {
            this$0 = SerializingExecutor.this;
            super();
        }

    }


    private static final Logger log = Logger.getLogger(com/google/common/util/concurrent/SerializingExecutor.getName());
    private final Executor executor;
    private final Object internalLock = new Object() {

        final SerializingExecutor this$0;

        public String toString()
        {
            String s = String.valueOf(super.toString());
            if (s.length() != 0)
            {
                return "SerializingExecutor lock: ".concat(s);
            } else
            {
                return new String("SerializingExecutor lock: ");
            }
        }

            
            {
                this$0 = SerializingExecutor.this;
                super();
            }
    };
    private boolean isThreadScheduled;
    private final TaskRunner taskRunner = new TaskRunner();
    private final Queue waitQueue = new ArrayDeque();

    public SerializingExecutor(Executor executor1)
    {
        isThreadScheduled = false;
        Preconditions.checkNotNull(executor1, "'executor' must not be null.");
        executor = executor1;
    }

    public void execute(Runnable runnable)
    {
        boolean flag;
        Preconditions.checkNotNull(runnable, "'r' must not be null.");
        flag = false;
        Object obj = internalLock;
        obj;
        JVM INSTR monitorenter ;
        waitQueue.add(runnable);
        if (isThreadScheduled)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        isThreadScheduled = true;
        flag = true;
        obj;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        executor.execute(taskRunner);
        if (false)
        {
            synchronized (internalLock)
            {
                isThreadScheduled = false;
            }
        }
        return;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        if (true)
        {
            synchronized (internalLock)
            {
                isThreadScheduled = false;
            }
        }
        throw exception1;
        exception2;
        runnable;
        JVM INSTR monitorexit ;
        throw exception2;
    }




/*
    static boolean access$102(SerializingExecutor serializingexecutor, boolean flag)
    {
        serializingexecutor.isThreadScheduled = flag;
        return flag;
    }

*/



}

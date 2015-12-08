// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public abstract class AbstractFuture
    implements Future
{
    static final class Sync extends AbstractQueuedSynchronizer
    {

        static final int CANCELLED = 4;
        static final int COMPLETED = 2;
        static final int COMPLETING = 1;
        static final int INTERRUPTED = 8;
        static final int RUNNING = 0;
        private static final long serialVersionUID = 0L;
        private Throwable exception;
        private Object value;

        private boolean complete(Object obj, Throwable throwable, int i)
        {
            boolean flag = compareAndSetState(0, 1);
            if (flag)
            {
                value = obj;
                if ((i & 0xc) != 0)
                {
                    throwable = new CancellationException("Future.cancel() was called.");
                }
                exception = throwable;
                releaseShared(i);
            } else
            if (getState() == 1)
            {
                acquireShared(-1);
                return flag;
            }
            return flag;
        }

        private Object getValue()
            throws CancellationException, ExecutionException
        {
            int i = getState();
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Error, synchronizer in invalid state: ").append(i).toString());

            case 2: // '\002'
                if (exception != null)
                {
                    throw new ExecutionException(exception);
                } else
                {
                    return value;
                }

            case 4: // '\004'
            case 8: // '\b'
                throw AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", exception);
            }
        }

        boolean cancel(boolean flag)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 4;
            }
            return complete(null, null, byte0);
        }

        Object get()
            throws CancellationException, ExecutionException, InterruptedException
        {
            acquireSharedInterruptibly(-1);
            return getValue();
        }

        Object get(long l)
            throws TimeoutException, CancellationException, ExecutionException, InterruptedException
        {
            if (!tryAcquireSharedNanos(-1, l))
            {
                throw new TimeoutException("Timeout waiting for task.");
            } else
            {
                return getValue();
            }
        }

        boolean isCancelled()
        {
            return (getState() & 0xc) != 0;
        }

        boolean isDone()
        {
            return (getState() & 0xe) != 0;
        }

        boolean set(Object obj)
        {
            return complete(obj, null, 2);
        }

        boolean setException(Throwable throwable)
        {
            return complete(null, throwable, 2);
        }

        protected int tryAcquireShared(int i)
        {
            return !isDone() ? -1 : 1;
        }

        protected boolean tryReleaseShared(int i)
        {
            setState(i);
            return true;
        }

        boolean wasInterrupted()
        {
            return getState() == 8;
        }

        Sync()
        {
        }
    }


    private final Sync sync = new Sync();

    protected AbstractFuture()
    {
    }

    static final CancellationException cancellationExceptionWithCause(String s, Throwable throwable)
    {
        s = new CancellationException(s);
        s.initCause(throwable);
        return s;
    }

    public boolean cancel(boolean flag)
    {
        if (!sync.cancel(flag))
        {
            return false;
        }
        if (flag)
        {
            interruptTask();
        }
        return true;
    }

    public Object get()
        throws InterruptedException, ExecutionException
    {
        return sync.get();
    }

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, TimeoutException, ExecutionException
    {
        return sync.get(timeunit.toNanos(l));
    }

    protected void interruptTask()
    {
    }

    public boolean isCancelled()
    {
        return sync.isCancelled();
    }

    public boolean isDone()
    {
        return sync.isDone();
    }

    protected boolean set(Object obj)
    {
        return sync.set(obj);
    }

    protected boolean setException(Throwable throwable)
    {
        if (throwable == null)
        {
            throw new NullPointerException();
        } else
        {
            return sync.setException(throwable);
        }
    }

    protected final boolean wasInterrupted()
    {
        return sync.wasInterrupted();
    }
}

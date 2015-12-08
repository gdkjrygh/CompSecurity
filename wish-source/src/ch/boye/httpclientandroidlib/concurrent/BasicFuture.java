// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package ch.boye.httpclientandroidlib.concurrent:
//            Cancellable, FutureCallback

public class BasicFuture
    implements Cancellable, Future
{

    private final FutureCallback callback;
    private volatile boolean cancelled;
    private volatile boolean completed;
    private volatile Exception ex;
    private volatile Object result;

    public BasicFuture(FutureCallback futurecallback)
    {
        callback = futurecallback;
    }

    private Object getResult()
        throws ExecutionException
    {
        if (ex != null)
        {
            throw new ExecutionException(ex);
        } else
        {
            return result;
        }
    }

    public boolean cancel()
    {
        return cancel(true);
    }

    public boolean cancel(boolean flag)
    {
        flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = completed;
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        completed = true;
        cancelled = true;
        if (callback != null)
        {
            callback.cancelled();
        }
        notifyAll();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean completed(Object obj)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = completed;
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        completed = true;
        result = obj;
        if (callback != null)
        {
            callback.completed(obj);
        }
        notifyAll();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public boolean failed(Exception exception)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = completed;
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        completed = true;
        ex = exception;
        if (callback != null)
        {
            callback.failed(exception);
        }
        notifyAll();
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public Object get()
        throws InterruptedException, ExecutionException
    {
        this;
        JVM INSTR monitorenter ;
        while (!completed) 
        {
            wait();
        }
        break MISSING_BLOCK_LABEL_21;
        Exception exception;
        exception;
        throw exception;
        Object obj = getResult();
        this;
        JVM INSTR monitorexit ;
        return obj;
    }

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        this;
        JVM INSTR monitorenter ;
        long l3 = timeunit.toMillis(l);
        if (l3 > 0L) goto _L2; else goto _L1
_L1:
        l = 0L;
_L5:
        long l2 = l3;
        if (!completed) goto _L4; else goto _L3
_L3:
        timeunit = ((TimeUnit) (getResult()));
_L6:
        this;
        JVM INSTR monitorexit ;
        return timeunit;
_L2:
        l = System.currentTimeMillis();
          goto _L5
_L4:
        long l1;
        l1 = l2;
        if (l2 > 0L)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        throw new TimeoutException();
        timeunit;
        this;
        JVM INSTR monitorexit ;
        throw timeunit;
_L8:
label0:
        {
            wait(l1);
            if (!completed)
            {
                break label0;
            }
            timeunit = ((TimeUnit) (getResult()));
        }
          goto _L6
        l2 = l3 - (System.currentTimeMillis() - l);
        l1 = l2;
        if (l2 > 0L) goto _L8; else goto _L7
_L7:
        throw new TimeoutException();
          goto _L5
    }

    public boolean isCancelled()
    {
        return cancelled;
    }

    public boolean isDone()
    {
        return completed;
    }
}

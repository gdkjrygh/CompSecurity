// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            RouteSpecificPool

public class WaitingThread
{

    private boolean aborted;
    private final Condition cond;
    private final RouteSpecificPool pool;
    private Thread waiter;

    public WaitingThread(Condition condition, RouteSpecificPool routespecificpool)
    {
        if (condition == null)
        {
            throw new IllegalArgumentException("Condition must not be null.");
        } else
        {
            cond = condition;
            pool = routespecificpool;
            return;
        }
    }

    public boolean await(Date date)
        throws InterruptedException
    {
        if (waiter != null)
        {
            throw new IllegalStateException((new StringBuilder()).append("A thread is already waiting on this object.\ncaller: ").append(Thread.currentThread()).append("\nwaiter: ").append(waiter).toString());
        }
        if (aborted)
        {
            throw new InterruptedException("Operation interrupted");
        }
        waiter = Thread.currentThread();
        if (date == null) goto _L2; else goto _L1
_L1:
        boolean flag = cond.awaitUntil(date);
_L3:
        if (aborted)
        {
            throw new InterruptedException("Operation interrupted");
        }
        break MISSING_BLOCK_LABEL_126;
        date;
        waiter = null;
        throw date;
_L2:
        cond.await();
        flag = true;
          goto _L3
        waiter = null;
        return flag;
    }

    public final Condition getCondition()
    {
        return cond;
    }

    public final RouteSpecificPool getPool()
    {
        return pool;
    }

    public final Thread getThread()
    {
        return waiter;
    }

    public void interrupt()
    {
        aborted = true;
        cond.signalAll();
    }

    public void wakeup()
    {
        if (waiter == null)
        {
            throw new IllegalStateException("Nobody waiting on this object.");
        } else
        {
            cond.signalAll();
            return;
        }
    }
}

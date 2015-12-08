// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.monitor;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package org.apache.commons.io.monitor:
//            FileAlterationObserver

public final class FileAlterationMonitor
    implements Runnable
{

    private final long interval;
    private final List observers;
    private volatile boolean running;
    private Thread thread;
    private ThreadFactory threadFactory;

    public FileAlterationMonitor()
    {
        this(10000L);
    }

    public FileAlterationMonitor(long l)
    {
        observers = new CopyOnWriteArrayList();
        thread = null;
        running = false;
        interval = l;
    }

    public transient FileAlterationMonitor(long l, FileAlterationObserver afilealterationobserver[])
    {
        this(l);
        if (afilealterationobserver != null)
        {
            int j = afilealterationobserver.length;
            for (int i = 0; i < j; i++)
            {
                addObserver(afilealterationobserver[i]);
            }

        }
    }

    public void addObserver(FileAlterationObserver filealterationobserver)
    {
        if (filealterationobserver != null)
        {
            observers.add(filealterationobserver);
        }
    }

    public long getInterval()
    {
        return interval;
    }

    public Iterable getObservers()
    {
        return observers;
    }

    public void removeObserver(FileAlterationObserver filealterationobserver)
    {
        if (filealterationobserver != null)
        {
            while (observers.remove(filealterationobserver)) ;
        }
    }

    public void run()
    {
        do
        {
label0:
            {
                if (running)
                {
                    for (Iterator iterator = observers.iterator(); iterator.hasNext(); ((FileAlterationObserver)iterator.next()).checkAndNotify()) { }
                    if (running)
                    {
                        break label0;
                    }
                }
                return;
            }
            try
            {
                Thread.sleep(interval);
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }

    public void setThreadFactory(ThreadFactory threadfactory)
    {
        this;
        JVM INSTR monitorenter ;
        threadFactory = threadfactory;
        this;
        JVM INSTR monitorexit ;
        return;
        threadfactory;
        throw threadfactory;
    }

    public void start()
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        if (running)
        {
            throw new IllegalStateException("Monitor is already running");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        for (Iterator iterator = observers.iterator(); iterator.hasNext(); ((FileAlterationObserver)iterator.next()).initialize()) { }
        running = true;
        if (threadFactory == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        thread = threadFactory.newThread(this);
_L1:
        thread.start();
        this;
        JVM INSTR monitorexit ;
        return;
        thread = new Thread(this);
          goto _L1
    }

    public void stop()
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        stop(interval);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stop(long l)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        if (!running)
        {
            throw new IllegalStateException("Monitor is not running");
        }
        break MISSING_BLOCK_LABEL_24;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        running = false;
        thread.join(l);
_L2:
        for (Iterator iterator = observers.iterator(); iterator.hasNext(); ((FileAlterationObserver)iterator.next()).destroy()) { }
        break MISSING_BLOCK_LABEL_81;
        iterator;
        Thread.currentThread().interrupt();
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }
}

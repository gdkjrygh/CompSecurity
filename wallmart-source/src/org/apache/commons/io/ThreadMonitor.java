// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;


class ThreadMonitor
    implements Runnable
{

    private final Thread thread;
    private final long timeout;

    private ThreadMonitor(Thread thread1, long l)
    {
        thread = thread1;
        timeout = l;
    }

    public static Thread start(long l)
    {
        return start(Thread.currentThread(), l);
    }

    public static Thread start(Thread thread1, long l)
    {
        Thread thread2 = null;
        if (l > 0L)
        {
            thread2 = new Thread(new ThreadMonitor(thread1, l), org/apache/commons/io/ThreadMonitor.getSimpleName());
            thread2.setDaemon(true);
            thread2.start();
        }
        return thread2;
    }

    public static void stop(Thread thread1)
    {
        if (thread1 != null)
        {
            thread1.interrupt();
        }
    }

    public void run()
    {
        try
        {
            Thread.sleep(timeout);
            thread.interrupt();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}

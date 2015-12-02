// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal.cflowstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.aspectj.runtime.internal.cflowstack:
//            ThreadCounter

public class ThreadCounterImpl11
    implements ThreadCounter
{
    static class Counter
    {

        protected int value;

        Counter()
        {
            value = 0;
        }
    }


    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Counter cached_counter;
    private Thread cached_thread;
    private int change_count;
    private Hashtable counters;

    public ThreadCounterImpl11()
    {
        counters = new Hashtable();
        change_count = 0;
    }

    private Counter getThreadCounter()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (Thread.currentThread() == cached_thread)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        cached_thread = Thread.currentThread();
        cached_counter = (Counter)counters.get(cached_thread);
        if (cached_counter == null)
        {
            cached_counter = new Counter();
            counters.put(cached_thread, cached_counter);
        }
        change_count = change_count + 1;
        int i = Math.max(1, counters.size());
        if (change_count <= Math.max(100, 20000 / i))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj = new ArrayList();
        Enumeration enumeration = counters.keys();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            Thread thread1 = (Thread)enumeration.nextElement();
            if (!thread1.isAlive())
            {
                ((List) (obj)).add(thread1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_170;
        obj;
        throw obj;
        Thread thread;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); counters.remove(thread))
        {
            thread = (Thread)((Iterator) (obj)).next();
        }

        change_count = 0;
        obj = cached_counter;
        this;
        JVM INSTR monitorexit ;
        return ((Counter) (obj));
    }

    public void dec()
    {
        Counter counter = getThreadCounter();
        counter.value = counter.value - 1;
    }

    public void inc()
    {
        Counter counter = getThreadCounter();
        counter.value = counter.value + 1;
    }

    public boolean isNotZero()
    {
        return getThreadCounter().value != 0;
    }

    public void removeThreadCounter()
    {
    }
}

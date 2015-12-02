// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal.cflowstack;

import java.util.Stack;

// Referenced classes of package org.aspectj.runtime.internal.cflowstack:
//            ThreadStackFactory, ThreadCounter, ThreadStack

public class ThreadStackFactoryImpl
    implements ThreadStackFactory
{
    private static class ThreadCounterImpl extends ThreadLocal
        implements ThreadCounter
    {

        public void dec()
        {
            Counter counter = getThreadCounter();
            counter.value = counter.value - 1;
        }

        public Counter getThreadCounter()
        {
            return (Counter)get();
        }

        public void inc()
        {
            Counter counter = getThreadCounter();
            counter.value = counter.value + 1;
        }

        public Object initialValue()
        {
            return new Counter();
        }

        public boolean isNotZero()
        {
            return getThreadCounter().value != 0;
        }

        public void removeThreadCounter()
        {
            remove();
        }

        private ThreadCounterImpl()
        {
        }

    }

    static class ThreadCounterImpl.Counter
    {

        protected int value;

        ThreadCounterImpl.Counter()
        {
            value = 0;
        }
    }

    private static class ThreadStackImpl extends ThreadLocal
        implements ThreadStack
    {

        public Stack getThreadStack()
        {
            return (Stack)get();
        }

        public Object initialValue()
        {
            return new Stack();
        }

        public void removeThreadStack()
        {
            remove();
        }

        private ThreadStackImpl()
        {
        }

    }


    public ThreadStackFactoryImpl()
    {
    }

    public ThreadCounter getNewThreadCounter()
    {
        return new ThreadCounterImpl();
    }

    public ThreadStack getNewThreadStack()
    {
        return new ThreadStackImpl();
    }
}

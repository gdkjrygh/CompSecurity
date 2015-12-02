// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal.cflowstack;


// Referenced classes of package org.aspectj.runtime.internal.cflowstack:
//            ThreadCounter, ThreadStackFactoryImpl

private static class <init> extends ThreadLocal
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

    private Counter.value()
    {
    }

    Counter.value(Counter.value value)
    {
        this();
    }
}

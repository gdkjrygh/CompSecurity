// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal.cflowstack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

// Referenced classes of package org.aspectj.runtime.internal.cflowstack:
//            ThreadStack

public class ThreadStackImpl11
    implements ThreadStack
{

    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Stack cached_stack;
    private Thread cached_thread;
    private int change_count;
    private Hashtable stacks;

    public ThreadStackImpl11()
    {
        stacks = new Hashtable();
        change_count = 0;
    }

    public Stack getThreadStack()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (Thread.currentThread() == cached_thread)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        cached_thread = Thread.currentThread();
        cached_stack = (Stack)stacks.get(cached_thread);
        if (cached_stack == null)
        {
            cached_stack = new Stack();
            stacks.put(cached_thread, cached_stack);
        }
        change_count = change_count + 1;
        int i = Math.max(1, stacks.size());
        if (change_count <= Math.max(100, 20000 / i))
        {
            break MISSING_BLOCK_LABEL_209;
        }
        obj = new Stack();
        Enumeration enumeration = stacks.keys();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            Thread thread1 = (Thread)enumeration.nextElement();
            if (!thread1.isAlive())
            {
                ((Stack) (obj)).push(thread1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_168;
        obj;
        throw obj;
        Thread thread;
        for (obj = ((Vector) (obj)).elements(); ((Enumeration) (obj)).hasMoreElements(); stacks.remove(thread))
        {
            thread = (Thread)((Enumeration) (obj)).nextElement();
        }

        change_count = 0;
        obj = cached_stack;
        this;
        JVM INSTR monitorexit ;
        return ((Stack) (obj));
    }

    public void removeThreadStack()
    {
    }
}

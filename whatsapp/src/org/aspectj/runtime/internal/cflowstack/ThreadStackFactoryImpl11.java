// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal.cflowstack;


// Referenced classes of package org.aspectj.runtime.internal.cflowstack:
//            ThreadStackFactory, ThreadCounterImpl11, ThreadStackImpl11, ThreadCounter, 
//            ThreadStack

public class ThreadStackFactoryImpl11
    implements ThreadStackFactory
{

    public ThreadStackFactoryImpl11()
    {
    }

    public ThreadCounter getNewThreadCounter()
    {
        return new ThreadCounterImpl11();
    }

    public ThreadStack getNewThreadStack()
    {
        return new ThreadStackImpl11();
    }
}

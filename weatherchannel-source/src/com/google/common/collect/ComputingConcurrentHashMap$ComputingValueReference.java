// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap, MapMakerInternalMap

private static final class computingFunction
    implements computingFunction
{

    volatile computedReference computedReference;
    final Function computingFunction;

    public void clear(computingFunction computingfunction)
    {
        setValueReference(computingfunction);
    }

    Object compute(Object obj, int i)
        throws ExecutionException
    {
        try
        {
            obj = computingFunction.apply(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            setValueReference(new rence(((Throwable) (obj))));
            throw new ExecutionException(((Throwable) (obj)));
        }
        setValueReference(new (obj));
        return obj;
    }

    public  copyFor(ReferenceQueue referencequeue, Object obj,  )
    {
        return this;
    }

    public Object get()
    {
        return null;
    }

    public  getEntry()
    {
        return null;
    }

    public boolean isComputingReference()
    {
        return true;
    }

    void setValueReference( )
    {
        this;
        JVM INSTR monitorenter ;
        if (computedReference == MapMakerInternalMap.UNSET)
        {
            computedReference = ;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ;
        this;
        JVM INSTR monitorexit ;
        throw ;
    }

    public Object waitForValue()
        throws ExecutionException
    {
        if (computedReference != MapMakerInternalMap.UNSET) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        flag = flag1;
_L5:
        computedReference computedreference;
        computedReference computedreference1;
        computedreference = computedReference;
        computedreference1 = MapMakerInternalMap.UNSET;
        if (computedreference != computedreference1) goto _L4; else goto _L3
_L3:
        Exception exception;
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception)
        {
            flag = true;
        }
        finally { }
        if (true) goto _L5; else goto _L4
_L4:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
_L2:
        return computedReference.computedReference();
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw exception;
    }

    public rence(Function function)
    {
        computedReference = MapMakerInternalMap.unset();
        computingFunction = function;
    }
}

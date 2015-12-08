// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap

private static final class t
    implements t
{

    final Throwable t;

    public void clear(t t1)
    {
    }

    public t copyFor(ReferenceQueue referencequeue, Object obj, t t1)
    {
        return this;
    }

    public Object get()
    {
        return null;
    }

    public t getEntry()
    {
        return null;
    }

    public boolean isComputingReference()
    {
        return false;
    }

    public Object waitForValue()
        throws ExecutionException
    {
        throw new ExecutionException(t);
    }

    (Throwable throwable)
    {
        t = throwable;
    }
}

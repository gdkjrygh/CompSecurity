// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap

private static final class value
    implements value
{

    final Object value;

    public void clear(value value1)
    {
    }

    public value copyFor(ReferenceQueue referencequeue, Object obj, value value1)
    {
        return this;
    }

    public Object get()
    {
        return value;
    }

    public value getEntry()
    {
        return null;
    }

    public boolean isComputingReference()
    {
        return false;
    }

    public Object waitForValue()
    {
        return get();
    }

    (Object obj)
    {
        value = obj;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator

public abstract class AbstractSequentialIterator extends UnmodifiableIterator
{

    private Object nextOrNull;

    protected AbstractSequentialIterator(Object obj)
    {
        nextOrNull = obj;
    }

    protected abstract Object computeNext(Object obj);

    public final boolean hasNext()
    {
        return nextOrNull != null;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        Object obj = nextOrNull;
        nextOrNull = computeNext(nextOrNull);
        return obj;
        Exception exception;
        exception;
        nextOrNull = computeNext(nextOrNull);
        throw exception;
    }
}

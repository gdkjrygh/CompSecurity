// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static class next extends WeakReference
    implements ntry
{

    final int hash;
    final ntry next;
    volatile ence valueReference;

    public long getAccessTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return hash;
    }

    public Object getKey()
    {
        return get();
    }

    public ntry getNext()
    {
        return next;
    }

    public ntry getNextInAccessQueue()
    {
        throw new UnsupportedOperationException();
    }

    public ntry getNextInWriteQueue()
    {
        throw new UnsupportedOperationException();
    }

    public ntry getPreviousInAccessQueue()
    {
        throw new UnsupportedOperationException();
    }

    public ntry getPreviousInWriteQueue()
    {
        throw new UnsupportedOperationException();
    }

    public ence getValueReference()
    {
        return valueReference;
    }

    public long getWriteTime()
    {
        throw new UnsupportedOperationException();
    }

    public void setAccessTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextInAccessQueue(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextInWriteQueue(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousInAccessQueue(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousInWriteQueue(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(ence ence)
    {
        valueReference = ence;
    }

    public void setWriteTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    ntry(ReferenceQueue referencequeue, Object obj, int i, ntry ntry)
    {
        super(obj, referencequeue);
        valueReference = LocalCache.unset();
        hash = i;
        next = ntry;
    }
}

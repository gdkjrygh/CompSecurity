// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            ForwardingQueue

public final class EvictingQueue extends ForwardingQueue
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Queue _flddelegate;
    final int maxSize;

    private EvictingQueue(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "maxSize (%s) must >= 0", new Object[] {
            Integer.valueOf(i)
        });
        _flddelegate = new ArrayDeque(i);
        maxSize = i;
    }

    public static EvictingQueue create(int i)
    {
        return new EvictingQueue(i);
    }

    public boolean add(Object obj)
    {
        Preconditions.checkNotNull(obj);
        if (maxSize == 0)
        {
            return true;
        }
        if (size() == maxSize)
        {
            _flddelegate.remove();
        }
        _flddelegate.add(obj);
        return true;
    }

    public boolean addAll(Collection collection)
    {
        return standardAddAll(collection);
    }

    public boolean contains(Object obj)
    {
        return _mthdelegate().contains(Preconditions.checkNotNull(obj));
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Queue _mthdelegate()
    {
        return _flddelegate;
    }

    public boolean offer(Object obj)
    {
        return add(obj);
    }

    public int remainingCapacity()
    {
        return maxSize - size();
    }

    public boolean remove(Object obj)
    {
        return _mthdelegate().remove(Preconditions.checkNotNull(obj));
    }
}

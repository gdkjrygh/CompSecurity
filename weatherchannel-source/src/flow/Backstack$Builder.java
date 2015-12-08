// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

// Referenced classes of package flow:
//            Backstack

public static final class <init>
{

    private final Deque backstack;
    private long highestId;

    public <init> addAll(Collection collection)
    {
        Object obj;
        Deque deque;
        long l;
        for (collection = collection.iterator(); collection.hasNext(); deque.push(new nit>(l, obj, null)))
        {
            obj = collection.next();
            deque = backstack;
            l = highestId + 1L;
            highestId = l;
        }

        return this;
    }

    public Backstack build()
    {
        if (backstack.isEmpty())
        {
            throw new IllegalStateException("Backstack may not be empty");
        } else
        {
            return new Backstack(highestId, backstack, null);
        }
    }

    public backstack clear()
    {
        backstack.clear();
        return this;
    }

    public backstack pop()
    {
        return (backstack)backstack.pop();
    }

    public backstack push(Object obj)
    {
        Deque deque = backstack;
        long l = highestId + 1L;
        highestId = l;
        deque.push(new nit>(l, obj, null));
        return this;
    }

    private xception(long l, Collection collection)
    {
        highestId = l;
        backstack = new ArrayDeque(collection);
    }

    nit>(long l, Collection collection, nit> nit>)
    {
        this(l, collection);
    }
}

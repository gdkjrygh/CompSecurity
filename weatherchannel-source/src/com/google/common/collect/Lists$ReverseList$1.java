// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Lists, CollectPreconditions

class val.forwardIterator
    implements ListIterator
{

    boolean canRemoveOrSet;
    final val.forwardIterator this$0;
    final ListIterator val$forwardIterator;

    public void add(Object obj)
    {
        val$forwardIterator.add(obj);
        val$forwardIterator.previous();
        canRemoveOrSet = false;
    }

    public boolean hasNext()
    {
        return val$forwardIterator.hasPrevious();
    }

    public boolean hasPrevious()
    {
        return val$forwardIterator.hasNext();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            canRemoveOrSet = true;
            return val$forwardIterator.previous();
        }
    }

    public int nextIndex()
    {
        return cess._mth000(this._cls0.this, val$forwardIterator.nextIndex());
    }

    public Object previous()
    {
        if (!hasPrevious())
        {
            throw new NoSuchElementException();
        } else
        {
            canRemoveOrSet = true;
            return val$forwardIterator.next();
        }
    }

    public int previousIndex()
    {
        return nextIndex() - 1;
    }

    public void remove()
    {
        CollectPreconditions.checkRemove(canRemoveOrSet);
        val$forwardIterator.remove();
        canRemoveOrSet = false;
    }

    public void set(Object obj)
    {
        Preconditions.checkState(canRemoveOrSet);
        val$forwardIterator.set(obj);
    }

    ()
    {
        this$0 = final_;
        val$forwardIterator = ListIterator.this;
        super();
    }
}

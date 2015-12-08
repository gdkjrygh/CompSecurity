// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            TreeMultiset, GeneralRange, CollectPreconditions

class prevEntry
    implements Iterator
{

    lNode current;
    lNode prevEntry;
    final TreeMultiset this$0;

    public boolean hasNext()
    {
        if (current == null)
        {
            return false;
        }
        if (TreeMultiset.access$1300(TreeMultiset.this).tooLow(current.getElement()))
        {
            current = null;
            return false;
        } else
        {
            return true;
        }
    }

    public current next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        lNode lnode = TreeMultiset.access$1400(TreeMultiset.this, current);
        prevEntry = lnode;
        if (lNode.access._mth1100(current) == TreeMultiset.access$1500(TreeMultiset.this))
        {
            current = null;
            return lnode;
        } else
        {
            current = lNode.access._mth1100(current);
            return lnode;
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        boolean flag;
        if (prevEntry != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CollectPreconditions.checkRemove(flag);
        setCount(prevEntry.getElement(), 0);
        prevEntry = null;
    }

    lNode()
    {
        this$0 = TreeMultiset.this;
        super();
        current = TreeMultiset.access$1600(TreeMultiset.this);
        prevEntry = null;
    }
}

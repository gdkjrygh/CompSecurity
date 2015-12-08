// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingIterator, ConcurrentHashMultiset, CollectPreconditions

class  extends ForwardingIterator
{

    private last last;
    final ConcurrentHashMultiset this$0;
    final Iterator val$readOnlyIterator;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Iterator _mthdelegate()
    {
        return val$readOnlyIterator;
    }

    public val.readOnlyIterator next()
    {
        last = (last)super.next();
        return last;
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        boolean flag;
        if (last != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CollectPreconditions.checkRemove(flag);
        setCount(last.(), 0);
        last = null;
    }

    ()
    {
        this$0 = final_concurrenthashmultiset;
        val$readOnlyIterator = Iterator.this;
        super();
    }
}

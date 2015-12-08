// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            LinkedHashMultimap, CollectPreconditions

class this._cls1
    implements Iterator
{

    int expectedModCount;
    k nextEntry;
    final k this$1;
    k toRemove;

    private void checkForComodification()
    {
        if (cess._mth100(this._cls1.this) != expectedModCount)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    public boolean hasNext()
    {
        checkForComodification();
        return nextEntry != this._cls1.this;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            this._cls1 _lcls1 = (hasNext)nextEntry;
            Object obj = _lcls1.getValue();
            toRemove = _lcls1;
            nextEntry = _lcls1.getSuccessorInValueSet();
            return obj;
        }
    }

    public void remove()
    {
        checkForComodification();
        boolean flag;
        if (toRemove != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CollectPreconditions.checkRemove(flag);
        move(toRemove.getValue());
        expectedModCount = cess._mth100(this._cls1.this);
        toRemove = null;
    }

    k()
    {
        this$1 = this._cls1.this;
        super();
        nextEntry = cess._mth000(this._cls1.this);
        expectedModCount = cess._mth100(this._cls1.this);
    }
}

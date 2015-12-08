// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingObject

public abstract class ForwardingIterator extends ForwardingObject
    implements Iterator
{

    protected ForwardingIterator()
    {
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract Iterator _mthdelegate();

    public boolean hasNext()
    {
        return _mthdelegate().hasNext();
    }

    public Object next()
    {
        return _mthdelegate().next();
    }

    public void remove()
    {
        _mthdelegate().remove();
    }
}

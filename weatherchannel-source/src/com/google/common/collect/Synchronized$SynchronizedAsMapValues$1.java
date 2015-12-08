// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingIterator, Synchronized

class val.iterator extends ForwardingIterator
{

    final tex this$0;
    final Iterator val$iterator;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Iterator _mthdelegate()
    {
        return val$iterator;
    }

    public volatile Object next()
    {
        return next();
    }

    public Collection next()
    {
        return Synchronized.access$400((Collection)super.next(), tex);
    }

    ()
    {
        this$0 = final_;
        val$iterator = Iterator.this;
        super();
    }
}

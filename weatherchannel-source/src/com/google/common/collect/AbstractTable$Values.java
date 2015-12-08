// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractTable

class this._cls0 extends AbstractCollection
{

    final AbstractTable this$0;

    public void clear()
    {
        AbstractTable.this.clear();
    }

    public boolean contains(Object obj)
    {
        return containsValue(obj);
    }

    public Iterator iterator()
    {
        return valuesIterator();
    }

    public int size()
    {
        return AbstractTable.this.size();
    }

    ()
    {
        this$0 = AbstractTable.this;
        super();
    }
}

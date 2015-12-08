// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

class Set extends Set
{

    final LinkedListMultimap this$0;

    public boolean contains(Object obj)
    {
        return containsKey(obj);
    }

    public Iterator iterator()
    {
        return new stinctKeyIterator(LinkedListMultimap.this, null);
    }

    public boolean remove(Object obj)
    {
        return !removeAll(obj).isEmpty();
    }

    public int size()
    {
        return LinkedListMultimap.access$600(LinkedListMultimap.this).size();
    }

    stinctKeyIterator()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }
}

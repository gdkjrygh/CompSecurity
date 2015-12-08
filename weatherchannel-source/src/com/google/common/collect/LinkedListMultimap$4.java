// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

class this._cls0 extends AbstractSequentialList
{

    final LinkedListMultimap this$0;

    public ListIterator listIterator(int i)
    {
        return new deIterator(LinkedListMultimap.this, i);
    }

    public int size()
    {
        return LinkedListMultimap.access$900(LinkedListMultimap.this);
    }

    deIterator()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }
}

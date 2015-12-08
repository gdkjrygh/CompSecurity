// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

class val.key extends AbstractSequentialList
{

    final LinkedListMultimap this$0;
    final Object val$key;

    public ListIterator listIterator(int i)
    {
        return new lueForKeyIterator(LinkedListMultimap.this, val$key, i);
    }

    public int size()
    {
        yList ylist = (yList)LinkedListMultimap.access$600(LinkedListMultimap.this).get(val$key);
        if (ylist == null)
        {
            return 0;
        } else
        {
            return ylist.count;
        }
    }

    yList()
    {
        this$0 = final_linkedlistmultimap;
        val$key = Object.this;
        super();
    }
}

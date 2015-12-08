// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, TreeBasedTable

class <init> extends AbstractIterator
{

    Object lastValue;
    final TreeBasedTable this$0;
    final Comparator val$comparator;
    final Iterator val$merged;

    protected Object computeNext()
    {
        while (val$merged.hasNext()) 
        {
            Object obj = val$merged.next();
            boolean flag;
            if (lastValue != null && val$comparator.compare(obj, lastValue) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                lastValue = obj;
                return lastValue;
            }
        }
        lastValue = null;
        return endOfData();
    }

    ()
    {
        this$0 = final_treebasedtable;
        val$merged = iterator;
        val$comparator = Comparator.this;
        super();
    }
}
